package com.student.domain;

import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.*;
import lombok.Builder;

@Entity
@Table(name = "student", schema = "public")
@Serdeable.Serializable

public class Students {

    @Id
    @Column(name = "roll_no")
    private int id;

    @Column(name = "names")
    private String name;

    @Column(name="grade")
    private int grade;

    @Column(name = "section")
    private String section;

    @Column(name = "address")
    private String address;

    @Column(name = "telephone")
    private int telephone;

    public Students() {
    }
    public Students(int id,String name, int grade, String section, String address, int telephone){
        this.id = id;
        this.name = name;
        this.grade= grade;
        this.section= section;
        this.address= address;
        this.telephone = telephone;
    }




    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGrade(int grade) {this.grade = grade;}
    public void setSection(String section) {
        this.section = section;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }


    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }



    public String getSection() {
        return section;
    }

    public int getTelephone() {
        return telephone;
    }

    public int getGrade(){return grade;}
}