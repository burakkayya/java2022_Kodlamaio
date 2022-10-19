package business;

import core.logging.ILogger;
import dataAccess.ICourseDao;
import entities.Course;

public class CourseManager {

	private ICourseDao courseDao;
	private ILogger[] loggers;
	private Course[] courses;

	public CourseManager(ICourseDao courseDao, ILogger[] loggers, Course[] courses) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}

	public void add(Course course) throws Exception {

		for (Course c : courses) {
			if (c.getName() == course.getName()) {
				throw new Exception("Kurs ismi tekrar edemez");
			}
		}
		if (course.getPrice() < 0) {
			throw new Exception("Kurs fiyatı 0'dan küçük olamaz");
		}
		courseDao.add(course);
		for (ILogger logger : loggers) {
			logger.log(course.getName());
		}
	}

}
