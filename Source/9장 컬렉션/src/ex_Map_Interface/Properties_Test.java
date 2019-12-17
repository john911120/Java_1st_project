package ex_Map_Interface;

import java.util.Enumeration;
import java.util.Properties;

public class Properties_Test {

	/*
	 	Properties 클래스는 HashTable을 상속받은 클래스로 다른 맵 클래스들은 키와 값을 객체타입으로
	 	다루는데 이 클래스는 키와 값을 String타입으로 다루기 때문에 각 속성값을 다루기에 편리한 클래스이다.
	 	작성일 : 1204
	 */
	
	public static void main(String[] args) {
		Properties p = new Properties();
		p.put("name", "시명이");
		p.put("addr", "구산동");
		p.put("age", "32");
		p.put("nation", "한국");
		
		Enumeration propNames = p.propertyNames();
		while(propNames.hasMoreElements()) {
			String name = (String) propNames.nextElement();
			System.out.println("name = " + name + ", value = " + p.getProperty(name));
		}
	}

}
