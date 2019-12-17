package ex_Stream_for_String;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class ex_FileReaderTest {

	/*
	 	FileReader
	 	- �������κ��� �����͸� ���� ������ ���� �� �ִ� ��Ʈ�� Ŭ������ InputStreamReaderŬ������ ��ӹ޴´�. 
	 	    ����� FileInputStream�� ����ϴ�.
	 	�ۼ��� : 1210
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
