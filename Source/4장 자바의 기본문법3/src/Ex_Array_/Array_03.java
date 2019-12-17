package Ex_Array_;

public class Array_03 {

	/*
	 * 배열 요소의 값을 초기화 하면서 배열 객체를 생성하는 프로그램
	 * 작성일 : 191109 
	 */
	public static void main(String[] args) {
		// 배열 선언하기
		String cities[] = {"서울","대전","대구","부산","수원","천안","서천"};
		String nations[] = {"한국","일본","중국","미국","러시아","독일","멕시코"};
		
		// 배열 값 출력하기
		for(int i = 0; i<cities.length;i++) {
			System.out.println("cities[" + i + "]=" + cities[i]);
		}
		for(int i = 0; i <nations.length; i++) {
			System.out.println("nations[" + i + "]=" + nations[i]);
		}
	}

}
