package com.ray.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 用户实体类
 * @author Ray Lin
 * @createTime 2017-11-13 22:50
 */
@Entity
@Table(name="sys_user")
public class User implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name="user_name",unique = true,nullable = false)
    private String username;
    @Column(name="password",nullable = false)
    private String password;
    @Column(name="salt",nullable = false)
    private String salt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Override
    public String toString(){
        return "id="+id+",username="+username+",password="+password+",salt="+salt;
    }

}
