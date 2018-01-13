
@SuppressWarnings("rawtypes")
public class Student implements Comparable {
	
	private String firstName;
	private String lastName;
	private int score;
	
	public Student() {
		firstName = "";
		lastName = "";
		score = 0;
	}
	
	public Student(String fName, String lName, int s ) {
		this.firstName = fName;
		this.lastName = lName;
		this.score = s;		
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
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public int compareTo(Object o) {
		Student s = (Student) o;
		int lastNameCompare = this.getLastName().compareToIgnoreCase(s.getLastName());
		if (lastNameCompare != 0) {
			return lastNameCompare;
		}
		else {
		  return lastNameCompare = this.getFirstName().compareToIgnoreCase(s.getFirstName());
		}  
	}
}
