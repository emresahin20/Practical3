package udemuProtatip.dataAccess;

import udemuProtatip.entities.Course;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Jdbc ile eklendi :" + course.getPrice());		

		
	}

}
