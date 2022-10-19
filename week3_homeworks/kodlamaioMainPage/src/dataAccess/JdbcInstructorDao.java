package dataAccess;

import entities.Instructor;

public class JdbcInstructorDao implements IInstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Egitmen : " + instructor.getName() + " Jdbc ile veritabanına eklendi");

	}

}
