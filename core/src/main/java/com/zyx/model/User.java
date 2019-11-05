package com.zyx.model;
import lombok.Data;


@Data
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
