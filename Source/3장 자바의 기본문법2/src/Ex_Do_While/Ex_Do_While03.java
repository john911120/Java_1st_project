package Ex_Do_While;

import java.util.Scanner;

public class Ex_Do_While03 {
	/*
	 * Scanner Ŭ������ Ȱ���ؼ� ���� ���� ���ߴ� ���� ���α׷�
	 * ���� ������ 1~ 10������ �����Ѵ�.
	 * 3�� �ڹ��� ���ʹ���2 ������ ������Ʈ�� ���󰡼� �� �ۼ��ϰ� ���� �ϴ� �ܰ��Դϴ�.
	 * DO,While��
	 */
	public static void main(String[] args) {
		// Scanner import
		Scanner sc = new Scanner(System.in);
		int number = (int)(Math.random()*10)+1;
		int inNumber = 0;
		
		do {
			System.out.println("���ڸ� �Է��ϼ���");
			inNumber = sc.nextInt();
			
			if(inNumber == number) {
				System.out.println("�����Դϴ�.");
				break;
			}
			else if(inNumber < number){
				System.out.println("���ڰ� �ʹ� �۽��ϴ�.");
			} else {
				System.out.println("���ڰ� �ʹ� Ů�ϴ�.");
			}
		}
		while(true);
	}

}
