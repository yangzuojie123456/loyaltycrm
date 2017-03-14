package org.loyalty.crm.service;

import org.apache.ibatis.annotations.Param;
import org.loyalty.crm.domain.BasicCompany;

import java.util.List;
import java.util.Map;

/**
 * Created by yangzuojie on 2017/3/14.
 */
public interface BasicCompanyService {
    /**
     * 获取所有参数信息
     * @param maps
     * @return
     */
    List<BasicCompany> findAllCompany(Map<String, Object> maps);

    /**
     * 根据ID获取详细信息
     * @param id
     * @return
     */
    BasicCompany findById(@Param("id") Long id);
}
