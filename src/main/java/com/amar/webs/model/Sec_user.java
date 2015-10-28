/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.webs.model;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author amar
 */
public class Sec_user {
    private int id;
    private String realname;
    private String loginname;
    private String pw;
    private String email;
    private String phone;
    private Date regtime;
    private Date lastlogintime;
    private Date birthday;
    private int usergroup;

    public Sec_user(String loginname, String pw) {
        this.loginname = loginname;
        this.pw = pw;
    }

    public Sec_user(){
        
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getRegtime() {
        return regtime;
    }

    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }

    public Date getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getUsergroup() {
        return usergroup;
    }

    public void setUsergroup(int usergroup) {
        this.usergroup = usergroup;
    }

    @Override
    public String toString() {
        return "Sec_user{" + "id=" + id + ", realname=" + realname + ", loginname=" + loginname + ", pw=" + pw + ", email=" + email + ", phone=" + phone + ", regtime=" + regtime + ", lastlogintime=" + lastlogintime + ", birthday=" + birthday + ", usergroup=" + usergroup + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
        hash = 29 * hash + Objects.hashCode(this.realname);
        hash = 29 * hash + Objects.hashCode(this.loginname);
        hash = 29 * hash + Objects.hashCode(this.pw);
        hash = 29 * hash + Objects.hashCode(this.email);
        hash = 29 * hash + Objects.hashCode(this.phone);
        hash = 29 * hash + Objects.hashCode(this.regtime);
        hash = 29 * hash + Objects.hashCode(this.lastlogintime);
        hash = 29 * hash + Objects.hashCode(this.birthday);
        hash = 29 * hash + this.usergroup;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sec_user other = (Sec_user) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.realname, other.realname)) {
            return false;
        }
        if (!Objects.equals(this.loginname, other.loginname)) {
            return false;
        }
        if (!Objects.equals(this.pw, other.pw)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.phone, other.phone)) {
            return false;
        }
        if (!Objects.equals(this.regtime, other.regtime)) {
            return false;
        }
        if (!Objects.equals(this.lastlogintime, other.lastlogintime)) {
            return false;
        }
        if (!Objects.equals(this.birthday, other.birthday)) {
            return false;
        }
        if (this.usergroup != other.usergroup) {
            return false;
        }
        return true;
    }
    
    
}
