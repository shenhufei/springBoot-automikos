package com.automikos.test02.mappers;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

/**
 * Created by jason on 2017/12/12.
 */

public interface Usermapper02 {
    @Insert("INSERT INTO user (username,age)VALUES(#{username},#{age})")
    public void AddUser(@Param("username") String username, @Param("age") Integer age);
}
