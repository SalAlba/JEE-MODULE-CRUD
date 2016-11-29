package core.dao.test;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.*;

import core.model.test.DefaultStudent;
import core.model.test.Student;

@Stateless
public class DefaultStudentDAO implements StudentDAO {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Student> getAllStudent(){ 
		return em.createNamedQuery("DefaultStudent.findAll").getResultList(); 
	}
	
	@Override
	public void createStudent(Student std){em.persist(std);}
	
	@Override
	public Student findByStudent(Student std){ return em.find(DefaultStudent.class, std.getId());}
	
	@Override
	public Student findById(int id){return em.find(DefaultStudent.class, id);}
	
	@Override
	public void deleteUser(int id){ em.remove(em.find(DefaultStudent.class, id));}
	
	@Override
	public void updateStudent(Student std){ em.merge(std); }
}
