package org.loyalty.crm.domain;

import java.io.Serializable;

public class SysManager implements Serializable {
    private static final long serialVersionUID = -8985845568207410507L;
    public Long id;
    public String name;
    public String password;
    public String actual_name;
    public String department;
    public String post;
    public Integer degree;
    public Integer status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getActual_name() {
        return actual_name;
    }

    public void setActual_name(String actual_name) {
        this.actual_name = actual_name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public Integer getDegree() {
        return degree;
    }

    public void setDegree(Integer degree) {
        this.degree = degree;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
