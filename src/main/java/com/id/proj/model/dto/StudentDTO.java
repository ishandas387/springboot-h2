package com.id.proj.model.dto;

import com.id.proj.model.Student;
import java.util.List;
import java.util.stream.Collectors;

public class StudentDTO {

    private String name;
    private String id;
    private String address;

    public StudentDTO(String name, String id, String address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public StudentDTO fromStudent(Student s) {
        return new StudentDTO(s.getName(), s.getId(), s.getAddress());
    }

    public List<StudentDTO> fromStudents(List<Student> students) {
        return students.stream().map(this::fromStudent).collect(Collectors.toList());
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
