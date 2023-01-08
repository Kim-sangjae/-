package day6;

public class Student {
	int studentId;
	String subject;
	String name;
	
	
	public Student() {
		// 객체 생성 이후 사용자가 추가할 작업
		// e x) 멤버 변수 초기화
	 studentId = 1003;
	 subject = " 자바3 ";
	 name = "이름3";
	 
	 
	}
	
	public Student(int _studentId, String _subject, String _name) {
		
		studentId = _studentId;
		subject = _subject;
		name = _name;
		
	}
	
	void studentInfo() {
		System.out.println(" 학번 :"+studentId+" 과목:"+subject + " 이름:" +name);
	}
	

}
