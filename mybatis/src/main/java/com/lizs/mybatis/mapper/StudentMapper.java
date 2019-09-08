package com.lizs.mybatis.mapper;

import com.lizs.mybatis.entity.Student;
import com.lizs.mybatis.entity.User;

import java.util.List;

public interface StudentMapper {

    int intertStudent(Student student);

    List<Student> selectAllStudent();

    Student selectStudentById(long id);
}
