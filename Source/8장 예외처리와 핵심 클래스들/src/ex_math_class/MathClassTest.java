package ex_math_class;




public class MathClassTest {

	/*
		Math클래스는 수학 관련 연산을 처리하는 메소드들이 정의 되어있는 클래스이다. 
		생성자는 private으로 되어있으며 외부에서 생성자를 이용해서 객체를 만들 수 없다.
		모든 메소드가 static으로 정의가 되어있어서 외부 클래스에서는 Math 클래스 이름으로 바로 메소드를
		호출해서 사용을 할 수 있다. 본 예제에서 사용되는 메소드는 난수를 반환하는 Math.random이다.
		작성일 : 1201
	*/
	public static void main(String[] args) {
		// 1부터 100까지의  난수를 만든다.
		System.out.println("1부터 100사이의 난수를 만든다.");
		int num = (int)(Math.random()*100)+1;
		System.out.println("1부터 100 사이의 숫자 : " + num);
		
		// 1부터 50까지의 난수를 만든다.
		System.out.println("1부터 50사이의 난수를 만든다.");
		num = (int) (Math.random()*50) + 1;
		System.out.println("1부터 50 사이의 숫자: " + num);
		
		// 1부터 20까지의 난수를 만든다.
		System.out.println("1부터 20사이의 난수를 만든다.");
		num = (int) (Math.random()*20) + 1;
		System.out.println("1부터 20 사이의 숫자: " + num);
		
	}

}
