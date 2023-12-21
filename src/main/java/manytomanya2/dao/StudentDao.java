package manytomanya2.dao;

import javax.persistence.Embeddable;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytomanya2.dto.Course;
import manytomanya2.dto.Student;

public class StudentDao {
	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("vinod").createEntityManager();
	}
	public void saveStudent(Student student) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
	}
	
	public void updateStudent(int id,Student student) {
		EntityManager entityManager=getEntityManager();
        Student dbStudent=entityManager.find(Student.class, id);
        if(dbStudent!=null) {
//        	id ispresent then i can update the data
        	
        	EntityTransaction entityTransaction=entityManager.getTransaction();
        	entityTransaction.begin();
        	
        	student.setId(id);
        	student.setCourses(dbStudent.getCourses());
        	
        	entityManager.merge(student);
        	entityTransaction.commit();
        }else {
        	System.out.println("Sorry id is not present");
        }  
	}
	
	
	public void deleteStudent(int id) {
		EntityManager entityManager=getEntityManager();
        Student dbStudent=entityManager.find(Student.class, id);
        if(dbStudent!=null) {
//        	id ispresent then i can update the data
        	
        	EntityTransaction entityTransaction=entityManager.getTransaction();
        	entityTransaction.begin();
        	entityManager.remove(dbStudent);
        	entityTransaction.commit();
        }else {
        	System.out.println("Sorry id is not present");
        }  
	}
	
	public void findStudent(int id) {
		EntityManager entityManager=getEntityManager();
        Student dbStudent=entityManager.find(Student.class, id);
        if(dbStudent!=null) {
//        	id ispresent then i can update the data
        	System.out.println(dbStudent);
        }else {
        	System.out.println("Sorry id is not present");
        }  
	}
	
	
	
	
	
	
}
