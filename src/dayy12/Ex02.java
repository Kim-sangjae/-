package dayy12;

public class Ex02 {

	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		
		
		System.out.println(str1 == str2);   // 주소값 비교
		System.out.println(str1.equals(str2));  // String class 에서는 equals 는 문자값을 비교
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}

}
