package ex_Stream_for_String;

import java.io.FileWriter;
import java.io.IOException;

public class ex_FileWriterTest {

	/*
	 	FileWriter
	 	- 파일의 데이터를 문자 단위로 출력하는 클래스로 FileOutputStream에 대응되는 클래스이다.
	 	작성일 : 1210
	 */
	
	public static void main(String[] args) {
		FileWriter fw = null;
		String msg = "File Writer Test. \r\n";
		try {
			fw = new FileWriter("FileReaderTest.txt",true);
			fw.write(msg);
		} catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fw.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
