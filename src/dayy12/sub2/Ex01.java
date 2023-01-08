package dayy12.sub2;

public class Ex01 {

	public static void main(String[] args) {
		
	//	Integer num1 = new Integer(10);
		
		Integer num1 = Integer.valueOf(10);
		Integer num2 = Integer.valueOf(10);
		
		System.out.println(System.identityHashCode(num1));
		System.out.println(System.identityHashCode(num2));
		
		//double num2 = num1.doubleValue();

	}

}
