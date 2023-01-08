package dayy12.sub1;

public class Ex04 {

	public static void main(String[] args) {
		
		String s1 = new String ("abc");  // final byte[]..
		String s2 = new String ("def");
		
		System.out.println(System.identityHashCode(s1));
		s1+=s2;
		System.out.println(System.identityHashCode(s1));
		
		s1+= new String ("ghi");
		System.out.println(System.identityHashCode(s1));

	}

}
