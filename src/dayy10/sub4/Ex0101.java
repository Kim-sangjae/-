package dayy10.sub4;

public class Ex0101 {

	public static void main(String[] args) {
		
		
		/*Calculator cal = (num1,num2)-> num1+num2;*/ // return nu1+num2 
		
		//Calculator cal = (x,y)->x+y;
		
		
		//int result = add((x,y)->x+y,10,20);
		//System.out.println(result);
		
		
		//int result = cal.add(10, 20);
		//System.out.println(result);
		
		Calculator cal = getAdd();
		int result = cal.add(10, 20);
		System.out.println(result);
		

	}
	
	
	/*public static int add ( Calculator cal, int num1,int num2) {
		
		int result = cal.add(num1, num2);
		return result;
		
	}*/
	
	
	public static Calculator getAdd() {
		
		return (x,y)-> x + y ;
	}

}
