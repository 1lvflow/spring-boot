package com.king.dao;

import com.king.model.User;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by TW on 2017/10/10.
 */
//@Mapper
public interface UserDao {

    @Select("select * from xx_user where user_id = #{id}")
    public User findById(@Param(value = "id") Integer id);
}
