package ex_Stream_for_String;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex_ReadAddress {

	/*
	 	BufferedReader
	 	- �ּҷ� ������ txt���Ͽ� ����Ǿ����� �� �ش� Ŭ������ ���ؼ� ������ ����ϰ� �ϴ� �����̴�.
	 	�ۼ��� : 1210
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
				System.out.println("�ּ�:" + st.nextToken());
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
