package Ex_Array_;

public class Array_07 {

	/*
	 * 2���� �迭 ��ü ��� ����
	 * �ۼ��� : 191111
	 */
	public static void main(String[] args) {
		//  ������ �迭 
		int [][] multiArray = new int[2][2];
		char c = 'A';
		
		
		// �� ����ϱ�
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

