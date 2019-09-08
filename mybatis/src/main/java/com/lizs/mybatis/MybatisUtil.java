package com.lizs.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MybatisUtil {

    public static SqlSessionFactory getSqlSessionFactory() throws IOException {
        File file = new File("E:\\IdeaWorkspace\\java-learn-demo\\mybatis\\src\\main\\resources\\mybatis-config.xml");
        InputStream inputStream = new FileInputStream(file);
        System.out.println(inputStream);
        return new SqlSessionFactoryBuilder().build(inputStream);
    }

    public static void main(String[] args) throws IOException {
        System.out.println(getSqlSessionFactory());
    }
}
