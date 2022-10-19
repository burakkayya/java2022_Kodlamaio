import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.ILogger;
import core.logging.MailLogger;
import dataAccess.HibernateCategoryDao;
import dataAccess.HibernateCourseDao;
import dataAccess.HibernateInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {

		Category category1 = new Category(1, "Programming");
		Category category2 = new Category(2, "Language");
		Category[] categories = { category1, category2 };
		Category category3 = new Category(3, "Self-Improvment");

		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setName("Engin");
		instructor1.setLastname("Demiroğ");

		Instructor instructor2 = new Instructor();
		instructor1.setId(2);
		instructor1.setName("Burak");
		instructor1.setLastname("Kaya");

		Course course1 = new Course(1, "Java", category1, instructor1, 100);
		Course course2 = new Course(2, "English", category2, instructor1, 50);
		Course[] courses = { course1, course2 };
		Course course3 = new Course(3, "Look Up", category3, instructor2, 200);

		ILogger[] loggers = { new FileLogger(), new DatabaseLogger(), new MailLogger() };

		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers, categories);
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers, courses);
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);

		categoryManager.add(category3);

		courseManager.add(course3);

		instructorManager.add(instructor1);

	}

}
