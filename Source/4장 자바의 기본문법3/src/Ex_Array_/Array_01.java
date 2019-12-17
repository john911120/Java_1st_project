package Ex_Array_;

public class Array_01 {

	/*
	 * 1차원 배열 객체 만들고 값을 초기화하고 데이터 출력히가
	 * 작성일 : 191109 
	 */
	public static void main(String[] args) {
		// 배열 선언하기
		int ages[];
		String names[];
		
		// 배열 객체 만들기
		ages = new int[3];
		names = new String[3];
		
		// 초기화
		ages[0] = 10;
		ages[1] = 20;
		ages[2] = 30;
		names[0] = "스폰지밥";
		names[1] = "징징이";
		names[2] = "집게";
		
		// 값 출력하기
		for(int i = 0; i <3; i++) {
			System.out.println("ages[" + i + "]=" + ages[i]);
			System.out.println("names[" + i + "]=" + names[i]);
		}
	}

}
