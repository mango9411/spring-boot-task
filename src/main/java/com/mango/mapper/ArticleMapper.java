package com.mango.mapper;

import com.mango.entity.Article;

import java.util.List;

/**
 * @author mango
 * @date 2021/1/19 21:04
 * @description:
 */
public interface ArticleMapper {

    /**
     * 分页
     *
     * @param currentPage 当前页数
     * @return
     */
    List<Article> getPage(Integer currentPage);
}
