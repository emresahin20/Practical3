package udemuProtatip.business;

import java.util.ArrayList;
import java.util.List;

import udemuProtatip.core.BaseLogger;
import udemuProtatip.dataAccess.CategoryDao;
import udemuProtatip.dataAccess.InstructorDao;
import udemuProtatip.entities.Category;
import udemuProtatip.entities.Instructor;

public class CategoryManager {
	private CategoryDao categoryDao;
	private BaseLogger [] logger;
	private List<String> categoryName = new ArrayList<>();

	
	public CategoryManager(CategoryDao categoryDao,BaseLogger [] logger) {
		super();
		this.categoryDao = categoryDao;
		this.logger=logger;
	}

	public void add(Category category) {
		
		if(category.getCategoryName().length()>=2) {
			categoryDao.add(category);
			for(String name: categoryName) {
				if(name.equals(category.getCategoryName())) {
					System.out.println("Bu ders daha önceden kayıt edildi :" + category.getCategoryName());
				}
			}
			
		}
	
		
		for(BaseLogger baseLogger: logger) {
			baseLogger.log(category.getCategoryName());
		}
	}
}
