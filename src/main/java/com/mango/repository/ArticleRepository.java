package com.mango.repository;

import com.mango.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author mango
 * @date 2021/1/19 21:04
 * @description:
 */
public interface ArticleRepository extends JpaRepository<Article, Integer> {

}
