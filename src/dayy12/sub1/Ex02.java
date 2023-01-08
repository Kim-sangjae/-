package dayy12.sub1;

public class Ex02 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		System.out.println(System.identityHashCode(sb));
		
		sb.append(new String("abc"));
		System.out.println(System.identityHashCode(sb));
		
		sb.append(new String("def"));
		System.out.println(System.identityHashCode(sb));
		
		sb.append(new String("ghi"));
		System.out.println(System.identityHashCode(sb));
		
		sb.append(new String("jkl"));
		System.out.println(System.identityHashCode(sb));
		
		String str = sb.toString();
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		
	}

}
