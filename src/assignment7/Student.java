package assignment7;

//TODO: Copy a working Student class from Assignment 7 over this file.
public class Student {
	
		private String firstName;
		private String lastName;
		private int studentId;
		private int attemptedCredits;
		private int passingCredits;
		private double totalGradeQualityPoints;
		private double bearBucksBalance;
		
		private double qualityPoints;
		private String classStanding;
		private double refund;
		
	public Student(String firstName, String lastName, int studentId) { // method for new student
			this.firstName = firstName;
			this.lastName = lastName;
			this.studentId = studentId;
		 // write method for student name
		}

	public String getFullName() { // getting student full name
		return firstName + " " + lastName;
	}

	public int getId() { //setting id number
		return studentId;
	}

	public void depositBearBucks(double amount) { // add bb to balance
		this.bearBucksBalance += amount;
	}

	public double getBearBucksBalance() { // get bbbal
		return bearBucksBalance;
	}
}
