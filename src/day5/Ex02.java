package day5;

public class Ex02 {

	public static void main(String[] args) {
		
		Student s1 = new Student();      
		
		// s1 -> 객체의 주소값을 참조하는 변수  //Student -> 참조 자료형
        // 기본자료형 외는 전부 클래스 -> 기본자료형 외에 전부는 참조자료형		
		
		s1.name = "이름1";
		s1.studentId = 1000;
		s1.subject = "자바";

		
		s1.info();
		
		//System.out.println(s1);
		
		Student s2 = new Student();
		
		s2.name ="이름2";
		s2.studentId = 1001;
		s2.subject = "자바2";
		
		s2.info();
		
		//System.out.println(s2);
		
		//System.out.println(s1 == s2);
		
		
		Student s3 = s2;
		s3.name ="이름3";
	    s3.info();
	    
	    
	}

}
