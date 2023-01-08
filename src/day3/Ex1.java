package day3;

public class Ex1 {

	public static void main(String[] args) {
		int num = 9;
		
		if ( num>10 ) 
		{ System.out.println("10보다 크다"); }
		else
		{ System.out.println("10보다 작다"); }
		
		String str = num>=10 ? "10보다 크다" : "10보다 작다";
		System.out.println(str);
		

	}

}
