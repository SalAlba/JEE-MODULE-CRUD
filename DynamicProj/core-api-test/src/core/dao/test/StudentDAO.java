package core.dao.test;

import java.util.List;

import javax.ejb.Local;

import core.model.test.Student;

@Local
public interface StudentDAO {

	List<Student> getAllStudent();

	void createStudent(Student std);
	
	public Student findByStudent(Student std);
	
	public Student findById(int id);
	
	
	public void deleteUser(int id);
	
	public void updateStudent(Student std);

}