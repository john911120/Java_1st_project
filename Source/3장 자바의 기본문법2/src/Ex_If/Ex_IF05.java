package Ex_If;

public class Ex_IF05 {
	/*
	 * 아이디와 비밀번호 일치 여부를 판단해서 로그인을 처리하는 예제
	 * 3장 자바의 기초문법2 공부한 프로젝트가 날라가서 재 작성하고 저장 하는 단계입니다.
	 * 다중 if문 예제
	 */
	
	/*
	 * 프로그램 작성 조건
	 * 아이디 : java
	 * 비밀번호 : java
	 * 아이디가 일치하지만 비밀번호가 틀리다면 "비밀번호가 맞지 않습니다." 메시지 출력
	 * 아이디와 비밀 번호가 일치하면 "로그인 성공" 이라는 메시지를 출력한다.
	 * 아이디가 틀렸을 경우에는 "회원 정보가 일치 하지 않습니다."라고 메시지를 출력한다.
	 */
	public static void main(String[] args) {
		String id = args[0];
		String password = args[1];
		
		if(!id.equals("java")) {
			System.out.println("회원 정보가 일치 하지 않습니다.");
		} else if (!password.equals("java")) {
			System.out.println("비밀번호가 맞지 않습니다.");
		} else {
			System.out.println("로그인 성공");
		}
		
	}
}
