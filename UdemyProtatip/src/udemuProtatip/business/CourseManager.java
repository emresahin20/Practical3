package udemuProtatip.business;

import udemuProtatip.core.BaseLogger;
import udemuProtatip.dataAccess.CourseDao;
import udemuProtatip.entities.Course;

public class CourseManager {

	private CourseDao courseDao;
	private BaseLogger [] logger;
	
	
	public CourseManager(CourseDao courseDao, BaseLogger[] logger) {
		super();
		this.courseDao = courseDao;
		this.logger = logger;
	}


	public void add(Course course) {
		
		if(course.getPrice()<=0) {
			System.out.println("Ders Fiyatı 0 veya 0 dan küçük olamaz");
		}
		else{
			System.out.println("Ders Eklendi");
		}
		courseDao.add(course);
		for(BaseLogger baseLogger:logger) {
			baseLogger.log(course.toString());
		}
		
	}
	
	

}
