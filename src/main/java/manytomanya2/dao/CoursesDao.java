package manytomanya2.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.swing.border.EtchedBorder;

import manytomanya2.dto.Course;

public class CoursesDao {
public EntityManager getEntityManager() {
	return Persistence.createEntityManagerFactory("vinod").createEntityManager();
}
public void saveCourse(Course course) {
	EntityManager entityManager=getEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.persist(course);
	entityTransaction.commit();
}


public void updateCourse(int id,Course course) {
	
	EntityManager entityManager=getEntityManager();
	Course dbCourse=entityManager.find(Course.class, id);
	if(dbCourse!=null) {
//		id is present then i can update the data
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		course.setId(id);
		entityManager.merge(course);
		
		entityTransaction.commit();
		
	}else {
		System.out.println("Sorry id is not present");
	}
	
	
	
}
public void deleteCourse(int id) {
	
	EntityManager entityManager=getEntityManager();
	Course dbCourse=entityManager.find(Course.class, id);
	if(dbCourse!=null) {
//		id is present then i can update the data
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.remove(dbCourse);
		
		entityTransaction.commit();
		
	}else {
		System.out.println("Sorry id is not present");
	}
	
	
	
}


public void findCourse(int id) {
	
	EntityManager entityManager=getEntityManager();
	Course dbCourse=entityManager.find(Course.class, id);
	if(dbCourse!=null) {
//		id is present then i can update the data
		System.out.println(dbCourse);
	}else {
		System.out.println("Sorry id is not present");
	}
	
	
	
}













}
