package com.greatLearning.springMVC.dao;

import java.util.List;
import com.greatLearning.springMVC.entity.Student;

public interface StudentDAO {

	public List<Student> getAllStudents();

	public Student getStudentById(int studentId);

	public void saveStudent(Student student);

	public void updateStudent(Student student);

	public void deleteStudent(int studentId);
}
