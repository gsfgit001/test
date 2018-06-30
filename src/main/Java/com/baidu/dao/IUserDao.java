package com.baidu.dao;


import com.baidu.model.User;

public interface IUserDao {

    User selectUser(long id);

}