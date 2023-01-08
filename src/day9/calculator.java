package day9;

public  abstract class calculator {
	
	public int num = 10;
	
	public abstract int add (int num1, int num2);
	public abstract int minus(int num1 , int num2);

	
	
	public void printInfo() {
		System.out.println("출력");
	}
}
