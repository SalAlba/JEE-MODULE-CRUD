package core.manager.test;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import core.dao.test.StudentDAO;
import core.model.test.Student;

@Stateless
public class DefaultStudentManager implements StudentManager {

	@Inject
	private StudentDAO studentDAO;
	
	@Override
	public List<Student> getAllStudent(){ return studentDAO.getAllStudent();}

	@Override
	public void createStudent(Student std){ studentDAO.createStudent(std);}
	
	@Override
	public Student findById(int id){ return studentDAO.findById(id); }
	
	@Override
	public Student findByStudent(Student std){ return studentDAO.findByStudent(std); }
	
	@Override
	public void deleteUser(int id){ studentDAO.deleteUser(id);}
	
	@Override
	public void updateStudent(Student std){ studentDAO.updateStudent(std);}
}
