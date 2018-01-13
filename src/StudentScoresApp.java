import java.util.Arrays;
import java.util.Scanner;

public class StudentScoresApp {

	public static void main(String[] args) {
		System.out.println("The Student Score application\n");
		
		Scanner sc = new Scanner(System.in);
		
		int nbrOfStudents = ConsoleStSc.getInt("Number of students: ", 0, 501);
		
		Student [] students = new Student [nbrOfStudents];
		
		for (int i = 0; i < students.length; i++) {
			System.out.println();
			System.out.println("STUDENT " + (i+1));
			String lastName = ConsoleStSc.getString("Last name: ");
			String firstName = ConsoleStSc.getString("First name: ");
			int score = ConsoleStSc.getInt("Score: ", -1, 101);
			students [i] = new Student(lastName, firstName, score);			
		}
		
		Arrays.sort(students);
		System.out.println();
		System.out.println("SUMMARY");
		for (int i =0; i < students.length; i++) {
			System.out.println(students[i].getLastName() + ", " + students[i].getFirstName()
								+ ": " +  students[i].getScore());		}
		
		sc.close();
	}

}
