package com.zyx.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private int id;
    private String userName;
    private String mobile;
    private String password;
    private String salt;

    @Override
    public String toString() {
        return "userId=" + id + ",username=" + userName + ",mobile=" + mobile;
    }
}
