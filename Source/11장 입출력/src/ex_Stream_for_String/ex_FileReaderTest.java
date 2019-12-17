package ex_Stream_for_String;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class ex_FileReaderTest {

	/*
	 	FileReader
	 	- 파일으로부터 데이터를 문자 단위로 읽을 수 있는 스트림 클래스로 InputStreamReader클래스를 상속받는다. 
	 	    용법은 FileInputStream과 비슷하다.
	 	작성일 : 1210
	 */
	
	public static void main(String[] args) {
		FileReader fr = null;
		
		try {
			fr = new FileReader("FileReaderTest.txt");
			int readChar = -1;
			
			while((readChar = fr.read()) != -1) {
				System.out.print((char)readChar);
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fr.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
