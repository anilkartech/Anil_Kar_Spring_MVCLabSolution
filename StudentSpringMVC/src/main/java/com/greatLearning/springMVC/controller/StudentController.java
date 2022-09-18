package com.greatLearning.springMVC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.greatLearning.springMVC.entity.Student;
import com.greatLearning.springMVC.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	
	@GetMapping("/list")
	public String viewStudentList(Model model) {
		List<Student> students = studentService.getAllStudents();
		model.addAttribute("studentList", students);
		return "view-student-list";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAddStudent(Model model) {
		model.addAttribute("student", new Student());
		return "student-add-form";
	}
	
	@PostMapping("/save")
	public String saveNewCustomerInDatabase(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "redirect:/student/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdateStudent(@RequestParam("studentId") int id, Model model) {
		Student student = studentService.getStudentById(id);
		model.addAttribute("student", student);
		return "student-update-form";
	}
	
	@PostMapping("/editsave")
	public String saveEditedCustomerInDatabase(@ModelAttribute("student") Student student) {
		studentService.updateStudent(student);
		return "redirect:/student/list";
	}
	
	@RequestMapping("/deleteStudent/{id}")
	public String deleteCustomerFromDatabase(@PathVariable int id) {
		studentService.deleteStudent(id);
		return "redirect:/student/list";
	}
	
}
