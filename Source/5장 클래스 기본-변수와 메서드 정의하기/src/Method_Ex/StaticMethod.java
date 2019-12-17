package Method_Ex;

public class StaticMethod {
	
	/*
	 * static �޼��� ����
	 * �ۼ���  : 1118
	 * static �޼ҵ�� �޼ҵ� ���� �κ� �տ� static ���� ������ �޼ҵ带 �ǹ��ϰ� �ν��Ͻ� �޼ҵ�� 
	 * �޼ҵ� ���� �κоտ� static�� �����Ǿ����� ���� �޼ҵ�
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
	 * Static method �׽�Ʈ
	 */
	public static void main(String[] args) {
		StaticMethod st = new StaticMethod();
		st.memMethod1();
		StaticMethod.staticMethod2();
		staticMethod2();
		int local = staticVar;
	}

}
