package day7.sub1;

public class Student {
	
	final static int num =10;
	//static int num = 10;
	
	int studentId;
	String name;
	static String subject =" 자바1 ";
	
	static void staticPrinter() {
		System.out.println("정적 메서드");
	}
	void printer() {
		System.out.println(name + " 름름, " +studentId + 2100+subject );
		System.out.println("인스턴스 메서드");
		staticPrinter();
	}

	@Override
	public String toString() {
		return "Student [studentId="+studentId +" ,name=" + name + ", subject=" + subject + "]";
	}
	
	
	

}
