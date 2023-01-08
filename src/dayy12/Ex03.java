package dayy12;

import java.lang.reflect.*;



public class Ex03 {

	public static void main(String[] args) {
		Student s1 = new Student(1000, "이름");
		Class cls1 =  s1.getClass();
		
		Method[] methods = cls1.getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}

	}

}
