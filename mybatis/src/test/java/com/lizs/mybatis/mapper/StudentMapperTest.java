package com.lizs.mybatis.mapper;

import com.lizs.mybatis.Config;
import com.lizs.mybatis.MybatisUtil;
import com.lizs.mybatis.entity.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class StudentMapperTest {

    private SqlSession sqlSession;

    @Before
    public void before() throws IOException {
        Config.setLanguage(Config.Language.ZH);
        SqlSessionFactory sqlSessionFactory = MybatisUtil.getSqlSessionFactory();
        this.sqlSession = sqlSessionFactory.openSession();
    }


    @After
    public void after() {
        if (sqlSession != null) {
            sqlSession.close();
        }
    }

    @Test
    public void insertStudentTest() {
        Student student = new Student("lizs", 28, "045");
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        studentMapper.intertStudent(student);
        sqlSession.commit();


    }

    @Test
    public void getAllStudentsTest() {
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        System.out.println(studentMapper.selectAllStudent());

    }

    @Test
    public void getStudentByIdTest() {
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        System.out.println(studentMapper.selectStudentById(1));
    }

}