package org.loyalty.crm.domain;

import java.io.Serializable;

public class SysPoint implements Serializable {
    private static final long serialVersionUID = -6521293348022553093L;
    public Long id;
    public Long user_id;
    public Long point;
    public Long status;
    public Long s_point;
    public Long x_point;
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

    public Long getPoint() {
        return point;
    }

    public void setPoint(Long point) {
        this.point = point;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getS_point() {
        return s_point;
    }

    public void setS_point(Long s_point) {
        this.s_point = s_point;
    }

    public Long getX_point() {
        return x_point;
    }

    public void setX_point(Long x_point) {
        this.x_point = x_point;
    }

    public Long getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Long create_time) {
        this.create_time = create_time;
    }
}
