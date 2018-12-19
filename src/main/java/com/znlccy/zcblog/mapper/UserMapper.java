package com.znlccy.zcblog.mapper;

import com.znlccy.zcblog.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * author: znlccy
 * version: 1.0.0
 * date: 12/19/18-4:17 AM
 * comment: lo
 */
@Mapper
public interface UserMapper {

    @Insert("insert into tb_user(user_id, username, password) values(#{user.userId},#{user.username},#{user.password})")
    int saveUser(@Param("user")User user);

}
