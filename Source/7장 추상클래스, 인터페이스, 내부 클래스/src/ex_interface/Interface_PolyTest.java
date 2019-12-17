package ex_interface;

public class Interface_PolyTest {
	// 인터페이스 다형성 테스트
	public static void main(String[] args) {
		CommandProcess cp = new CommandProcess();
		
		WriteCommand wc = new WriteCommand();
		ListCommand lc = new ListCommand();
		
		cp.process(wc);
		cp.process(lc);
	}

}
