package udemuProtatip.business;

import java.util.ArrayList;
import java.util.List;

import udemuProtatip.core.BaseLogger;
import udemuProtatip.dataAccess.InstructorDao;
import udemuProtatip.entities.Instructor;

public class InstructorManager {

	private InstructorDao instructorDao;
	private BaseLogger [] logger;
	private List<String> instructorName = new ArrayList<>();

	
	public InstructorManager(InstructorDao instructorDao,BaseLogger [] logger) {
		super();
		this.instructorDao = instructorDao;
		this.logger=logger;
	}

	public void add(Instructor instructor) {
		
		if(instructor.getFirstName().length()>=2) {
			for(String name: instructorName) {
				if(name.equals(instructor.getFirstName())) {
					System.out.println("Bu kullanıcı daha önceden kayıt edildi:" + instructor.getFirstName());
				}
			}
			
		}
	
		instructorDao.add(instructor);
		for(BaseLogger baseLogger: logger) {
			baseLogger.log(instructor.getFirstName());
		}
	}
	
}
