package Ex_Array_;

import java.lang.reflect.Array;

public class Array_02 {

	/*
	 * �迭 ��ü�� �� ��� ���� ���������� ����ϴ� ����
	 * �ۼ��� : 191109 
	 */
	public static void main(String[] args) {
		// �迭 �����ϱ�
		int num = 3;
		int[] array1 = new int[3];
		
		for(int i=0;i<array1.length;i++) {
			array1[i] = num ++;
		}
		
		// �� ����ϱ�
		for(int i = 0; i<array1.length; i++) {
			System.out.println("array1[" + i + "]=" + array1[i]);
		}
	}

}
