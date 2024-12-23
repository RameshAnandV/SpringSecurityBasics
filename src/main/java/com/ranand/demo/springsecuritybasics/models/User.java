package com.ranand.demo.springsecuritybasics.models;

/**
 * @author Ramesh Anand
 */
public class User {
    public String userName;
    public int id;

    public User(String userName, int id) {
        this.userName = userName;
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
