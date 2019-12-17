package ex_interface;

/*
 * 글 쓰기 요청 처리 메소드를 구현하는 클래스 정의
 */
public class WriteCommand implements Command {

	@Override
	public void excute() {
		System.out.println("글을 새로 작성하기");
	}

}
