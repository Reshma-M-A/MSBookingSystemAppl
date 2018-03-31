package com.api.bookingsystem.model;

public abstract class SystemUser {

    private long usrID;
    private String usrName;

    public long getUserId() { return usrID; }
    public void setUserId(long usrID) { this.usrID = usrID; }
    public String getUserName() { return usrName; }
    public void setUserName(String usrName) { this.usrName = usrName; }

    @Override
    public String toString(){ return "Customer [CustomerID=" + usrID + ", CustomerName=" + usrName + "]"; }
}