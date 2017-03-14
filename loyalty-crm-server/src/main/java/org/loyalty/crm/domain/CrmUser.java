package org.loyalty.crm.domain;

import java.io.Serializable;

public class CrmUser implements Serializable {
    private static final long serialVersionUID = 2218817281974779549L;
    public Long id;
    public String open_id;
    public String nick_name;
    public String head_img_url;
    public String sex;
    public String mobile;
    public String email;
    public String province;
    public String city;
    public Long subscribe_time;
    public String iiuv;
    public String fiiuv;
    public Long isSalesman;
    public Long vGrade;
    public String userSource;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOpen_id() {
        return open_id;
    }

    public void setOpen_id(String open_id) {
        this.open_id = open_id;
    }

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

    public String getHead_img_url() {
        return head_img_url;
    }

    public void setHead_img_url(String head_img_url) {
        this.head_img_url = head_img_url;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getSubscribe_time() {
        return subscribe_time;
    }

    public void setSubscribe_time(Long subscribe_time) {
        this.subscribe_time = subscribe_time;
    }

    public String getIiuv() {
        return iiuv;
    }

    public void setIiuv(String iiuv) {
        this.iiuv = iiuv;
    }

    public String getFiiuv() {
        return fiiuv;
    }

    public void setFiiuv(String fiiuv) {
        this.fiiuv = fiiuv;
    }

    public Long getIsSalesman() {
        return isSalesman;
    }

    public void setIsSalesman(Long isSalesman) {
        this.isSalesman = isSalesman;
    }

    public Long getvGrade() {
        return vGrade;
    }

    public void setvGrade(Long vGrade) {
        this.vGrade = vGrade;
    }

    public String getUserSource() {
        return userSource;
    }

    public void setUserSource(String userSource) {
        this.userSource = userSource;
    }
}
