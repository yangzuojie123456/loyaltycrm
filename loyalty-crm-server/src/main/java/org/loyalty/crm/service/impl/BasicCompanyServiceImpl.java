package org.loyalty.crm.service.impl;

import org.apache.ibatis.annotations.Param;
import org.loyalty.crm.dao.BasicCompanyMapper;
import org.loyalty.crm.domain.BasicCompany;
import org.loyalty.crm.service.BasicCompanyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by yangzuojie on 2017/3/9.
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
//@CacheConfig(cacheNames = "company")
public class BasicCompanyServiceImpl implements BasicCompanyService{
    private Logger logger =  LoggerFactory.getLogger(this.getClass());

    @Resource
    private BasicCompanyMapper basicCompanyMapper;

    @Override
    @Cacheable(value = "redisCompany",key = "#maps + 'basicCompany'")
    public List<BasicCompany> findAllCompany(Map<String, Object> maps) {
        logger.info("无法获取缓存：findAllCompany");
        return basicCompanyMapper.findAllCompany(maps);
    }

    @Override
    @Cacheable(value = "redisCompany",key = "#id + 'companyId'")
    public BasicCompany findById(Long id) {
        return basicCompanyMapper.findById(id);
    }
}
