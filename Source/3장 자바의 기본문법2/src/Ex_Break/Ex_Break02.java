package Ex_Break;

import java.util.Scanner;

public class Ex_Break02 {
	/*
	 * ������ ������ �ݺ������� ���� ������ ����
	 * 3�� �ڹ��� ���ʹ���2 ������ ������Ʈ�� ���󰡼� �� �ۼ��ϰ� ���� �ϴ� �ܰ��Դϴ�.
	 * break��
	 */
	public static void main(String[] args) {
		int num = 0;
		char c = 'A';
		aaa: while(true) {
			while(true) {
				num++;
				System.out.print(c++ +"");
				if(num % 5 == 0) {
					break;
				}
				if(num == 26) {
					break aaa;
				}
			}
			System.out.println();
		}
		
	}

}
