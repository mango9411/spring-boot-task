package com.mango.controller;

import com.mango.entity.Article;
import com.mango.pojo.Page;
import com.mango.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author mango
 * @date 2021/1/19 21:12
 * @description:
 */
@Controller
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/getArticleList")
    public String getArticleList(Model model) {
        model.addAttribute("data", articleService.getArticleList());
        return "/client/index";
    }

    @RequestMapping("/getPage")
    public String getPage(Model model, Integer currentPage) {
        model.addAttribute("data", articleService.getPage(currentPage));
        return "/client/index";
    }
}
