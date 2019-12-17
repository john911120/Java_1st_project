package ex_Stream_for_byte;

import java.io.FileOutputStream;
import java.io.IOException;


public class ex_inputStreamTest_by_FileOutput {

	/*
		FileOutputStream
		- 특정한 대상 파일로 내용을 출력하는 역할을 하는 클래스이다.
		- 생성할 때 지정한 경로에 파일이 없으면 자동으로 생성해주고, 디렉토리 자체에 존재하지 않는다면
		   FileNotFoundException 예외가 발생한다.
		작성일 : 1209
	*/
	public static void main(String[] args) {
		FileOutputStream fo = null;
		String msg = "FileOutputStream Test";
		byte[] byteArray = msg.getBytes();
		
		
		try 
		{
			fo = new FileOutputStream("fileoutput.txt", true);
			fo.write(byteArray);
		}
		catch(IOException io) {
			io.printStackTrace();
		}
		finally {
			try {
				fo.close();
			} catch(IOException io) {
				io.printStackTrace();
			}
		}
	}
}