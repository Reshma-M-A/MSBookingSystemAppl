package com.api.bookingsystem.model;

public class Customer implements SystemUser {

    private long cusID;
    private String cusName;

    @Override
    public long getUserId() { return cusID; }

    @Override
    public void setUserId(long usrID) { cusID = usrID; }

    @Override
    public String getUserName() { return cusName; }

    @Override
    public void setUserName(String usrName) { cusName = usrName; }

    @Override
    public String toString(){ return "Customer [CustomerID=" + cusID + ", CustomerName=" + cusName + "]"; }

}
