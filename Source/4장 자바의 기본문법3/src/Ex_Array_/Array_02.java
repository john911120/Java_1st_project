package Ex_Array_;

import java.lang.reflect.Array;

public class Array_02 {

	/*
	 * 배열 객체의 각 요소 값을 순차적으로 출력하는 예제
	 * 작성일 : 191109 
	 */
	public static void main(String[] args) {
		// 배열 선언하기
		int num = 3;
		int[] array1 = new int[3];
		
		for(int i=0;i<array1.length;i++) {
			array1[i] = num ++;
		}
		
		// 값 출력하기
		for(int i = 0; i<array1.length; i++) {
			System.out.println("array1[" + i + "]=" + array1[i]);
		}
	}

}
