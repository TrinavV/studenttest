package com.student;

import com.student.domain.Students;
import com.student.StudentRequest;
import com.student.StudentResponse;
import com.student.services.StudentService;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller("/students")
public class StudentController {

    @Get(value = "/hello")
    public String helloStudent() {
        return "{\"Hello Student\"}";
    }

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @Get("/fetch")
    public List<StudentResponse> getAllStudents() {
        return studentService.getAllStudents()
                .stream()
                .map(this::toResponse)
                .toList();
    }

    @Get("/{id}")
    public StudentResponse getStudentById(@PathVariable Integer id) {
        return toResponse(studentService.getStudentById(id));
    }

    @Post
    public StudentResponse addStudent(@Body StudentRequest studentRequest) {
        Students newStudent = fromRequest(studentRequest);
        Students addedStudent= studentService.addStudent(newStudent);
        return toResponse(studentService.addStudent(fromRequest(studentRequest)));
    }

    @Put("/{id}")
    public StudentResponse updateStudent(@PathVariable Integer id, @Body StudentRequest updatedStudentRequest) {
        return toResponse(studentService.updateStudent(id, fromRequest(updatedStudentRequest)));
    }

    @Delete("/{id}")
    public HttpStatus deleteStudent(@PathVariable Integer id) {
        studentService.deleteStudent(id);
        return HttpStatus.NO_CONTENT;
    }


    private StudentResponse toResponse(Students student) {
        return new StudentResponse(
                student.getId(),
                student.getName(),
                student.getGrade(),
                student.getSection(),
                student.getAddress(),
                student.getTelephone()
        );
    }


        private Students fromRequest(StudentRequest studentRequest) {
            return new Students(
                    studentRequest.getId(),
                    studentRequest.getName(),
                    studentRequest.getGrade(),
                    studentRequest.getSection(),
                    studentRequest.getAddress(),
                    studentRequest.getTelephone()
            );
        }



}
