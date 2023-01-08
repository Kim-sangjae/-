package dayy11.sub2;

public class Student extends Object  // 따로 명시 되어있지않으면 항상 제일 상위 클래스에 있는것
{
	
	
	private int studentId;
	private String name;
	
	
	public Student(int studentId , String name) {
		this.studentId = studentId;
		this.name = name;
		
	}
	
	
	
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
