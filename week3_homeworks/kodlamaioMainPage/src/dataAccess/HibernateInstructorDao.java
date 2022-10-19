package dataAccess;

import entities.Instructor;

public class HibernateInstructorDao implements IInstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Egitmen : " + instructor.getName() + " Hibernate ile veritabanına eklendi");

	}

}
