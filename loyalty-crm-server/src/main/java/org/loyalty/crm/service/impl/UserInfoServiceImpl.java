package org.loyalty.crm.service.impl;


import javax.annotation.Resource;

import org.loyalty.crm.dao.UserInfoMapper;
import org.loyalty.crm.domain.UserInfo;
import org.loyalty.crm.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService{
    private Logger logger =  LoggerFactory.getLogger(this.getClass());

    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo findByUsername(String username) {
        logger.info("UserInfoServiceImpl.findByUsername()");
        return userInfoMapper.findByUsername(username);
    }

}
