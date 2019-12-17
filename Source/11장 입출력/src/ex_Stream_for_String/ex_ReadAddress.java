package ex_Stream_for_String;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex_ReadAddress {

	/*
	 	BufferedReader
	 	- 주소록 정보가 txt파일에 저장되어있을 때 해당 클래스를 통해서 정보를 출력하게 하는 예제이다.
	 	작성일 : 1210
	 */
	
	public static void main(String[] args) {
		FileInputStream fi = null;
		InputStreamReader isr = null;
		BufferedReader bfr = null;
		StringTokenizer st = null;
		
		try {
			fi = new FileInputStream("address.txt");
			isr = new InputStreamReader(fi);
			bfr = new BufferedReader(isr);
			
			String str = null;
			
			while((str = bfr.readLine()) != null) {
				st = new StringTokenizer(str,",");
				System.out.println("주소:" + st.nextToken());
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fi.close();
				isr.close();
				bfr.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
