package com.greatLearning.springMVC.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.greatLearning.springMVC.dao.StudentDAO;
import com.greatLearning.springMVC.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO studentDAO;

	public StudentDAO getStudentDAO() {
		return studentDAO;
	}

	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentDAO.getAllStudents();
	}

	@Override
	public Student getStudentById(int studentId) {
		return studentDAO.getStudentById(studentId);
	}

	@Override
	public void saveStudent(Student student) {
		studentDAO.saveStudent(student);
	}

	@Override
	public void updateStudent(Student student) {
		studentDAO.updateStudent(student);

	}

	@Override
	public void deleteStudent(int studentId) {
		studentDAO.deleteStudent(studentId);

	}

}
