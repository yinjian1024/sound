package com.sound.controller.article;

import com.sound.service.article.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/vue-element-admin/article")
public class Article {

    @Autowired
    private ArticleService articleService;

    /**
     * 创建文章
     * @param params
     * @return
     */
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Map<String,Object> createArticle(@RequestBody Map<String,Object> params){
        return articleService.createArticle(params);
    }

    /**
     * 发布文章
     * @param params
     * @return
     */
    @RequestMapping(value = "/publish", method = RequestMethod.POST)
    public Map<String,Object> publishArticle(@RequestBody Map<String,Object> params){
        return articleService.createArticle(params);
    }

    /**
     * 分页查询文章
     * @param params
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public Map<String,Object> listArticle(@RequestBody Map<String,Object> params){
        return articleService.listArticle(params);
    }


    /**
     * 查询文章明细
     * @param params
     * @return
     */
    @GetMapping("/detail")
    public Map<String,Object> detailArticle(@RequestParam("id") Long id){
        return articleService.detailArticle(id);
    }





}
