package org.loyalty.crm.domain;

import java.io.Serializable;

public class BasicUserComment implements Serializable {

    private static final long serialVersionUID = 7604582838752790771L;
    public Long id;
    public Long user_id;
    public String product_code;
    public String content;
    public Integer click_num;
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

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getClick_num() {
        return click_num;
    }

    public void setClick_num(Integer click_num) {
        this.click_num = click_num;
    }

    public Long getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Long create_time) {
        this.create_time = create_time;
    }
}
