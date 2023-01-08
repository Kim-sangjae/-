package dayy12;

public class Ex04 {

	public static void main(String[] args) {
		
		Integer num1 = new Integer(10);
		Integer num2 = new Integer(10);
		
		System.out.println(num1 == num2);
		System.out.println(num1.equals(num2));
		System.out.println(num1.hashCode());
		System.out.println(num2.hashCode());

	}

}
