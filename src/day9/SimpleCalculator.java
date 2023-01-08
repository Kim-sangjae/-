package day9;

public class SimpleCalculator extends calculator {

	@Override
	public int add(int num1, int num2) {
		
		int result = num1 + num2;
		return result;
	}

	@Override
	public int minus(int num1, int num2) {
		
        int resultm = num1 - num2;
		return resultm;
	}

}
