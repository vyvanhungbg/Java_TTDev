package ArrayListViDu;

public class Bai1 {
	int id;
	String firstName , lastName;
	String gender;
	String birth;
	String course;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return String.format(" %-10d %-10s %-10s %-10s %-10s %-10s",id, firstName,lastName,gender,birth,course );
	}

	public Bai1(int id, String firstName, String lastName, String gender, String birth, String course) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birth = birth;
		this.course = course;
	}
	
	
	
	
	

}
