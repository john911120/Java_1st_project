package ex_random_class;

import java.util.Random;

public class RandomTest1 {

	/*
		RandomŬ�������� ������ �����ϴ� Math.random()�޼ҵ�� ���� �޼ҵ���� ���� �Ǿ��ִµ�
		������ �߻���Ű�� �� ���� �پ��� ������� ������ �߻� ��Ű�� ����� �ִ�.
		�ۼ��� : 1201
	*/
	public static void main(String[] args) {
		// random Ŭ���� ����ϱ�
		Random random = new Random();
		// 1���� 100, 50, 20 ������  ������ �����.
		System.out.println("1���� 100������ ������ �����." + random.nextInt(101));
		System.out.println("1���� 50������ ������ �����." + random.nextInt(51));
		System.out.println("1���� 20������ ������ �����." + random.nextInt(21));
		System.out.println("int�� ��ü ������ ���� �����ϱ�: " + random.nextInt());
		
		System.out.println("float�� ��ü ������ ���� �����ϱ�: " + random.nextFloat());
		System.out.println("double�� ��ü ������ ���� �����ϱ�: " + random.nextDouble());
		System.out.println("long�� ��ü ������ ���� �����ϱ�: " + random.nextLong());
		System.out.println("boolean�� ��ü ������ ���� �����ϱ�: " + random.nextBoolean());
	}

}
