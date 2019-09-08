package com.lizs.mybatis.mapper;

import com.lizs.mybatis.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface UserMapper {
    @Select("select * from user where id = #{id}")
    User selectUser(Integer id);

    @Insert("insert into user (name, age, address) values (#{name}, #{age}, #{address})")
    int insertUser(User user);

    @Select("select * from user")
    List<User> selectAllUser();
}
