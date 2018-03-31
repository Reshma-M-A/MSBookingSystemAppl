package com.api.bookingsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.bookingsystem.dao.UserDao;
import com.api.bookingsystem.model.SystemUser;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;


    @Override
    public void insertUser(SystemUser user) { userDao.insertUser(user); }

    @Override
    public void insertUsers(List<SystemUser> users) { userDao.insertUsers(users); }

    @Override
    public List<SystemUser> getAllUsers() { return userDao.getAllUsers(); }

    @Override
    public void getUserByID(long userID) {
        SystemUser user = userDao.getUserById(userID);
        System.out.println(user);
    }
}
