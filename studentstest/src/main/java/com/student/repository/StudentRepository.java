package com.student.repository;
import com.student.domain.Students;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface StudentRepository extends CrudRepository<Students,Integer>{

}