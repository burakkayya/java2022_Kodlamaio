package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{

	
	public void add(Product product) {
		//Sadece db erişim kodları buraya yazılır.. SQL
		System.out.println("JDBC ile veritabanına eklendi");
	}
}
