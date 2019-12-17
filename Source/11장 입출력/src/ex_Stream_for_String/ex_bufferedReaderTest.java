package ex_Stream_for_String;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex_bufferedReaderTest {

	/*
 	Reader // BufferedReader
 	- 자바에서 문자 기반 입출력 기능을 제공하기 위해 Reader, Writer클래스를 제공한다. InputStream에 대응되는 클래스가 Reader클래스이고
 	   OutputStream에 대응되는 클래스가 Writer 클래스이다.
 	- BufferedReader는 Reader 스트림에 버퍼 기능을 추가하는 스트림 클래스로 대상에서 데이터를 읽을 때 버퍼에 읽었다가 버퍼로부터 차례로 읽어들이기 
 	   때문에 성능이 좋아진다. 또한 readLine()이라는 한 라인별로 데이터를 읽어서 String타입으로 데이터를 반환해 주는 편리한 메소드가 존재하여서 사용 빈도가 높다.
 	작성일 : 1210
 */
	
	public static void main(String[] args) {
		FileInputStream fi = null;
		InputStreamReader isr = null;
		BufferedReader bfr = null;
		
		try {
			fi = new FileInputStream("bufferReader2.txt");
			isr = new InputStreamReader(fi);
			bfr = new BufferedReader(isr);
			
			String str = null;
			
			while((str = bfr.readLine()) != null) {
				System.out.println(str);
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
