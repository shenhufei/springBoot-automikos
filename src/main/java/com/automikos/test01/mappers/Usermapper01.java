package com.automikos.test01.mappers;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

/**
 * Created by jason on 2017/12/12.
 */

public interface Usermapper01 {

    @Insert("INSERT INTO USER (username,age)VALUES(#{username},#{age})")
    public void AddUser(@Param("username") String username, @Param("age") Integer age);
}
