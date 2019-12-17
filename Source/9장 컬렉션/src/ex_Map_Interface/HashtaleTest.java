package ex_Map_Interface;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashtaleTest {

	/*
	 	hashtable 예제
	 	Map인터페이스는 키와 쌍의 형태로 데이터를 저장해주는 컬렉션 객체이다.
	 	작성일 : 1204
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
