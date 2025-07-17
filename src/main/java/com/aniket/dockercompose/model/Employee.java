package com.aniket.dockercompose.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import lombok.*;

import java.util.UUID;

@Entity
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    private String id;
    private String name;
    private int salary;


    @PrePersist
    public void generateUid() {
        this.id = UUID.randomUUID().toString();
    }


    public String getId() {
        return id;
    }

    public Employee setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public int getSalary() {
        return salary;
    }

    public Employee setSalary(int salary) {
        this.salary = salary;
        return this;
    }
}








