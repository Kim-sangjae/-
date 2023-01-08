package day6;

public class Ex01 {

	public static void main(String[] args) {
		
		Student s1 = new Student(); // 생성자 메서드
		
		s1.name= "이름1";
	    s1.studentId = 1000;
	    s1.subject = "자바 ";
	    
	    Student s2 = new Student();
	    
	    s2.name = "이름2";
	    s2.studentId = 1002;
	    s2.subject = "자바바";
	    
	    Student s3 = new Student();
	    
	    //Student s3 = s2 = s1;
	    // s1 = null;  		
	    
	    s1.studentInfo();
	    s2.studentInfo();
	    s3.studentInfo();
	  
	}

}
