package udemuProtatip.dataAccess;

import udemuProtatip.entities.Course;

public class HibernateCourseDao implements CourseDao	{

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile eklendi :" + course.getPrice());		
	}

}
