package Ex_Array_;

import java.util.Scanner;

public class Array_04 {

	/*
	 * Ư�� �迭���� scanner���� �о���� �̸��� ��� �ε����� �ִ°��� Ȯ���ϴ� ���� ���α׷�
	 * �ۼ��� : 191109 
	 */
	public static void main(String[] args) {
		String names[] = new String[]{"��������","����","¡¡��","���Ի���","�÷�ũ��","�ٶ���","ĳ��"};
		Scanner sc = new Scanner(System.in);
		int index =-1;
		do {
			System.out.println("�˻��� �̸��� �Է��ϼ���");
			System.out.println("�̸�:");
			String name = sc.next();
			for(int i = 0; i<names.length;i++) {
				if(name.contentEquals(names[i])) {
					index = i;
				}
			}
			if(index != -1) {
				System.out.println(names + "�� �迭��" + index + "�ε��� ���� ã�ҽ��ϴ�.");
				break;
			}
			System.out.println("�ش��ϴ� �̸��� �������� �ʽ��ϴ�.");
			
		}
		while(true);
	}

}
