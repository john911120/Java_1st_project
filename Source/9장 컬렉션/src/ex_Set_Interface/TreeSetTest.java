package ex_Set_Interface;

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetTest {

	/*
		TreeSet �׽�Ʈ
		TreeSet : �ߺ��� �����ʹ� ������� ������ ���ı���� �߰��� �����̴�. ���� �˻� �۾��� �� ȿ�����̴�. ��Ҹ� �߰��ϸ� �������� ����
				   ū ���� �����ʿ��� �߰��Ǹ鼭 �����Ѵ�.
		�ۼ��� : 1202
	*/
	
	public static void main(String[] args) {
		TreeSet hs = new TreeSet();
		
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
