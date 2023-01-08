package dayy11;

public class Ex03 {

	public static void main(String[] args) {
		
		try {
			
		int result = divide(10,0);
		System.out.println(result);
		
		 }catch (RuntimeException e) {
			e.printStackTrace();
		}
		System.out.println("실행");
		
		
	}
	
	
	
	public static int divide(int num1 , int num2) {
		
	
		int result = num1/num2;
		
		return result;
	}

}
