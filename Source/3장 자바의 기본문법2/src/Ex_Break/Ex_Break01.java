package Ex_Break;

import java.util.Scanner;

public class Ex_Break01 {
	/*
	 * ������ �Է� �޾Ƽ� ����� ����ϴ� ����
	 * 3�� �ڹ��� ���ʹ���2 ������ ������Ʈ�� ���󰡼� �� �ۼ��ϰ� ���� �ϴ� �ܰ��Դϴ�.
	 * break��
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer = "����";
		String inString = "";
		do {
			System.out.println("�ѱ��� ������ �����ΰ���?");
			inString = sc.next();
			if(inString.contentEquals(answer)) {
				System.out.println("���ѹα��� ������" + answer + "�Դϴ�.");
				break;
			} 
			System.out.println("Ʋ�Ƚ��ϴ�. �ٽ� �Է��ϼ���");
		}
		while(true);
		
	}

}
