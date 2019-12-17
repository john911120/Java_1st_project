package ex_java_net_Package;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import java.net.URLConnection;

public class ex_URLConnectionTest {

	/*
	 	URLConnection
	 	- 추상클래스이므로 생성자를 사용해서 객체를 만들 수 없으며, URL객체의 openConnection메소드를 이용해서 생성할 수 있다.
	 	   또한 객체가 생성되면 connect메소드를 호출해서 URL객체에 설정되어있는 URL에 연결 할 수 있다. 그리고 자원뿐만 아니라 헤더정보를
	 	   얻어올 수 있다.getInputStream메소드를 사용하여 해당 URL으로부터 자원을 읽을 수 있다.
	 	- inputStream객체를 리턴 받을 수 있으며, getOutputStream메소드를 이용하여 해당 URL에 데이터를 출력할 수 있는 OutputStream
	 	  객체를 리턴받을 수 있다. getHeaderField(String name)메소드를 사용하면 각 이름에 해당하는 헤더 정보를 얻어올수 있으며 총 자원의 길이도 
	 	  구할 수 있다.
	 	작성일 : 1213
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