package Ex_Do_While;

import java.util.Scanner;

public class Ex_Do_While02 {
	/*
	 * Scanner Ŭ������ ����ؼ� ���� �Է¹ް� ����ϴ� ����
	 * 3�� �ڹ��� ���ʹ���2 ������ ������Ʈ�� ���󰡼� �� �ۼ��ϰ� ���� �ϴ� �ܰ��Դϴ�.
	 * DO,While��
	 */
	public static void main(String[] args) {
		// Scanner import
		Scanner sc = new Scanner(System.in);
		
		// next
		String nextString = sc.next();
		System.out.println("nextString ="+ nextString);
		
		// nextInt
		int nextIntNum = sc.nextInt();
		System.out.println("nextIntNum =" + nextIntNum);
	}

}
