package Method_Ex;

	class Good {
		{
		System.out.println("good의 인스턴스 초기화 블록 실행하기");
	}
	static {
		System.out.println("good의 static 초기화 블록 실행하기");
	}
}
public class InitailBlock {
	/*
	 * 작성일 : 1118
		초기화 블록  클래스 내부의 복잡한 초기화를 하는 영역이다.
		생성자가 호출 될 때, 항상 인스턴스 초기화 블록이 먼저 실행되고 생성자가 실행된다.
		따라서 객체를 만들 때 마다 반복적으로 수행해야하는 부분이 있다면 인스턴스 초기화 블록에 정의 해야한다.
	*/
	public static void main(String[] args) {
		Good g1 = new Good();
		Good g2 = new Good();
		Good g3 = new Good();
		System.out.println("main");
	}

}
