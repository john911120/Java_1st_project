package ex_interface;

// 실질적인 요청 처리 담당하는 클래스
public class CommandProcess {
	public void process(Command command) {
		command.excute();
	}
}
