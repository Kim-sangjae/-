package dayy12.sub1;

public class Ex05 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		
		sb.append(new String("abc"));
		System.out.println(System.identityHashCode(sb));
		sb.append(new String("def"));
		System.out.println(System.identityHashCode(sb));
		sb.append(new String("ghi"));
		System.out.println(System.identityHashCode(sb));
		sb.append(new String("jkl"));
		System.out.println(System.identityHashCode(sb));
		
		System.out.println(sb);
		
		
		String str = sb.toString();
		System.out.println(System.identityHashCode(str));
		System.out.println(str);
		
		
		

	}

}
