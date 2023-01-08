package day3;

public class pr2 {

	public static void main(String[] args) {
		//학생40 방 10개 방번호0~9  한방에 4명 학생1 방번호1
		
		/*
		 * 1%10 >1
		 * 2%10 >2
		 * 3
		 * 4
		 * 5
		 * 6  -> 0, 6
		 * 7 -> 0, 7
		 * 8 -> 0, 8
		 * 9 -> 0, 9
		 * 10 -> 1, 0
		 * 11 -> 1, 1
		 * 12 -> 1, 2
		 * 13 -> 1, 3
		 * 14 -> 1, 3
		 * ...
		 * 19 -> 1, 9
		 * 20 -> 2, 0*/
		
for(int str =1; str<=40; str++) {
	int roomNo = str%10; // 0 ~ 9 
	System.out.println("학생"+str+" 방번호"+roomNo);
}		

	}

}
