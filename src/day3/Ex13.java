package day3;

public class Ex13 {

	public static void main(String[] args) {
		int total=0;
		int no=1;
		for(; no<=100; no++) {
			if(no%2==0) {
				continue;}
			total+=no;
		}
		
		
System.out.println("실행횟수"+no);
System.out.println(total);
	}

}
