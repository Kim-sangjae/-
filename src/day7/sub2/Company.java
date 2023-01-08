package day7.sub2;

public class Company {
	
	private static Company instance = new Company();
	
	
	private Company() { }
	
	public static Company getInstance() {
		return instance;
	}

}
