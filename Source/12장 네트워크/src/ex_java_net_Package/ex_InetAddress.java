package ex_java_net_Package;

import java.net.InetAddress;

public class ex_InetAddress {

	/*
	 	InetAddress
	 	- 특정 IP주소를 다루기 위한 클래스로 생성자로 생설할 수 없으며, 자바에서 제공하는
	 	  여러 개의 static메소드에 의해서 생성된다.
	 	작성일 : 1213
	 */
	
	public static void main(String[] args) {
		InetAddress ia = null;
		
		try 
		{
			ia = InetAddress.getLocalHost();
			System.out.println(ia);
			
			ia = InetAddress.getByName("www.naver.com");
			System.out.println(ia);
			
			InetAddress[] ala = InetAddress.getAllByName("www.google.com");
			
			for(int i = 1; i < ala.length;i++) {
				System.out.println(ala[i]);
			} 
		}
		catch(Exception e) {
			e.printStackTrace();
			}
		}
	}