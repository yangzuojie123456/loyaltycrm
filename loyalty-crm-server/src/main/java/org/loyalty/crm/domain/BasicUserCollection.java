package org.loyalty.crm.domain;

import java.io.Serializable;

public class BasicUserCollection implements Serializable {

    private static final long serialVersionUID = 1502453087426255822L;
    public Long id;
    public Long user_id;
    public String fk_id;
    public String channel;
    public Integer type;
    public Long create_time;

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getFk_id() {
        return fk_id;
    }

    public void setFk_id(String fk_id) {
        this.fk_id = fk_id;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Long create_time) {
        this.create_time = create_time;
    }
}
