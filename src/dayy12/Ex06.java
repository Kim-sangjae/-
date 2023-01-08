package dayy12;

import java.util.*;

public class Ex06 {

	public static void main(String[] args) {
		
		HashSet<Student> students = new HashSet<Student>();
		students.add(new Student(1000,"이름1"));
		students.add(new Student(1000,"이름1"));
		students.add(new Student(1000,"이름1"));
		students.add(new Student(1001,"이름2"));
		students.add(new Student(1001,"이름2"));
		
		for(Student s : students) {
		
		System.out.println(s);
		
		}

	}

}
