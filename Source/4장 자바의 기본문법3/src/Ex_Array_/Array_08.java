package Ex_Array_;

public class Array_08 {

	/*
	 * 2���� �迭 ��ü ����ؼ� ��� ������ �簢�� ���·� ����ϴ� ����
	 * �ۼ��� : 191111
	 */
	public static void main(String[] args) {
		//  ������ �迭 
		int [][] recArray= new int[5][5];
		
		// �� ����ϱ�
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

