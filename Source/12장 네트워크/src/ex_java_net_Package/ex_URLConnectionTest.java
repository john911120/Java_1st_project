package ex_java_net_Package;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import java.net.URLConnection;

public class ex_URLConnectionTest {

	/*
	 	URLConnection
	 	- �߻�Ŭ�����̹Ƿ� �����ڸ� ����ؼ� ��ü�� ���� �� ������, URL��ü�� openConnection�޼ҵ带 �̿��ؼ� ������ �� �ִ�.
	 	   ���� ��ü�� �����Ǹ� connect�޼ҵ带 ȣ���ؼ� URL��ü�� �����Ǿ��ִ� URL�� ���� �� �� �ִ�. �׸��� �ڿ��Ӹ� �ƴ϶� ���������
	 	   ���� �� �ִ�.getInputStream�޼ҵ带 ����Ͽ� �ش� URL���κ��� �ڿ��� ���� �� �ִ�.
	 	- inputStream��ü�� ���� ���� �� ������, getOutputStream�޼ҵ带 �̿��Ͽ� �ش� URL�� �����͸� ����� �� �ִ� OutputStream
	 	  ��ü�� ���Ϲ��� �� �ִ�. getHeaderField(String name)�޼ҵ带 ����ϸ� �� �̸��� �ش��ϴ� ��� ������ ���ü� ������ �� �ڿ��� ���̵� 
	 	  ���� �� �ִ�.
	 	�ۼ��� : 1213
	 */
	
	public static void main(String[] args) {
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try 
		{
			URL url = new URL("http://www.hyejiwon.co.kr");
			URLConnection con = url.openConnection();
			is = con.getInputStream();
			isr = new InputStreamReader(is,"UTF-8");
			br = new BufferedReader(isr);
			
			String str = "";
			String contentType = con.getContentType();
			System.out.println("contentType = " + contentType);
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				is.close();
				isr.close();
				br.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}