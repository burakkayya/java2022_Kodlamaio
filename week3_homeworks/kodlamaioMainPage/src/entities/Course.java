package entities;

public class Course {

	private int id;
	private String name;
	private Category category;
	private Instructor instructor;
	private double price;

	public Course() {

	}

	public Course(int id, String name, Category category, Instructor instructor, double price) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.instructor = instructor;
		this.price = price;
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

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
