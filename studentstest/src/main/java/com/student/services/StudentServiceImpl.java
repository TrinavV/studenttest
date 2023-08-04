package com.student.services;
import com.student.domain.Students;
import com.student.repository.StudentRepository;

import javax.inject.Singleton;
import java.util.List;
import java.util.Optional;

@Singleton
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public List<Students> getAllStudents() {
        return studentRepository.findAll();
    }
    @Override
    public Students getStudentById(Integer id) {
        Optional<Students> student = studentRepository.findById(id);
        return student.orElse(null);
    }

    @Override
    public Students addStudent(Students student) {
        return studentRepository.save(student);
    }

    @Override
    public Students updateStudent(Integer id, Students updatedStudent) {
        Optional<Students> studentOptional = studentRepository.findById(id);
        if (studentOptional.isPresent()) {
            Students student = studentOptional.get();
            student.setName(updatedStudent.getName());
            student.setGrade(updatedStudent.getGrade());
            student.setSection(updatedStudent.getSection());
            student.setAddress(updatedStudent.getAddress());
            student.setTelephone(updatedStudent.getTelephone());
            student.setId(id);
            return studentRepository.update(student);
        }
        return null;
    }

    @Override
    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }
}