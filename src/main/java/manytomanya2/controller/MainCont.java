package manytomanya2.controller;

import java.util.ArrayList;
import java.util.List;

import manytomanya2.dao.CoursesDao;
import manytomanya2.dao.StudentDao;
import manytomanya2.dto.Course;
import manytomanya2.dto.Student;

public class MainCont {
public static void main(String[] args) {
	
//	Course course1=new Course();
//	course1.setId(1);
//	course1.setName("Java");
//	course1.setFees(5000);
//	
//	Course course2=new Course();
//	course2.setId(2);
//	course2.setName("AdvanceJava");
//	course2.setFees(10000);
//	
//	
//	Student student1=new Student();
	
	
	
//	student1.setId(1);
//	student1.setName("Avinash");
//	student1.setAddress("Bangalore");
//	
//	List<Course> coursesofAvi=new ArrayList<Course>();
//	coursesofAvi.add(course1);
//	coursesofAvi.add(course2);
//	
//	student1.setCourses(coursesofAvi);
//	
//	Student student2=new Student();
//	student2.setId(2);
//    student2.setName("Mrunali");
//    student2.setAddress("Chennai");
//    
//    student2.setCourses(coursesofAvi);
//	
//	CoursesDao coursesDao=new CoursesDao();
//	coursesDao.saveCourse(course1);
//	coursesDao.saveCourse(course2);
//	
//	StudentDao studentDao=new StudentDao();
//	studentDao.saveStudent(student1);
//	studentDao.saveStudent(student2);
	
	
//	UPDATE
	
	
//	Course course1=new Course();
//	course1.setName("Corejava");
//	course1.setFees(3000);
//	
//	CoursesDao coursesDao=new CoursesDao();
//	coursesDao.updateCourse(1, course1);
//	
//	
//	Student student=new Student();
//	student.setName("Avi");
//	student.setAddress("mangalore");
//	
//	
//	
//	
//	StudentDao studentDao=new StudentDao();
//	studentDao.updateStudent(1, student);
	
	
//	FIND
//	StudentDao studentDao=new  StudentDao();
//	studentDao.findStudent(1);
//    
//	CoursesDao coursesDao=new CoursesDao();
//	coursesDao.findCourse(1);
	
	
//	DELETE
//	CoursesDao coursesDao=new CoursesDao();
//	coursesDao.deleteCourse(1);
	
	StudentDao studentDao=new StudentDao();
	studentDao.deleteStudent(1);
	
	
	
	
	
	
	
	
}
}
