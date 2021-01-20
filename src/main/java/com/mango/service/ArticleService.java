package com.mango.service;

import com.mango.entity.Article;
import com.mango.pojo.Page;

import java.util.List;

/**
 * @author mango
 * @date 2021/1/19 21:11
 * @description:
 */
public interface ArticleService {

    /**
     * 查询文章表全部数据
     *
     * @return
     */
    List<Article> getArticleList();

    /**
     * 分页
     *
     * @param currentPage 当前页
     * @return
     */
    Page<Article> getPage(Integer currentPage);
}
