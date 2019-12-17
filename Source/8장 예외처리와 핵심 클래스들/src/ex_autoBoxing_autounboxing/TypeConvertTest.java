package ex_autoBoxing_autounboxing;

public class TypeConvertTest {
	
	/*
		타입 변환 메서드 예제
		작성일 : 1130
	*/
	public static void main(String[] args) {
		int num1 = 3;
		String num2 = "7";
		System.out.println("타입(형) 변환 전");
		System.out.println("3 + 7 = " + (num1 + num2));
		
		int intNum = Integer.parseInt(num2);
		System.out.println("타입(형) 변환 전");
		System.out.println("3 + 7 = " + (num1 + intNum));
		
		String numStr = "7.41";
		System.out.println("타입(형) 변환 전");
		System.out.println("3 + 7.41 =" + (num1 + numStr));
		
		double numDouble = Double.parseDouble(numStr);
		System.out.println("타입 변환 후");
		System.out.println("3 + 7.41 = " + (num1 + numDouble));
	}
	
}
