package entities;

public class Instructor {

	private int id;
	private String name;
	private String lastname;
	private Course[] courses;

	public Instructor() {

	}

	public Instructor(int id, String name, String lastname, Course[] courses) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.courses = courses;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Course[] getCourses() {
		return courses;
	}

	public void setCourses(Course[] courses) {
		this.courses = courses;
	}

}
