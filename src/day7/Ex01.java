package day7;

public class Ex01 {

	public static void main(String[] args) {
		
		Date s1 = new Date();
		/**
		s1.year = 2022;
		s1.month = 12;
		s1.day = 30;
		*/
		
		
		s1.setYear(2022);
		s1.setMonth(2);
		s1.setDay(29);
		
		
		s1.dateInfo();
		
		System.out.println(s1.getYear());

	}

}
