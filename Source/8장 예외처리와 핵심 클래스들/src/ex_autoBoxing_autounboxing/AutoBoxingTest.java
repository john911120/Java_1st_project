package ex_autoBoxing_autounboxing;

public class AutoBoxingTest {
	
	/*
		autoboxing/unboxing���� �����ϱ�
		- ����ڽ� : �⺻ Ÿ���� �����͸� ��ü Ÿ���� �����Ϳ� �Ҵ��ϸ� �⺻ Ÿ���� �����Ͱ� ��ü Ÿ���� 
		           �����ͷ� �ڵ� ��ȯ�Ǹ鼭 ���۷��� ������ �Ҵ�ȴ�.
		- ��ڽ�: ��ü Ÿ���� �����͸� �⺻ Ÿ���� ������ �Ҵ��ϸ� �ڵ����� ��ü Ÿ���� �����Ͱ� �⺻Ÿ������
				����Ǹ鼭 �Ҵ�
		�ۼ��� : 1130
	*/
	public static void main(String[] args) {
		// jdk 1.4���� ������ ����ڽ̰� ��ڽ�
		int var_int1 = 3;
		Integer intObj1 = new Integer(var_int1);
		
		Integer intObj2 = new Integer("4");
		int var_int2 = intObj2.intValue();
		
		// jdk 1.5���� �̻��� ����ڽ̰� ��ڽ�
		intObj1 = var_int1;
		System.out.println("intObj1 =" + intObj1);
		
		var_int2 = intObj2;
		System.out.println("var_int2 = " + var_int2);
	}
	
}
