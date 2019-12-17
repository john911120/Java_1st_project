package Method_Ex;

public class Args {
	/*
	 * 인수 전달 방식 연습 예제1
	 * 작성일  : 1115
	 * 자바는 메소드에 인자를 전달할 때는 값이 복사되어서 전송된다.
	 */
	int x;
	void add(int x) {
		x = x + 50;
	}
	
	void add(Args arg) {
		arg.x = arg.x + 40;
	}
	void addNew(Args arg) {
		arg = new Args();
	}
	void add(int[] arr) {
		arr[0]++;
	}
}

