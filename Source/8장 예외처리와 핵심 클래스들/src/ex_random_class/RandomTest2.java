package ex_random_class;

import java.util.Random;

public class RandomTest2 {

	/*
		Seed���� �����ؼ� Random Ŭ������ ����ϱ�
		�ۼ��� : 1201
	*/
	public static void main(String[] args) {
		// random Ŭ���� ����ϱ�
		Random random1 = new Random(5);
		Random random2 = new Random(5);
		
		for(int i = 0; i < 9; i++) {
			System.out.println("random1�� ���� �� :" + random1.nextInt());
		}

		System.out.println();
		
		System.out.println();
		
			for(int i = 1; i < 9; i++) {
				System.out.println("random2�� ���� �� : " + random2.nextInt());
			}
	}

}
