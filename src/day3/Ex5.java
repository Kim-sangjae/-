package day3;

public class Ex5 {

	public static void main(String[] args) {
		
		String medal ="동";
		
		switch(medal) {
		case "금" :
			System.out.println("1등");
			break;
		case "은" :
			System.out.println("2등");
			break;
		case "동" :
		    System.out.println("3등");
		    break;
		
		default :
			System.out.println("순위권 밖");
		}

	}

}
