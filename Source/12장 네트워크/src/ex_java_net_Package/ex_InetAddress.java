package ex_java_net_Package;

import java.net.InetAddress;

public class ex_InetAddress {

	/*
	 	InetAddress
	 	- Ư�� IP�ּҸ� �ٷ�� ���� Ŭ������ �����ڷ� ������ �� ������, �ڹٿ��� �����ϴ�
	 	  ���� ���� static�޼ҵ忡 ���ؼ� �����ȴ�.
	 	�ۼ��� : 1213
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