package ex_List_Interface;

import java.util.ArrayList;

public class ArrayListTest_generic {
	/*
		���׸� ��� Ÿ�� üŷ�� ��Ȯ�� �̷����� �ʴ� �κ��� �ذ��ϱ����� ������� 1.5������ �߰��Ǿ���.
		�÷��� ��ü�� ����� ��Ҹ� �߰��� �� �ִ�. �켱 ���׸� ����� �̿��ؼ� �÷��� ��ü�� �����ϸ� ������
		Ÿ�����θ� ��Ҹ� �߰� �����ϴ�. 
		�ۼ��� : 1202
	*/
	public static void main(String[] args) {
		ArrayList <String> array = new ArrayList<String>();
		
		array.add("korea");
		array.add("japan");
		array.add("america");
		array.add("mexico");
		
		System.out.println("ArrayList�� ��� �߰��ϰ� ���");
		for(int i = 0; i <array.size(); i++) {
			System.out.println(array.get(i));
		}
		System.out.println();
		System.out.println();
		
		array.remove(0);
		array.remove("mexico");
		
		System.out.println("ArrayList���� ��� ���� �� ���");
		for(int i = 0; i <array.size(); i++) {
			System.out.println(array.get(i));
		}
	}
}
