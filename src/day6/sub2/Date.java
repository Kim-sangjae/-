package day6.sub2;

public class Date {
	
	private int year;
	private int month;
	private int day;
	
	public void setYear(int _year) {
		
		year =_year;
	
	}
	
	public int getYear() {
		return year;
	}
	
	
	public void setMonth(int _month) {
		
		month = _month;
		
	}
	public int getMonth() {
		return month;
	}
	
	public void setDay(int _day) {
		
		if(month==2 && _day >28) {
			_day = 28;
		}
		day= _day;
		
	}
	public int getday() {
		return day;
	}
	public void dateInfo() {
		
		System.out.println("year=" + year + " month="+ month+" day="+day);
	}

}
