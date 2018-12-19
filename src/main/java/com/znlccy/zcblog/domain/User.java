package com.znlccy.zcblog.domain;

import lombok.Data;

/**
 * author: znlccy
 * version: 1.0.0
 * date: 12/19/18-4:18 AM
 * comment: 用户实体类
 */

@Data
public class User {

    /**
     * 用户主键
     */
    private Long userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;



}
