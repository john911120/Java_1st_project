package ex_Set_Interface;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	/*
		HashSet �׽�Ʈ
		HashSet : ���� ������ ��ü ����� ���� ���� ��� ���·� ��Ҹ� �����ϴ� Ŭ�����̴�.�ߺ��� �����ʹ� ������� �ʱ� ������
				  add(object obj)�޼ҵ带 �̿��� ���ο� ��Ҹ� �߰��� �� ������ ��ü�� �̹� �����ϸ� �߰��� �����ϰ� false ��ȯ
		�ۼ��� : 1202
	*/
	
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		if(hs.add("Korea")) {
			System.out.println("ù ��° korea �߰� ����");
		}
		else {
			System.out.println("ù ��° korea �߰� ����");
		}
		if(hs.add("Japan")) {
			System.out.println("Japan �߰� ����");
		}
		else {
			System.out.println("Japan �߰� ����");
		}
		if(hs.add("America")) {
			System.out.println("America �߰� ����");
		}
		else {
			System.out.println("America �߰� ����");
		}
		if(hs.add("britain")) {
			System.out.println("britain �߰� ����");
		}
		else {
			System.out.println("britain �߰� ����");
		}
		if(hs.add("Korea")) {
			System.out.println("�� ��° korea �߰� ����");
		}
		else {
			System.out.println("�� ��° korea �߰� ����");
		}
		
		Iterator it = hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
