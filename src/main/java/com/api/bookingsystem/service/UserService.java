package com.api.bookingsystem.service;

import java.util.List;

import com.api.bookingsystem.model.SystemUser;
import com.api.bookingsystem.dao.UserDao;

public interface UserService {
    void insertUser(SystemUser user);
    void insertUsers(List<SystemUser> users);
    List<SystemUser> getAllUsers();
    void getUserByID(long userID);
}
