package com.amar.webs.model;

import java.io.Serializable;
import java.util.Date;

public class SecUser implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sec_user.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sec_user.realname
     *
     * @mbggenerated
     */
    private String realname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sec_user.loginname
     *
     * @mbggenerated
     */
    private String loginname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sec_user.pw
     *
     * @mbggenerated
     */
    private String pw;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sec_user.email
     *
     * @mbggenerated
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sec_user.phone
     *
     * @mbggenerated
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sec_user.regtime
     *
     * @mbggenerated
     */
    private Date regtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sec_user.lastlogintime
     *
     * @mbggenerated
     */
    private Date lastlogintime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sec_user.birthday
     *
     * @mbggenerated
     */
    private Date birthday;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sec_user.usergroup
     *
     * @mbggenerated
     */
    private Integer usergroup;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sec_user
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sec_user.id
     *
     * @return the value of sec_user.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sec_user.id
     *
     * @param id the value for sec_user.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sec_user.realname
     *
     * @return the value of sec_user.realname
     *
     * @mbggenerated
     */
    public String getRealname() {
        return realname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sec_user.realname
     *
     * @param realname the value for sec_user.realname
     *
     * @mbggenerated
     */
    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sec_user.loginname
     *
     * @return the value of sec_user.loginname
     *
     * @mbggenerated
     */
    public String getLoginname() {
        return loginname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sec_user.loginname
     *
     * @param loginname the value for sec_user.loginname
     *
     * @mbggenerated
     */
    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sec_user.pw
     *
     * @return the value of sec_user.pw
     *
     * @mbggenerated
     */
    public String getPw() {
        return pw;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sec_user.pw
     *
     * @param pw the value for sec_user.pw
     *
     * @mbggenerated
     */
    public void setPw(String pw) {
        this.pw = pw == null ? null : pw.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sec_user.email
     *
     * @return the value of sec_user.email
     *
     * @mbggenerated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sec_user.email
     *
     * @param email the value for sec_user.email
     *
     * @mbggenerated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sec_user.phone
     *
     * @return the value of sec_user.phone
     *
     * @mbggenerated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sec_user.phone
     *
     * @param phone the value for sec_user.phone
     *
     * @mbggenerated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sec_user.regtime
     *
     * @return the value of sec_user.regtime
     *
     * @mbggenerated
     */
    public Date getRegtime() {
        return regtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sec_user.regtime
     *
     * @param regtime the value for sec_user.regtime
     *
     * @mbggenerated
     */
    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sec_user.lastlogintime
     *
     * @return the value of sec_user.lastlogintime
     *
     * @mbggenerated
     */
    public Date getLastlogintime() {
        return lastlogintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sec_user.lastlogintime
     *
     * @param lastlogintime the value for sec_user.lastlogintime
     *
     * @mbggenerated
     */
    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sec_user.birthday
     *
     * @return the value of sec_user.birthday
     *
     * @mbggenerated
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sec_user.birthday
     *
     * @param birthday the value for sec_user.birthday
     *
     * @mbggenerated
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sec_user.usergroup
     *
     * @return the value of sec_user.usergroup
     *
     * @mbggenerated
     */
    public Integer getUsergroup() {
        return usergroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sec_user.usergroup
     *
     * @param usergroup the value for sec_user.usergroup
     *
     * @mbggenerated
     */
    public void setUsergroup(Integer usergroup) {
        this.usergroup = usergroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sec_user
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SecUser other = (SecUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRealname() == null ? other.getRealname() == null : this.getRealname().equals(other.getRealname()))
            && (this.getLoginname() == null ? other.getLoginname() == null : this.getLoginname().equals(other.getLoginname()))
            && (this.getPw() == null ? other.getPw() == null : this.getPw().equals(other.getPw()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getRegtime() == null ? other.getRegtime() == null : this.getRegtime().equals(other.getRegtime()))
            && (this.getLastlogintime() == null ? other.getLastlogintime() == null : this.getLastlogintime().equals(other.getLastlogintime()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getUsergroup() == null ? other.getUsergroup() == null : this.getUsergroup().equals(other.getUsergroup()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sec_user
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRealname() == null) ? 0 : getRealname().hashCode());
        result = prime * result + ((getLoginname() == null) ? 0 : getLoginname().hashCode());
        result = prime * result + ((getPw() == null) ? 0 : getPw().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getRegtime() == null) ? 0 : getRegtime().hashCode());
        result = prime * result + ((getLastlogintime() == null) ? 0 : getLastlogintime().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getUsergroup() == null) ? 0 : getUsergroup().hashCode());
        return result;
    }
}