package ex_math_class;




public class MathClassTest {

	/*
		MathŬ������ ���� ���� ������ ó���ϴ� �޼ҵ���� ���� �Ǿ��ִ� Ŭ�����̴�. 
		�����ڴ� private���� �Ǿ������� �ܺο��� �����ڸ� �̿��ؼ� ��ü�� ���� �� ����.
		��� �޼ҵ尡 static���� ���ǰ� �Ǿ��־ �ܺ� Ŭ���������� Math Ŭ���� �̸����� �ٷ� �޼ҵ带
		ȣ���ؼ� ����� �� �� �ִ�. �� �������� ���Ǵ� �޼ҵ�� ������ ��ȯ�ϴ� Math.random�̴�.
		�ۼ��� : 1201
	*/
	public static void main(String[] args) {
		// 1���� 100������  ������ �����.
		System.out.println("1���� 100������ ������ �����.");
		int num = (int)(Math.random()*100)+1;
		System.out.println("1���� 100 ������ ���� : " + num);
		
		// 1���� 50������ ������ �����.
		System.out.println("1���� 50������ ������ �����.");
		num = (int) (Math.random()*50) + 1;
		System.out.println("1���� 50 ������ ����: " + num);
		
		// 1���� 20������ ������ �����.
		System.out.println("1���� 20������ ������ �����.");
		num = (int) (Math.random()*20) + 1;
		System.out.println("1���� 20 ������ ����: " + num);
		
	}

}
