package Chap5_Ex;

import java.util.Scanner;

public class Main_Search {
	/*
	 * ȸ�� ������ �����ϴ� Ŭ����
	 * �ۼ���  : 1119
	 * ����ڷκ��� �̸��� �޴� mainŬ�����̴�.
	 */
	public static void main(String[] args) {
		SearchService sv = new SearchService();
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("�˻��� ȸ���� �̸��� �Է��ϼ���");
			String name = sc.next();
			boolean searchResult = sv.searchMember(name);
			if(searchResult) break;
			System.out.println("�˻��� ȸ���� ������ ��ġ���� �ʽ��ϴ�.");
		}
		while(true);
	}

}
