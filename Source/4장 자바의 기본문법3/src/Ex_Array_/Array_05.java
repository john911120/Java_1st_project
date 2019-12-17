package Ex_Array_;

public class Array_05 {

	/*
	 * 배열 객체에 저장되어 있는 값을 출력하기
	 * 작성일 : 191111
	 */
	public static void main(String[] args) {
		// 개선된 for문
		String names[] = new String[]{"wa2000","iws2000","G36","G36C"};
		
		for(String name : names) {
			System.out.println(name);
		}
	}

}
