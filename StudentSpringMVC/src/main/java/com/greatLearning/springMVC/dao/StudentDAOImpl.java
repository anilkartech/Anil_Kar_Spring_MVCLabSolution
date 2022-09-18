package com.greatLearning.springMVC.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.greatLearning.springMVC.entity.Student;

public class StudentDAOImpl implements StudentDAO {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public List<Student> getAllStudents() {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<Student> studentList = session.createQuery("From Student").list();
		session.getTransaction().commit();
		return studentList;
	}

	@Override
	public Student getStudentById(int studentId) {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		Student student = (Student)session.load(Student.class, studentId);
		session.getTransaction().commit();
		return student;
	}

	@Override
	public void saveStudent(Student student) {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();
		session.close();
		
	}

	@Override
	public void updateStudent(Student student) {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		session.update(student);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void deleteStudent(int studentId) {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		Student student = (Student) session.get(Student.class, studentId);
		session.delete(student);
		session.getTransaction().commit();
		session.close();
	}

}
