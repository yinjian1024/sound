package com.sound.controller.article;

import com.sound.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/article")
public class Article {

    @Autowired
    private ArticleService articleService;

    /**
     * 创建文章
     * @param params
     * @return
     */
    @RequestMapping(value = "/createArticle", method = RequestMethod.POST)
    public Map<String,Object> createArticle(@RequestBody Map<String,Object> params){
        return articleService.createArticle(params);
    }






}
