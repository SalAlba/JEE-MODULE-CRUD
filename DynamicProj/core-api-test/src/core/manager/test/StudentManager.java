package core.manager.test;

import java.util.List;

import core.model.test.Student;

public interface StudentManager {

	List<Student> getAllStudent();

	void createStudent(Student std);

	public Student findByStudent(Student std);
	
	public Student findById(int id);
	
	
	public void deleteUser(int id);
	
	public void updateStudent(Student std);
}