package day9.sub2;

public class Ex01 {

	public static void main(String[] args) {
		
		SimpleCalculator cal = new SimpleCalculator();
		int result = cal.add(10, 20);
		int result2 = cal.minus( 30,20);
		int result3 = cal.plus(101, 20);
		
		System.out.println(result);
		
		System.out.println(result2);
		
		System.out.println(result3);
		
		Calculator.staticMethod();
		

	}

}
