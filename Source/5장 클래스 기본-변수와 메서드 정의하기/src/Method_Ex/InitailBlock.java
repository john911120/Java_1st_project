package Method_Ex;

	class Good {
		{
		System.out.println("good�� �ν��Ͻ� �ʱ�ȭ ��� �����ϱ�");
	}
	static {
		System.out.println("good�� static �ʱ�ȭ ��� �����ϱ�");
	}
}
public class InitailBlock {
	/*
	 * �ۼ��� : 1118
		�ʱ�ȭ ���  Ŭ���� ������ ������ �ʱ�ȭ�� �ϴ� �����̴�.
		�����ڰ� ȣ�� �� ��, �׻� �ν��Ͻ� �ʱ�ȭ ����� ���� ����ǰ� �����ڰ� ����ȴ�.
		���� ��ü�� ���� �� ���� �ݺ������� �����ؾ��ϴ� �κ��� �ִٸ� �ν��Ͻ� �ʱ�ȭ ��Ͽ� ���� �ؾ��Ѵ�.
	*/
	public static void main(String[] args) {
		Good g1 = new Good();
		Good g2 = new Good();
		Good g3 = new Good();
		System.out.println("main");
	}

}
