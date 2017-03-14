package org.loyalty.crm.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.loyalty.crm.domain.BasicArticle;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Map;
/**
 * Created by yangzuojie on 2017/3/10.
 */
public interface BasicArticleMapper extends CrudRepository<BasicArticle,Long>{
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
