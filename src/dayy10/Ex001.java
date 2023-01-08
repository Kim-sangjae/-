package dayy10;

public class Ex001 {

	public static void main(String[] args) {
		Animal animal = new Animal() {
			public void move () {
				
				System.out.println(" 움직인다 ");
			}
			
		};
		
		animal.move();
		
	}

}
