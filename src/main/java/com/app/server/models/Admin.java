package com.app.server.models;

public class Admin {
    String adminID = null;
    String username;
    String password;

    public Admin(String adminID) {
        this.adminID = adminID;
    }

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
