package com.lagou.dao;

import com.lagou.domain.T_article;

public interface T_articleDao {

    /**
     * 添加文章信息
     * @param t_article
     */
    public void save(T_article t_article);

}
