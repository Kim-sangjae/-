package dayy11;



public class Ex02 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		
		try {
		
		int result = num1 / num2;
		System.out.println(result);
		
		} catch (ArithmeticException error) {
			error.printStackTrace();
			
		} finally {
			System.out.println("무조건 실행");
			
		}
		
		System.out.println("프로그램 실행 가능?");

	}

}
