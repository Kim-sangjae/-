package dayy11.sub2;

public class Ex01 {

	public static void main(String[] args) {
		
		
		//Object s1 = new Student();
		
		Student s1 = new Student (1000, "이름");
		Student s2 = new Student (1000, " 이름");
		System.out.println(s1);  // s1.toString();
		System.out.println( s1.hashCode() ); // 인스턴스(객체) 의 주소
		System.out.println (s1 == s2);
		System.out.println( s1.equals(s2) );
	}

}
