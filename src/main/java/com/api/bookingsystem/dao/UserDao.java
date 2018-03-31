package com.api.bookingsystem.dao;

import java.util.List;

import com.api.bookingsystem.model.SystemUser;

public interface UserDao {

    void insertUser(SystemUser user);
    void insertUsers(List<SystemUser> users);
    List<SystemUser> getAllUsers();
    SystemUser getUserById(long userID);

}
