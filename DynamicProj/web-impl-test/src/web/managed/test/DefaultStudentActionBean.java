package web.managed.test;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import core.manager.test.StudentManager;
import core.model.test.Student;
import core.sheard.test.StudentFactory;

import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class DefaultStudentActionBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private StudentManager studentManager; 
	
	// Entity
	private Student std= StudentFactory.getInstance().getStudent();

	public Student getStd() { return std; }

	public void setStd(Student std) { this.std = std; }
	
	// List
	public List<Student> getAllStudent(){ return studentManager.getAllStudent(); }
		
	
	// Create
	public String createStudent(){
		studentManager.createStudent(std);
		clean();
		return "index";
	}
	
	// Find
	public String findByStudent(Student std){std=studentManager.findByStudent(std); return "view"; }
	
	public String findStudentById(int id){std=studentManager.findById(id); return "view";}
	
	
	// Delete
	public void deleteUser(int id){ studentManager.deleteUser(id);}
	
	// Update
	public String updateStudent(Student std){this.std=std; return"edit";}
	public String updateStudent(){		
		Student tmp=StudentFactory.getInstance().getStudent();
		tmp.setId(this.std.getId());
		tmp.setName(this.std.getName());
		tmp.setEmail(this.std.getEmail());
		studentManager.updateStudent(tmp);
		clean();
		return "index";
	}
	
	////
	public void clean(){
		std.setId(0);
		std.setName("");
		std.setEmail("");
	}
}
