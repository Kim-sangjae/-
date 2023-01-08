package dayy10.sub3;

public class Outer {
	
	public Calculator getCalculator() {
		
		int num3 = 30;  // getCalculator 메서드의 지역변수 
	 	                //상수화 (데이터 영역화) , (fianl) int num3
		
		
		Calculator cal = new Calculator() {

			@Override
			public int add(int num1, int num2) {
				int result = num1 + num2 + num3;
				return result;
			}
			
			
			
		};
		
		return cal;
		
		
		
	}
	

}
