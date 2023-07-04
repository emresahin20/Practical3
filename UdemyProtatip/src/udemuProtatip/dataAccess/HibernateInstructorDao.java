package udemuProtatip.dataAccess;

import udemuProtatip.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile eklendi :" + instructor.getFirstName());
		
	}

}
