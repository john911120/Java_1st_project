package Ex_Array_;

public class Array_07 {

	/*
	 * 2차원 배열 객체 사용 예제
	 * 작성일 : 191111
	 */
	public static void main(String[] args) {
		//  다차원 배열 
		int [][] multiArray = new int[2][2];
		char c = 'A';
		
		
		// 값 출력하기
		for(int i = 0; i <multiArray.length; i++) {
			for(int j = 0; j <multiArray[i].length; j++) {
				multiArray[i][j] = c++;
			}
		}
			
		for(int i = 0; i <multiArray.length; i++) {
			for(int j = 0; j <multiArray.length; j++) {
				System.out.println("multiArray[" + i + "][" + j +"]=" + (char)multiArray[i][j]);
			}
		}
		
		}
	}

