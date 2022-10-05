package com.dmw.crm.service.impl;

import com.dmw.base.BaseService;
import com.dmw.crm.dao.UserMapper;
import com.dmw.crm.dto.User;
import com.dmw.crm.model.UserModel;
import com.dmw.crm.service.UserService;
import com.dmw.crm.utils.AssertUtil;
import com.dmw.crm.utils.Md5Util;
import com.dmw.crm.utils.UserIDBase64;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author woaixiejuan
 * @description 针对表【t_user】的数据库操作Service实现
 * @createDate 2022-10-05 09:55:29
 */
@Service
public class UserServiceImpl extends BaseService<User,Integer> implements UserService {
    @Resource
    private UserMapper userMapper;
    /**
     * 1.参数校验
     *   用户名 非空
     *   密码 非空
     * 2.根据用户名 查询用户记录
     * 3.校验用户存在性
     *     不存在 -->记录不存在 方法结束
     * 4.用户存在
     *     校验密码
     *       密码错误-->密码不正确 方法结束
     * 5.密码正确
     *     用户登录成功 返回用户相关信息
     */
    @Override
    public UserModel login(String userName, String password) {
        checkLoginParams(userName,password);
        User user = userMapper.queryUserByUserName(userName);
        AssertUtil.isTrue(null==user||user.getIsValid()==0,"用户已注销或不存在!");
        AssertUtil.isTrue(user.getUserPwd().equals(Md5Util.encode(password)),"密码错误!");
        return buildUserModelInfo(user);
    }

    private UserModel buildUserModelInfo(User user) {
        UserModel userModel = new UserModel();
      //  userModel.setUserId(user.getId());
        userModel.setUserIdStr(UserIDBase64.encoderUserID(user.getId()));
        userModel.setUserName(user.getUserName());
        userModel.setTrueName(user.getTrueName());
//        UserModel(UserIDBase64.encoderUserID(user.getId()),user.getUserName(),user.getTrueName());
        return userModel;
    }

    private void checkLoginParams(String userName, String password) {
        AssertUtil.isTrue(StringUtils.isBlank(userName),"用户名不能为空!");

        AssertUtil.isTrue(StringUtils.isBlank(password), "用户密码不能为空!");
    }
}
