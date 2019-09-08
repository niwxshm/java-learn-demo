package com.lizs.mybatis;

import com.lizs.mybatis.entity.User;
import com.lizs.mybatis.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class MybatisUtilTest {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void before() throws IOException {
        sqlSessionFactory = MybatisUtil.getSqlSessionFactory();
    }

    @Test
    public void getSqlSessionFactory() {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            UserMapper mapper = session.getMapper(UserMapper.class);
            User user = new User("lizs", 28, "dongguan");
            System.out.println(mapper.insertUser(user));
            System.out.println(mapper.selectUser(4));
            session.commit();
        }
    }

    @Test
    public void getAllUserTest() {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            UserMapper mapper = session.getMapper(UserMapper.class);
            System.out.println(mapper.selectAllUser());
        }
    }


}