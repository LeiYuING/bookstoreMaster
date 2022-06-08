package com.kk.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Article)实体类
 *
 * @author makejava
 * @since 2020-03-28 01:12:19
 */
@Data
public class Article implements Serializable {
    private static final long serialVersionUID = -86149542952698496L;
    /**
     * int文章的唯一ID
     */
    private Integer id;
    /**
     * 作者
     */
    private String author;
    /**
     * 标题
     */
    private String title;
    /**
     * 文章的内容
     */
    private String content;

}