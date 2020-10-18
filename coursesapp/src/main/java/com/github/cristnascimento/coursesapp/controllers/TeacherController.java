package com.github.cristnascimento.coursesapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.cristnascimento.coursesapp.repositories.TeacherRepository;

@Controller
public class TeacherController {
	
	private TeacherRepository teacherRepository;

	public TeacherController(TeacherRepository teacherRepository) {
		super();
		this.teacherRepository = teacherRepository;
	}

	@RequestMapping("/teachers")
	public String getTeachers(Model model) {
		
		model.addAttribute("teachers", teacherRepository.findAll());
		
		return "teachers";
	}
}
