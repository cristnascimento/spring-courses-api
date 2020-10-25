package com.github.cristnascimento.coursesapp.boostrap;

import java.util.Calendar;
import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.github.cristnascimento.coursesapp.models.Course;
import com.github.cristnascimento.coursesapp.models.Teacher;
import com.github.cristnascimento.coursesapp.repositories.CourseRepository;
import com.github.cristnascimento.coursesapp.repositories.TeacherRepository;

@Component
public class BootstrapData implements CommandLineRunner {

	private final TeacherRepository teacherRepository;
	private final CourseRepository courseRepository;
	
	public BootstrapData(TeacherRepository teacherRepository, CourseRepository courseRepository) {
		this.teacherRepository = teacherRepository;
		this.courseRepository = courseRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Teacher teacher = new Teacher("Bob Lee");
		Course course = new Course("Learn Java", "Learn Java in 2 weeks", createDate(2020, 12, 8, 17, 0) , 50);
		teacher.getCourses().add(course);
		course.getTeachers().add(teacher);
		
		teacherRepository.save(teacher);
		courseRepository.save(course);
		
		System.out.println("Running spring application");
		System.out.println("Teachers count: " + teacherRepository.count());
	}
	
	private Date createDate(int year, int month, int date, int hour, int minute) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month - 1);
		cal.set(Calendar.DAY_OF_MONTH, date);
		cal.set(Calendar.HOUR, hour);
		cal.set(Calendar.MINUTE, minute);
		return  cal.getTime();
	}

}
