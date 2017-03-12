package org.loyalty.crm.service.impl;

import org.loyalty.crm.dao.BasicArticleMapper;
import org.loyalty.crm.dao.BasicArticleMapper;
import org.loyalty.crm.domain.BasicArticle;
import org.loyalty.crm.service.BasicArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Created by yangzuojie on 2017/3/9.
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
@CacheConfig(cacheNames = "article")
public class BasicArticleServiceImpl implements BasicArticleService {

    @Autowired
    private BasicArticleMapper basicArticleMapper;

    @Override
    @Cacheable()
    public List<BasicArticle> findAllArticle(Map<String, Object> maps) {
        return basicArticleMapper.findAllArticle(maps);
    }

    @Override
    @Cacheable()
    public BasicArticle findById(Long id) {
        return basicArticleMapper.findById(id);
    }

    @Override
    @Transactional
    @CacheEvict(allEntries=true)
    public Long saveArticle(BasicArticle article) {
        return null;
    }

    @Override
    @Transactional
    @CacheEvict(allEntries=true)
    public Long updateArticle(BasicArticle article) {
        return null;
    }

    @Override
    @Transactional
    @CacheEvict(allEntries=true)
    public Long deleteArticle(Long id) {
        return basicArticleMapper.deleteArticle(id);
    }
}
