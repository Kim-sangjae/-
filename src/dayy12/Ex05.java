package dayy12;

import java.lang.reflect.*;

public class Ex05 {

	public static void main(String[] args) {
		//Student s1 = new Student ( 1000, " 이름" );
		//Class cls = s1.getClass();
		Class cls = Student.class;
		
		Method[] methods = cls.getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}

	}

}
