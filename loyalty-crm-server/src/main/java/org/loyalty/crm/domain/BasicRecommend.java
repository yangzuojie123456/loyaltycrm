package org.loyalty.crm.domain;

import java.io.Serializable;

public class BasicRecommend implements Serializable {

    private static final long serialVersionUID = 525606224737286482L;
    public Long id;
    public String age;
    public String gender;
    public String smoker;
    public String health;
    public String pterm;
    public String bterm;
    public String sa;
    public String prod_type;
    public String prod_code;
    public String reason;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSmoker() {
        return smoker;
    }

    public void setSmoker(String smoker) {
        this.smoker = smoker;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getPterm() {
        return pterm;
    }

    public void setPterm(String pterm) {
        this.pterm = pterm;
    }

    public String getBterm() {
        return bterm;
    }

    public void setBterm(String bterm) {
        this.bterm = bterm;
    }

    public String getSa() {
        return sa;
    }

    public void setSa(String sa) {
        this.sa = sa;
    }

    public String getProd_type() {
        return prod_type;
    }

    public void setProd_type(String prod_type) {
        this.prod_type = prod_type;
    }

    public String getProd_code() {
        return prod_code;
    }

    public void setProd_code(String prod_code) {
        this.prod_code = prod_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
