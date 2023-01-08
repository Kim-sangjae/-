package day8;

public class C extends B {
	
	int numC= 30;
	
	public C() {
		
		super(); // B();  - 상위클래스 기본 생성자
		
		System.out.println(numC);
	}

}
