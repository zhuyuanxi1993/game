package com.zyx.model;
import lombok.Data;

import java.util.Date;


@Data
public class User {
    private int id;
    private String userName;
    private String loginName;
    private String password;
    private String salt;
    private String phone;
    private Date createTime;
    private Date loginTime;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", phone='" + phone + '\'' +
                ", createTime=" + createTime +
                ", loginTime=" + loginTime +
                '}';
    }
}
