package com.dmw.crm.dao;

import com.dmw.base.BaseMapper;
import com.dmw.crm.dto.User;

/**
* @author woaixiejuan
* @description 针对表【t_user】的数据库操作Mapper
* @createDate 2022-10-05 09:55:29
* @Entity com.dmw.crm.dto.User
*/
public interface UserMapper  extends BaseMapper<User,Integer> {


    User queryUserByUserName(String username);
}
