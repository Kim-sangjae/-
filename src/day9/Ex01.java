package day9;

public class Ex01 {

	public static void main(String[] args) {
		
		//calculator cal = new calculator();
		
		calculator cal = new SimpleCalculator();
		
		int result = cal.add(10, 20);
		
		calculator minus = new SimpleCalculator();
		
		int resultm = minus.minus(10,20);
		
		System.out.println(result);
		System.out.println(resultm);
		System.out.println(cal.num);
		cal.printInfo();
	}

}
