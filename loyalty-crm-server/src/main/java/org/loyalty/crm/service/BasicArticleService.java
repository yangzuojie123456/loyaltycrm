package org.loyalty.crm.service;

import org.apache.ibatis.annotations.Param;
import org.loyalty.crm.domain.BasicArticle;

import java.util.List;
import java.util.Map;

/**
 * Created by yangzuojie on 2017/3/9.
 */
public interface BasicArticleService {
    /**
     * 获取所有参数信息
     * @param maps
     * @return
     */
    List<BasicArticle> findAllArticle(Map<String, Object> maps);

    /**
     * 根据ID获取详细信息
     * @param id
     * @return
     */
    BasicArticle findById(@Param("id") Long id);

    Long saveArticle(BasicArticle article);

    Long updateArticle(BasicArticle article);

    Long deleteArticle(Long id);
}
