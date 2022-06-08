package com.kk.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (Book)实体类
 *
 * @author makejava
 * @since 2020-03-22 23:36:10
 */
@Data
public class Book implements Serializable {
    private static final long serialVersionUID = -37395183798253996L;

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String bookname;

    private String pub;

    private Double price;

    private Date date;

    private Integer count;

    private String kind;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @Version
    private Integer version;

    @TableLogic
    private Integer deleted;



}