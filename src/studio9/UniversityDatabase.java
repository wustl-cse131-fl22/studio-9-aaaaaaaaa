package studio9;

import assignment7.Student;
import java.util.HashMap;

public class UniversityDatabase {
	private final HashMap<String, Student> map;
	
	
	/**
	 * 
	 */
	public UniversityDatabase() {
		map = new HashMap<>();
	}

	//TODO: Complete this class according to the studio instructions

	public void addStudent(String accountName, Student student) {
		map.put(accountName, student);
	}

	public int getStudentCount() {
		int key = map.size();
		return key;
	}

	public String lookupFullName(String accountName) {
		if (map.get(accountName) == null) {
			return null;
		}
		String name = map.get(accountName).getFullName();
		return name;
	}

	public double getTotalBearBucks() {
		double total = 0;
		for(String s : map.keySet()) {
			total += map.get(s).getBearBucksBalance();
		}
		return total;
	}
}
