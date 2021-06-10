package com.example.osoriome.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.osoriome.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
