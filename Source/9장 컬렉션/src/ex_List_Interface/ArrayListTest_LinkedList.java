package ex_List_Interface;

import java.util.LinkedList;

public class ArrayListTest_LinkedList {
	/*
		LinkedListŬ������ Queue �������̽��� List �������̽��� ������ Ŭ������ LinkedList Ŭ�������� List �������̽��� ����� �̿��ϴ� �����
		ArrayList�� ����ϳ� �����͸� �����ϴ� ����� �ٸ���. Ŭ������ ����Ǵ� ��ҵ��� �� ����� ���� ��ҿ� ���� ����� �ּҸ� ��ũ�ϰ� �ִ�. 
		�ۼ��� : 1203
	*/
	public static void main(String[] args) {
			LinkedList<String> ll = new LinkedList<String>();
			
			ll.add("������ s");
			ll.add("������ ��Ʈ");
			ll.add("������ a");
			ll.add("������");
			
			for(int i = 0; i <ll.size();i++) {
				System.out.println(ll.get(i));
			}
		}
	}
