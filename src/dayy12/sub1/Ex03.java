package dayy12.sub1;

public class Ex03 {

	public static void main(String[] args) {
		String str1 = new String("abc");
		
		String str2 = new String("abc");   //  new 새로운 객체를 생성 
		
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		
		String str3 = "abc";   // 문자열 상수
		String str4 = "abc";   // 문자열 상수 데이터 상수영역에 abc 라는 공간이 하나만 지정 (효율)
		
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		System.out.println(str3 == str4);   //  == 주소비교
		System.out.println(str2.equals(str3));  //  equals() 문자값 비교 
		
		
		int num1 = 10;
		int num2 = 10;
		
		
		System.out.println(System.identityHashCode(num1));
		System.out.println(System.identityHashCode(num2));
		

	}

}
