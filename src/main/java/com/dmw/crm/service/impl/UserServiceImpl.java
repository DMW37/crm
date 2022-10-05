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
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author woaixiejuan
 * @description 针对表【t_user】的数据库操作Service实现
 * @createDate 2022-10-05 09:55:29
 */
@Service
public class UserServiceImpl extends BaseService<User, Integer> implements UserService {
    @Resource
    private UserMapper userMapper;

    /**
     * 1.参数校验
     * 用户名 非空
     * 密码 非空
     * 2.根据用户名 查询用户记录
     * 3.校验用户存在性
     * 不存在 -->记录不存在 方法结束
     * 4.用户存在
     * 校验密码
     * 密码错误-->密码不正确 方法结束
     * 5.密码正确
     * 用户登录成功 返回用户相关信息
     */
    @Override
    public UserModel login(String userName, String password) {
        checkLoginParams(userName, password);
        User user = userMapper.queryUserByUserName(userName);
        AssertUtil.isTrue(null == user || user.getIsValid() == 0, "用户已注销或不存在!");
        AssertUtil.isTrue(user.getUserPwd().equals(Md5Util.encode(password)), "密码错误!");
        return buildUserModelInfo(user);
    }
    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void updateUserPassword(int userId, String oldPassword, String newPassword, String confirmPassword) {
        checkParams(userId,oldPassword,newPassword,confirmPassword);

        User user = selectByPrimaryKey(userId);

        user.setUserPwd(Md5Util.encode(newPassword));

        user.setUpdateDate(new Date());

        AssertUtil.isTrue(updateByPrimaryKeySelective(user)<1,"密码更新失败!");
    }

    /**
     * 验证密码
     * @param userId
     * @param oldPassword
     * @param newPassword
     * @param confirmPassword
     */
    private void checkParams(Integer userId, String oldPassword, String newPassword, String confirmPassword) {
        User user = selectByPrimaryKey(userId);
        AssertUtil.isTrue(null == userId || null == user, "用户未登录或不存在!");
        AssertUtil.isTrue(StringUtils.isBlank(oldPassword), "请输入原始密码!");
        AssertUtil.isTrue(StringUtils.isBlank(newPassword), "请输入新密码!");
        AssertUtil.isTrue(StringUtils.isBlank(confirmPassword), "请输入确认密码!");
        AssertUtil.isTrue(!(newPassword.equals(confirmPassword)), "新密码输入不一致!");
        AssertUtil.isTrue(!(user.getUserPwd().equals(Md5Util.encode(oldPassword))), "原始密码不正确!");
        AssertUtil.isTrue(oldPassword.equals(newPassword), "新密码不能与旧密码相同!");
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
        AssertUtil.isTrue(StringUtils.isBlank(userName), "用户名不能为空!");

        AssertUtil.isTrue(StringUtils.isBlank(password), "用户密码不能为空!");
    }
}
