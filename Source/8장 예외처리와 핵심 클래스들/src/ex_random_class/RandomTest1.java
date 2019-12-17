package ex_random_class;

import java.util.Random;

public class RandomTest1 {

	/*
		Random클래스에는 난수를 지정하는 Math.random()메소드와 같은 메소드들이 정의 되어있는데
		난수를 발생시키는 것 보다 다양한 방법으로 난수를 발생 시키는 방법이 있다.
		작성일 : 1201
	*/
	public static void main(String[] args) {
		// random 클래스 사용하기
		Random random = new Random();
		// 1부터 100, 50, 20 까지의  난수를 만든다.
		System.out.println("1부터 100사이의 난수를 만든다." + random.nextInt(101));
		System.out.println("1부터 50사이의 난수를 만든다." + random.nextInt(51));
		System.out.println("1부터 20사이의 난수를 만든다." + random.nextInt(21));
		System.out.println("int형 전체 범위의 난수 생성하기: " + random.nextInt());
		
		System.out.println("float형 전체 범위의 난수 생성하기: " + random.nextFloat());
		System.out.println("double형 전체 범위의 난수 생성하기: " + random.nextDouble());
		System.out.println("long형 전체 범위의 난수 생성하기: " + random.nextLong());
		System.out.println("boolean형 전체 범위의 난수 생성하기: " + random.nextBoolean());
	}

}
