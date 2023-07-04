package udemuProtatip;


import udemuProtatip.business.CategoryManager;
import udemuProtatip.business.CourseManager;
import udemuProtatip.business.InstructorManager;
import udemuProtatip.core.BaseLogger;
import udemuProtatip.core.DatabaseLogger;
import udemuProtatip.core.FileLogger;
import udemuProtatip.dataAccess.HibernateCourseDao;
import udemuProtatip.dataAccess.HibernateInstructorDao;
import udemuProtatip.dataAccess.JdbcCategoryDao;
import udemuProtatip.entities.Category;
import udemuProtatip.entities.Course;
import udemuProtatip.entities.Instructor;

public class Main {

	public static void main(String[] args) {
		
		
		
		Course course1= new Course(200);
		
		BaseLogger[]loggers= {new DatabaseLogger(),new FileLogger()};
		
		CourseManager courseManager=new CourseManager(new HibernateCourseDao(),loggers );
		
		courseManager.add(course1);
		
	
		Category category1= new Category("Yazılım");
		
		CategoryManager categoryManager=new CategoryManager(new JdbcCategoryDao(),loggers);
		categoryManager.add(category1);
		
		Instructor instructor1=new Instructor("Engin","Demiroğ","12223123321");
		
		InstructorManager instructorManager=new InstructorManager(new HibernateInstructorDao(),loggers);
		instructorManager.add(instructor1);
		
		
		
		
		
		
		
	}

}
