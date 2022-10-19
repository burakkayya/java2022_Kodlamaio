package dataAccess;

import entities.Course;

public class HibernateCourseDao implements ICourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Kurs : " + course.getName() + " Hibernate ile veritabanına eklendi");

	}

}
