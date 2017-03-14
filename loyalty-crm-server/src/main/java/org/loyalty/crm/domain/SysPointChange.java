package org.loyalty.crm.domain;

import java.io.Serializable;

public class SysPointChange implements Serializable {

    private static final long serialVersionUID = -954988919055558544L;
    public Long id;
    public Long user_id;
    public Long ex_point;
    public String typename;
    public Long status;
    public Long type;
    public Long create_time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getEx_point() {
        return ex_point;
    }

    public void setEx_point(Long ex_point) {
        this.ex_point = ex_point;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Long create_time) {
        this.create_time = create_time;
    }
}
