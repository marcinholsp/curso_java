package entities;

public class Student {
	private String name;
	private String email;

	public Student(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String toString() {
		return ": " + getName() + ", " + getEmail();
	}
}
