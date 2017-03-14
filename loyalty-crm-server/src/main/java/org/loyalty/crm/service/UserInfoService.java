package org.loyalty.crm.service;


import org.loyalty.crm.domain.UserInfo;

public interface UserInfoService {

    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);

}
