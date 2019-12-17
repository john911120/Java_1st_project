package ex_Stream_for_String;

import java.io.FileWriter;
import java.io.IOException;

public class ex_FileWriterTest {

	/*
	 	FileWriter
	 	- ������ �����͸� ���� ������ ����ϴ� Ŭ������ FileOutputStream�� �����Ǵ� Ŭ�����̴�.
	 	�ۼ��� : 1210
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
