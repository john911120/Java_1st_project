package ex_random_class;

import java.util.Random;

public class RandomTest2 {

	/*
		Seed값을 지정해서 Random 클래스를 사용하기
		작성일 : 1201
	*/
	public static void main(String[] args) {
		// random 클래스 사용하기
		Random random1 = new Random(5);
		Random random2 = new Random(5);
		
		for(int i = 0; i < 9; i++) {
			System.out.println("random1의 난수 값 :" + random1.nextInt());
		}

		System.out.println();
		
		System.out.println();
		
			for(int i = 1; i < 9; i++) {
				System.out.println("random2의 난수 값 : " + random2.nextInt());
			}
	}

}
