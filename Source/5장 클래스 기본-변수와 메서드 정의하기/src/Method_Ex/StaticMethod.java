package Method_Ex;

public class StaticMethod {
	
	/*
	 * static 메서드 예제
	 * 작성일  : 1118
	 * static 메소드는 메소드 정의 부분 앞에 static 예약어가 지정된 메소드를 의미하고 인스턴스 메소드는 
	 * 메소드 선언 부분앞에 static이 지정되어있지 않은 메소드
	 */
	int memVar;
	static int staticVar;
	void memMethod1() {
		int local = memVar;
		local = staticVar;
		staticMethod1();
		memMethod2();
		System.out.println("memMethod1");
	}

	static void staticMethod1() {
		StaticMethod st = new StaticMethod();
		int local = st.memVar;
		st.staticMethod2();
		staticMethod2();
		System.out.println("staticMethod1");
	}

	static void staticMethod2() {
		System.out.println("staticMethod2");
	}

	static void memMethod2() {
		System.out.println("memMethod2");
	}

	
	/*
	 * Static method 테스트
	 */
	public static void main(String[] args) {
		StaticMethod st = new StaticMethod();
		st.memMethod1();
		StaticMethod.staticMethod2();
		staticMethod2();
		int local = staticVar;
	}

}
