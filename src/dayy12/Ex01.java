package dayy12;

public class Ex01 {

	public static void main(String[] args) {
		Student s1 = new Student(1000,"이름");
		Student s2 = new Student(1000,"이름");
		
		
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		
		
	    System.out.println(s2);
	    System.out.println(s2.hashCode());
	    
	    
	    
	    System.out.println(s1 == s2);  // 주소값 비교
	    System.out.println(s1.equals(s2));

	}

}
