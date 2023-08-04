package com.student;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Introspected
@Serdeable.Deserializable

public class StudentRequest {
    private int id;
    private String name;
    private int grade;
    private String section;
    private String address;
    private int telephone;


    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public String getSection() {
        return section;
    }

    public String getAddress() {
        return address;
    }

    public int getTelephone() {
        return telephone;
    }
}
