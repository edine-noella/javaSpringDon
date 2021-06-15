package com.springDonatien.springProj.studentMng.services;

import com.springDonatien.springProj.studentMng.dtos.StudentDto;
import com.springDonatien.springProj.studentMng.models.Student;

import java.util.List;

public interface StudentService {
    public Student save(StudentDto dto) ;
    public List<Student> getAll();
}
