package ex_Stream_for_byte;

import java.io.FileInputStream;
import java.io.IOException;

public class ex_inputStreamTest_by_fileInput {

	/*
		FileInputStream
		- 특정 파일로부터 바이트 단위로 데이터를 읽어들이는 스트림 클래스이다.
		작성일 : 1209
	*/
	public static void main(String[] args) {
		FileInputStream fin = null;
		
		try 
			{
			fin = new FileInputStream("C:\\test.txt");
			}
			catch (IOException io)
			{
				io.printStackTrace();
			}
			
		int var_read = -1;
		
			try {
				while((var_read = fin.read()) != -1) {
					System.out.print((char)var_read);
				}
			}
			catch(IOException io) {
				io.printStackTrace();
			}
			finally {
				try {
					fin.close();
				} catch(IOException io) {
					io.printStackTrace();
				}
			}
		}
	}