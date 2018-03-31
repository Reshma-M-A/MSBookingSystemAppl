package com.api.bookingsystem.dao;

import java.util.List;

import com.api.bookingsystem.model.SystemUser;

public interface UserDaoImpl {

    void insertUser(SystemUser user);
    void insertUser(List<SystemUser> users);
    List<SystemUser> getAllEmployees();
    SystemUser getEmployeeById(String empId);

}
