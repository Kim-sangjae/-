package dayy12.sub2;

public class Ex02 {

	public static void main(String[] args) {
		
		int num1 = 10;
		Integer num2 = num1;  // integer.valueOf(num1);  -> 오토 박싱
		
		
		int num3 = num1 + num2; //num1 + num2.intValue() -> int; // 언박싱
		
		System.out.println(num3);  // int + int
		
		
		Integer num4 = Integer.valueOf(20);
		int num5 = num4; // num4.intValue();   // 언박싱
		

	}

}
