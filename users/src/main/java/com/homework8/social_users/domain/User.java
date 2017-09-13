package com.homework8.social_users.domain;


import com.homework8.social_users.IProfileEditor;
import com.homework8.social_users.IUser;
import com.homework8.social_users.IProfileViewer;

public class User implements IUser,IProfileViewer,IProfileEditor {
    private String user_id;
    private String user_name;
    private String email;
    private String password;
    private String city;


    public User(String user_id, String user_name, String email, String password, String city) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.email = email;
        this.password = password;
        this.city = city;
    }

    public User(String user_id, String user_name, String email, String city) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.email = email;
        this.city = city;
    }

    @Override
    public String getUser_id() {
        return user_id;
    }

    @Override
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String getUser_name() {
        return user_name;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getCity() {
        return city;
    }
}
