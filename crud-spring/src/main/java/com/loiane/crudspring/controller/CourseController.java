package com.loiane.crudspring.controller;

import java.util.List;

import com.loiane.crudspring.model.Course;
import com.loiane.crudspring.repository.CourseRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController     // Anotação que indica que a classe é uma API com endpoints;
@RequestMapping("/api/courses")     // Anotação que indica os endpoint;
@AllArgsConstructor
public class CourseController {

    private final CourseRepository courseRepository;

    // @RequestMapping(method = RequestMethod.GET) = @GetMapping
    @GetMapping
    public List<Course> list() {
        return courseRepository.findAll();
    }
}