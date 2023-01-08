package day3;

public class Ex7 {

	public static void main(String[] args) {
		
		int no = 1; // 초기화값
		int total = 0;
		
		
		while(no<=100) { //조건식
			if(no%2 ==0) {
				total += no;
			}
			
			no++;
		}
System.out.println(total);
	}

}
