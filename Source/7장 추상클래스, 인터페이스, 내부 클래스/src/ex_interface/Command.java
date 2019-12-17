package ex_interface;

/*
 * 인터페이스를 통해서도 다형성을 구현가능하다.
 * 인터페이스의 다형성 실습
 * 게시판에서 글 쓰기나 목록 보기 요청을 처리하는 예제
 * 작성일 : 1125
 */
public interface Command {
	void excute();
}
