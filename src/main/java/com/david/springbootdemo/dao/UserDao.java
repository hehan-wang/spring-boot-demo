package com.david.springbootdemo.dao;

import com.david.springbootdemo.data.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author david
 * @since 2022/6/12
 */
@Mapper
public interface UserDao {
    @Select("SELECT * FROM USER")
    List<User> getUser();
}
