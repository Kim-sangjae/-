package dayy12.sub1;

public class Ex01 {

	public static void main(String[] args) {
		
		String str1 = new String("abc");   // abc -> private final byte[]...  // 불변 (final)
		String str2 = new String("def");   // def -> private final byte[]...  // 불변 (final)
		
		System.out.println("str1: " + System.identityHashCode(str1));
		System.out.println("str2: " + System.identityHashCode(str2));
		
		
		str1 += str2;
		System.out.println("str1: " + System.identityHashCode(str1));
		
		str1 += "ghi";
		System.out.println("str1: " + System.identityHashCode(str1));
		
		str1 += "jkl";
		System.out.println("str1: " + System.identityHashCode(str1));

	}

}
