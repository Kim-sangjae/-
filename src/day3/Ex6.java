package day3;

public class Ex6 {

	public static void main(String[] args) {
		
		int num = 1; //초기화값
		int total = 0;
		
		while(num<=100) {
			total += num; // total = total + num;
			num++;		// 증감식
		}
		
		System.out.println(total);

	}

}
