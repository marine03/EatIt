package com.example.eatit.Model;

public class User {
    private String Name;
    private String Password;


    public User(String name, String password) {
        Name = name;
        Password = password;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public User() {


    }
}
