package dayy11.sub1;

public class Ex01 {

	public static void main(String[] args) {
		
		MemberService member = new MemberService();
		
		try {
		member.login("user3", "123456");
		
		} catch (MemberNotFoundException | PasswordIncorrectException e) {
			
			String message = e.getMessage();
			System.out.println(message);
		}

		
	}

}
