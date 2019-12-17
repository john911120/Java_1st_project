package ex_Map_Interface;

import java.util.Enumeration;
import java.util.Properties;

public class Properties_Test {

	/*
	 	Properties Ŭ������ HashTable�� ��ӹ��� Ŭ������ �ٸ� �� Ŭ�������� Ű�� ���� ��üŸ������
	 	�ٷ�µ� �� Ŭ������ Ű�� ���� StringŸ������ �ٷ�� ������ �� �Ӽ����� �ٷ�⿡ ���� Ŭ�����̴�.
	 	�ۼ��� : 1204
	 */
	
	public static void main(String[] args) {
		Properties p = new Properties();
		p.put("name", "�ø���");
		p.put("addr", "���굿");
		p.put("age", "32");
		p.put("nation", "�ѱ�");
		
		Enumeration propNames = p.propertyNames();
		while(propNames.hasMoreElements()) {
			String name = (String) propNames.nextElement();
			System.out.println("name = " + name + ", value = " + p.getProperty(name));
		}
	}

}
