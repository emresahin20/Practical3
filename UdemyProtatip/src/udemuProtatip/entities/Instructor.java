package udemuProtatip.entities;

public class Instructor extends Base {

	private String firstName;
	private String lastName;
	private String about;

	public Instructor(String firstName, String lastName, String about) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.about = about;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}
}


