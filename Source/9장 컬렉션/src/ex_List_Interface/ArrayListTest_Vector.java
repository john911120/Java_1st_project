package ex_List_Interface;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class ArrayListTest_Vector {
	/*
		���� Ŭ������ ArrayList�� �� �������� ArrayList�� ������� ����. �������� �ִٸ� �÷��ǿ� �۾��� ���� �� �� vector�� ���
		��Ƽ ������ �۾��� �ƴϾ ���Ǿ��� ����ȭ�� �ɸ��� ArrayList�� ��쿡�� �⺻������ ����ȭ�� ������� �ʰ� ����ȭ�� �ʿ��� ��쿡��
		�޼ҵ带 �̿��ؼ� ����ȭ ó���� ���شٴ� ���� �������̴�. ��������δ� ArrayList�� ����ϴ� ���� ���Ѵ�. 
		�ۼ��� : 1203
	*/
	public static void main(String[] args) {
		Vector<String> vt = new Vector<String>();
		vt.add("����");
		vt.add("��õ");
		vt.add("�λ�");
		vt.add("�뱸");
		vt.add("����");
		
		for(int i = 0; i < vt.size(); i++) {
			System.out.println("vt.get(" + i + ") =" + vt.get(i));
		}
		System.out.println();
		
		System.out.println("Iterator���� ��� ����ϱ�");
			Iterator<String> it = vt.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			System.out.println("Enumeration���� ��� ����ϱ�");
				Enumeration<String> e = vt.elements();
				while(e.hasMoreElements()) {
					System.out.println(e.nextElement());
				}
			}
	}
