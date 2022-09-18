package com.greatLearning.springMVC.service;

import java.util.List;
import com.greatLearning.springMVC.entity.Student;

public interface StudentService {

	public List<Student> getAllStudents();

	public Student getStudentById(int studentId);

	public void saveStudent(Student student);

	public void updateStudent(Student student);

	public void deleteStudent(int studentId);
}
