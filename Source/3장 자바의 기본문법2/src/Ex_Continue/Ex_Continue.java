package Ex_Continue;

import java.util.Scanner;

public class Ex_Continue {
	/*
	 * 3�� �ڹ��� ���ʹ���2 ������ ������Ʈ�� ���󰡼� �� �ۼ��ϰ� ���� �ϴ� �ܰ��Դϴ�.
	 * Continue��
	 */
	public static void main(String[] args) {
		aaa: for(char c = 'A'; c<='C';c++) {
			for(int x = 1; x<=3; x++) {
				if(x==2)continue;
				if(c=='B')continue aaa;
				System.out.println("c =" + c + ",x=" + x);
			}
		}
		
	}

}
