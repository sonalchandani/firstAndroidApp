package com.example.csonal.firstapp;

public class User {
    int _id;
    String _name;
    String _email;
    String _password;


    // Empty constructor
    public User() {

    }

    // constructor
    public User(int id, String name, String _email, String _password) {
        this._id = id;
        this._name = name;
        this._email = _email;
        this._password = _password;
    }

    public int getID() {
        return this._id;
    }

    public void setID(int id) {
        this._id = id;
    }


    public String getName() {
        return this._name;
    }

    public void setName(String name) {
        this._name = name;
    }

    public String getEmail() {
        return this._email;
    }

    public void setEmail(String email) {
        this._email = email;
    }

    public String getPassword() {
        return this._password;
    }

    public void setPassword(String password){
        this._password=password;
    }
}
