package org.loyalty.crm.domain;

import java.io.Serializable;

public class BasicProductInfo implements Serializable {
    private static final long serialVersionUID = -8389670331124528554L;
    public Long id;
    public String prod_code_m;
    public String prod_name;
    public String prod_visible;
    public String prod_feature;
    public String d_sum;
    public String ac_sum;
    public String td_sum;
    public String cr_sum;
    public String mcr_sum;
    public String h_sum;
    public String ph_sum;
    public String e_sum;
    public String surv_sum;
    public String mat_sum;
    public String ann_sum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProd_code_m() {
        return prod_code_m;
    }

    public void setProd_code_m(String prod_code_m) {
        this.prod_code_m = prod_code_m;
    }

    public String getProd_name() {
        return prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    public String getProd_visible() {
        return prod_visible;
    }

    public void setProd_visible(String prod_visible) {
        this.prod_visible = prod_visible;
    }

    public String getProd_feature() {
        return prod_feature;
    }

    public void setProd_feature(String prod_feature) {
        this.prod_feature = prod_feature;
    }

    public String getD_sum() {
        return d_sum;
    }

    public void setD_sum(String d_sum) {
        this.d_sum = d_sum;
    }

    public String getAc_sum() {
        return ac_sum;
    }

    public void setAc_sum(String ac_sum) {
        this.ac_sum = ac_sum;
    }

    public String getTd_sum() {
        return td_sum;
    }

    public void setTd_sum(String td_sum) {
        this.td_sum = td_sum;
    }

    public String getCr_sum() {
        return cr_sum;
    }

    public void setCr_sum(String cr_sum) {
        this.cr_sum = cr_sum;
    }

    public String getMcr_sum() {
        return mcr_sum;
    }

    public void setMcr_sum(String mcr_sum) {
        this.mcr_sum = mcr_sum;
    }

    public String getH_sum() {
        return h_sum;
    }

    public void setH_sum(String h_sum) {
        this.h_sum = h_sum;
    }

    public String getPh_sum() {
        return ph_sum;
    }

    public void setPh_sum(String ph_sum) {
        this.ph_sum = ph_sum;
    }

    public String getE_sum() {
        return e_sum;
    }

    public void setE_sum(String e_sum) {
        this.e_sum = e_sum;
    }

    public String getSurv_sum() {
        return surv_sum;
    }

    public void setSurv_sum(String surv_sum) {
        this.surv_sum = surv_sum;
    }

    public String getMat_sum() {
        return mat_sum;
    }

    public void setMat_sum(String mat_sum) {
        this.mat_sum = mat_sum;
    }

    public String getAnn_sum() {
        return ann_sum;
    }

    public void setAnn_sum(String ann_sum) {
        this.ann_sum = ann_sum;
    }
}
