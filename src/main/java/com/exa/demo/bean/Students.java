package com.exa.demo.bean;

import java.io.Serializable;

public class Students implements Serializable {
    private String username;
    private String userid;
    private String title;
    private String sex;

    @Override
    public String toString() {
        return "Students{" +
                "username='" + username + '\'' +
                ", userid='" + userid + '\'' +
                ", title='" + title + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public Students() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }



    public Students(String username, String userid, String title, String sex) {
        this.username = username;
        this.userid = userid;
        this.title = title;
        this.sex = sex;
    }


}
