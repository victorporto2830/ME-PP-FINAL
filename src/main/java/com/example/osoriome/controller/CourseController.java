package com.example.osoriome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestController;

import com.example.osoriome.model.Course;
import com.example.osoriome.repository.CourseRepository;

@RestController
@RequestMapping("/curso")
public class CourseController {
	@Autowired
	private CourseRepository courseRepository;
	
	@GetMapping
	public List<Course> listarCursos() {
		return courseRepository.findAll();
	}
	
	@PostMapping
	public Course adicionarCurso(@RequestBody Course curso) {
		return courseRepository.save(curso);
	}
	
	@DeleteMapping
	public void deletarCurso(@RequestBody Course curso) {
		courseRepository.delete(curso);
	}
	
	@PutMapping
	public Course atualizarCurso(@RequestBody Course curso) {
		return courseRepository.save(curso);
	}
}
