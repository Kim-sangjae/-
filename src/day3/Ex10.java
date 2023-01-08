package day3;

public class Ex10 {

	public static void main(String[] args) {
		
		int total = 0;
	    int no=1;
		for( no=1;  no<=100; no++)
		   {  total+=no;   }
		System.out.println("실행 횟수 : " + (no - 1));
		System.out.println(total);
	}

}
