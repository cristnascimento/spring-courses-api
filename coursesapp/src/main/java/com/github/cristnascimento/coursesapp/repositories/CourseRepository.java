package com.github.cristnascimento.coursesapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.github.cristnascimento.coursesapp.models.Course;

public interface CourseRepository extends CrudRepository<Course, Long>{

}
