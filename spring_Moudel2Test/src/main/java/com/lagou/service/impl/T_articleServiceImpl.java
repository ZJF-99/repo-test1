package com.lagou.service.impl;

import com.lagou.dao.T_articleDao;
import com.lagou.domain.T_article;
import com.lagou.service.T_articleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class T_articleServiceImpl implements T_articleService {

    @Autowired
    private T_articleDao t_articleDao;

    /**
     * 添加文章信息
     * @param t_article
     */
    public void save(T_article t_article) {

        t_articleDao.save(t_article);
    }

}
