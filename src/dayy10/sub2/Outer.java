package dayy10.sub2;

public class Outer {

	
	int outerNum = 10;
	
	
	static class Inner {
		
		int innerNum = 20;
		
		void innerMethod() {
			//outerMethod();
			System.out.println(innerNum);
		}
		
	}
	
	void outerMethod() {
		
	}
}
