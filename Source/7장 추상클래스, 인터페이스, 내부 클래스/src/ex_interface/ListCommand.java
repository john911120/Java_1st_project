package ex_interface;

/*
 * 목록 보기 요청 처리 메소드를 구현하는 클래스 정의하기
 */

public class ListCommand implements Command {

	@Override
	public void excute() {
		System.out.println("전체 목록을 보여준다.");
	}

}
