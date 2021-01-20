package com.mango.service.impl;

import com.mango.entity.Article;
import com.mango.mapper.ArticleMapper;
import com.mango.pojo.Page;
import com.mango.repository.ArticleRepository;
import com.mango.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author mango
 * @date 2021/1/19 21:11
 * @description: 文章实体实现类
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public List<Article> getArticleList() {
        return articleRepository.findAll();
    }

    @Override
    public Page<Article> getPage(Integer currentPage) {
        Integer limit = 0;
        if (currentPage > 0) {
            //数据库分页从0开始  所以需要减1
            limit = currentPage - 1;
        } else {
            //小于等于0 代表在第一页的时候点击了上一页按钮，所以当前页要保持为0
            currentPage = 1;
        }
        List<Article> data = articleMapper.getPage(limit);
        return new Page<>(currentPage,
                Integer.parseInt(String.valueOf(articleRepository.count())), data);
    }
}
