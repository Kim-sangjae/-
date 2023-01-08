package dayy12.sub1;

public class Ex06 {

	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(str1 == str2);
		
		
		String str3 = "abc"; 
		String str4 = "abc";   // 문자열 상수로 변형
		
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		System.out.println(str3 == str4);
		System.out.println(str2 == str3);
		System.out.println(str2.equals(str3));
		
		
		int num1 = 10;
		int num2 = 10;
		
		

	}

}
