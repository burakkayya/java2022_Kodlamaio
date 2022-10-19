package dataAccess;

import entities.Category;

public class JdbcCategoryDao implements ICategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Kategori : " + category.getName() + " Jdbc ile veritabanına eklendi");

	}

}
