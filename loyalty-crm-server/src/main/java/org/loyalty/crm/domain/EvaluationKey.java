package org.loyalty.crm.domain;

import java.io.Serializable;

public class EvaluationKey implements Serializable {
    private static final long serialVersionUID = -5665790485369689049L;
    public Long id;
    public String key_name;
    public String key_value;
    public Integer can_modify;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKey_name() {
        return key_name;
    }

    public void setKey_name(String key_name) {
        this.key_name = key_name;
    }

    public String getKey_value() {
        return key_value;
    }

    public void setKey_value(String key_value) {
        this.key_value = key_value;
    }

    public Integer getCan_modify() {
        return can_modify;
    }

    public void setCan_modify(Integer can_modify) {
        this.can_modify = can_modify;
    }
}
