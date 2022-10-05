package com.dmw.crm.service;

import com.dmw.crm.model.UserModel;

/**
 * @author woaixiejuan
 * @description 针对表【t_user】的数据库操作Service
 * @createDate 2022-10-05 09:55:29
 */
public interface UserService {
    /**
     * 用户登录
     * @param userName
     * @param userPwd
     * @return
     */
    UserModel login(String userName, String userPwd);
}
