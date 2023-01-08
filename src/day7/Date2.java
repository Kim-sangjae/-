package day7;

public class Date2 {

	private int year;
	private int month;
	private int day;
	
	public Date2() {
		this(2022,13,42);
	}
	
	
	
	public Date2(int year,int month, int day) {
		
		this.year = year;
		this.month = month;
		this.day = day;
		
		if(month > 12) {
			month = 12;
			this.month = month;}
		
		if(month == 2 && day >28 ) {
			day = 28;
			this.day=day;}
		
		 if (day >31) {
		    	day = 31;
		    this.day = day;}
	}
	
	   
	    
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	///
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	///
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		
	
		this.day = day;
	}
	///
	
	
	
	public void printThis() {
		System.out.println(this);
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Date2 [" + year+"년 " + month+"월 " + day + "일 ]";
	}
	
	
	
	
}
