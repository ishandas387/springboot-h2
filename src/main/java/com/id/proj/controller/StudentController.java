package com.id.proj.controller;

import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.id.proj.model.dto.*;

@RestController("/students")
public class StudentController {

    @GetMapping("/{id}")
    public ResponseEntity<StudentDTO> getById(@PathVariable String id) {
        return null;
    }

    @GetMapping("/all")
    public ResponseEntity<StudentDTO> getById(Pageable page) {
        return null;
    }
}
