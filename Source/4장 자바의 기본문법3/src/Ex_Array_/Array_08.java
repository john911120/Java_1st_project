package Ex_Array_;

public class Array_08 {

	/*
	 * 2차원 배열 객체 사용해서 요소 값들을 사각형 형태로 출력하는 예제
	 * 작성일 : 191111
	 */
	public static void main(String[] args) {
		//  다차원 배열 
		int [][] recArray= new int[5][5];
		
		// 값 출력하기
		for(int i = 0; i <recArray.length; i++) {
			for(int j = 0; j <recArray[i].length; j++) {
				if(i==0 || i==recArray.length-1|| j==0 || j==recArray[i].length-1) {
					recArray[i][j] = 1;
				}
			}
		}
			
		for(int i = 0; i <recArray.length; i++) {
			for(int j = 0; j <recArray[i].length; j++) {
				System.out.print(recArray[i][j] + "");
			}
			System.out.println();
		}
		
		}
	}

