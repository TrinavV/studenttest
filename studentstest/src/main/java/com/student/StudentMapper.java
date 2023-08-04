//package com.student;
//
//
//import com.student.domain.Students;
//import com.student.StudentDTO;
//
//public class StudentMapper {
//
//    private StudentMapper() {
//    }
//
//    public static Students fromEntity(Students students) {
//        return new Students(
//                students.getId(),
//                students.getName(),
//                students.getGrade(),
//                students.getSection(),
//                students.getAddress(),
//                students.getTelephone());
//    }
//
//    public static Students toEntity(StudentDTO studentDTO) {
//        return Students.builder()
//                .build();
//    }
//}
//
