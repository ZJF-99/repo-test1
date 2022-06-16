package com.lagou.test;

import com.lagou.domain.T_article;
import com.lagou.service.T_articleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class T_articleServiceTest {

    @Autowired
    private T_articleService t_articleService;

    @Test
    public void test(){

        T_article t_article = new T_article();
        t_article.setTitle("测试课程2");
        t_article.setContent("测试内容");
        t_articleService.save(t_article);

    }

}
