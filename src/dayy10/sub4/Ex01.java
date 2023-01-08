package dayy10.sub4;

public class Ex01 {

	public static void main(String[] args) {
		
		//Calculator cal = (x,y)->x+y;          // 람다식 - 함수를 값으로 사용
		int result = add((x,y) -> x+y,10,20);
		System.out.println(result);
		
		
		/*int result = cal.add(10, 20);
		System.out.println(result);*/
		
	//=======================================================================
		
		
		/**Calculator cal = new Calculator() {
			
			public int add(int num1 , int num2){
				return num1+ num2;
			}		
			
		};
		
		int result = cal.add(10, 20);
		System.out.println(result);*/

	}
	
	public static int add (Calculator cal, int num1 , int num2) {
		int result = cal.add(num1,num2);
		return result;
	}

}
