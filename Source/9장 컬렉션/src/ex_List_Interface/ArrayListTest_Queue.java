package ex_List_Interface;

import java.util.LinkedList;
import java.util.Queue;

public class ArrayListTest_Queue {
	/*
		Queue ���ʿ��� ��Ҹ� �߰��ϰ� �ݴ� �������� ��Ҹ� �����ϴ� ���¸� ������. ���� ���� �߰��� ��Ұ� ���� ����ȴ�.
		���Լ���� ���� �����̴�. 
		�ۼ��� : 1203
	*/
	public static void main(String[] args) {
			Queue<String> queue = new LinkedList<String>();
			

			queue.offer("��⵵ ����");
			queue.offer("����");
			queue.offer("���빮��");
			queue.offer("�߱�");
			queue.offer("���α�");
			queue.offer("��걸");
			queue.offer("������");
			queue.offer("���ʱ�");
			queue.offer("������");
			
			while(!queue.isEmpty()) {
				System.out.println(queue.poll());
			}
		}
	}
