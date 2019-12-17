package ex_Map_Interface;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashtaleTest {

	/*
	 	hashtable ����
	 	Map�������̽��� Ű�� ���� ���·� �����͸� �������ִ� �÷��� ��ü�̴�.
	 	�ۼ��� : 1204
	 */
	
	public static void main(String[] args) {
		Hashtable<String, String> hashtable = new Hashtable<String, String>();
		
		hashtable.put("driver", "oracle.jdbc.driver.OracleDriver");
		hashtable.put("url", "jdbc:oracle:thin:@localhost:1521:orcl");
		hashtable.put("username", "java");
		hashtable.put("password", "java");
		
		Set<String> keySet = hashtable.keySet();
		Iterator<String> it = keySet.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("key = " + key + ",value =" + hashtable.get(key));
		}
	}
}
