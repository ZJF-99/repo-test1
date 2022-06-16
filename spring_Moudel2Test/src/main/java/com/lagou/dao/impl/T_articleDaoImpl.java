package com.lagou.dao.impl;

import com.lagou.dao.T_articleDao;
import com.lagou.domain.T_article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class T_articleDaoImpl implements T_articleDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 添加文章信息
     * @param t_article
     */
    public void save(T_article t_article) {

        String sql = "insert into t_article values(null,?,?)";
        jdbcTemplate.update(sql, t_article.getTitle(), t_article.getContent());
    }
}
