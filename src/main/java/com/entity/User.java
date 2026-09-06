package com.entity;

import java.util.Date;

/**
 * 用户实体类：对应 User_db 数据库中 user 表
 */
public class User {

    private Integer id;          // 主键，自增
    private String username;     // 用户名（唯一）
    private String password;     // 密码
    private String email;        // 邮箱（唯一）
    private Date createdAt;      // 创建时间（数据库默认值填充）
    private Date updatedAt;      // 更新时间（数据库默认值填充）

    public User() {
    }

    public User(Integer id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "User{id=" + id
                + ", username='" + username + '\''
                + ", password='" + password + '\''
                + ", email='" + email + '\''
                + ", createdAt=" + createdAt
                + ", updatedAt=" + updatedAt
                + '}';
    }
}
