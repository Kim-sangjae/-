package dayy11.sub1;

public class MemberService {
	
	public void login(String userId , String pass) {
		if(userId != "user") {
			throw new MemberNotFoundException("등록되지 않은 회원입니다.");
		}
		
		if (!pass.equals("123456")) {
			throw new PasswordIncorrectException("비밀번호가 일치하지 않습니다");
		}
		
		
		System.out.println("로그인 성공");
	}

}
