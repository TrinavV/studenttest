package com.student.services;
;
import com.student.domain.Students;
import java.util.List;
public interface StudentService {

    List<Students> getAllStudents();
    Students getStudentById(Integer id);
    Students addStudent(Students student);
    Students updateStudent(Integer id, Students updatedStudent);
    void deleteStudent(Integer id);
}

