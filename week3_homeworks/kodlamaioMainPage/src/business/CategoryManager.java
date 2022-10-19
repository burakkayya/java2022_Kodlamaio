package business;

import core.logging.ILogger;
import dataAccess.ICategoryDao;
import entities.Category;

public class CategoryManager {

	private ICategoryDao categoryDao;
	private ILogger[] loggers;
	private Category[] categories;

	public CategoryManager(ICategoryDao categoryDao, ILogger[] loggers, Category[] categories) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}

	public void add(Category category) throws Exception {
		for (Category c : categories) {
			if (c.getName() == category.getName()) {
				throw new Exception("Kategori ismi tekrar edemez");
			}
		}
		categoryDao.add(category);
		for (ILogger logger : loggers) {
			logger.log(category.getName());
		}
	}

}
