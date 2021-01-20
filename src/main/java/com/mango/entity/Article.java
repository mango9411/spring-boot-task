package com.mango.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author mango
 * @date 2021/1/19 21:05
 * @description: 文章
 */
@Data
@Entity(name = "t_article")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 文章标题
     */
    @Column(name = "title")
    private String title;

    /**
     * ⽂章具体内容
     */
    @Column(name = "content")
    private String content;

    /**
     * 发表时间
     */
    @Column(name = "created")
    private Date created;

    /**
     * 修改时间
     */
    @Column(name = "modified")
    private Date modified;

    /**
     * ⽂章分类
     */
    @Column(name = "categories")
    private String categories;

    /**
     * ⽂章标签
     */
    @Column(name = "tags")
    private String tags;

    /**
     * 是否允许评论
     */
    @Column(name = "allow_comment")
    private Boolean allowComment;

    /**
     * ⽂章缩略图
     */
    @Column(name = "thumbnail")
    private String thumbnail;
}
