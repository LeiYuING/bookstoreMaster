package com.kk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2020-03-18 16:51:11
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -57581102239328827L;
    @TableId(type = IdType.AUTO)
    private Integer id;

    private String username;

    private String password;

    private String phone;

    private String email;

    private String sex;

    private String perm;

    private String role;

    @Version
    private Integer version;

    @TableLogic
    private Integer deleted;

}