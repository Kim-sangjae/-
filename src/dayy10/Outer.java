package dayy10;

public class Outer {
	
	int outerNum = 10;
	
	class Inner {
		
		int innerNum = 20;
		
		static int innerStaticNum = 30; // JDk 15 = 오류  / JDk 16~ =오류 x
		
		void innerMethod() {
			
			
			
			
			System.out.println(Outer.this.outerNum+innerNum);
		}
		
		
		static void staticMethod() {
			System.out.println("내부 클래스 정적 메서드!");
		}
		
		
		
		
	}

}
