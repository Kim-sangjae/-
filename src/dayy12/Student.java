package dayy12;

public class Student extends Object {
	
	private int Id;
	private String name;
	private int id;
	
	public Student (int id , String name) {
	
	
		
	}	
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Student) { 
		 Student student = (Student)obj;
		
	      if (Id == student.getId() && name.equals( student.getName() ) ) {
	    	
	    	return true;
	    }
		}
		
		
		return false;
	}


	@Override
	public int hashCode() {
		
		return name.hashCode() + id;
	}
	
	
	
	
	

}
