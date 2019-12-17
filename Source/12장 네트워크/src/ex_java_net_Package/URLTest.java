package ex_java_net_Package;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class URLTest {

	/*
	  	URL Class
	  	- URL �ּҸ� �ٷ�� ���� java���� �����ϴ� Ŭ������ URL Ŭ������ ��ǥ���� �����ڿ��� �پ��� �����
	  	   �����ȴ�.
	  	�ۼ��� : 1211
	 */
	
	public static void main(String[] args) {
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try 
		{
			URL url = new URL("https://www.naver.com/");
			is = url.openStream();
			isr = new InputStreamReader(is,"UTF-8");
			br = new BufferedReader(isr);
			
			String str = "";
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch(Exception e) {
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
