package ex_List_Interface;

import java.util.Stack;

public class ArrayListTest_Stack {
	/*
		Stack�� ������ ���� ������ ��Ҹ� �߰��� �������� ��Ҹ� �����ϴ� ������ �������� �߰��� ��Ұ� ���� ��µǴ� ���屸��
		Last In First Out
		�ۼ��� : 1203
	*/
	public static void main(String[] args) {
			Stack<String> stack = new Stack<String>();
			

			stack.push("���굿");
			stack.push("���Ĺ�, ���ų�, �ұ�, ���");
			stack.push("ȫ��, ������, ������");
			stack.push("���빮, ������, ��");
			stack.push("����, ����2��");
			stack.push("�ѳ���");
			stack.push("�Ż�, ����, ����");
			stack.push("�Ż�, ����, ����, ����, ����ù��ǽ�");
			stack.push("���");
			
			while(!stack.isEmpty()) {
				System.out.println(stack.pop());
			}
		}
	}
