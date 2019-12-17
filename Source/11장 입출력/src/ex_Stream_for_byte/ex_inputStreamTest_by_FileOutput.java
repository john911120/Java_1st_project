package ex_Stream_for_byte;

import java.io.FileOutputStream;
import java.io.IOException;


public class ex_inputStreamTest_by_FileOutput {

	/*
		FileOutputStream
		- Ư���� ��� ���Ϸ� ������ ����ϴ� ������ �ϴ� Ŭ�����̴�.
		- ������ �� ������ ��ο� ������ ������ �ڵ����� �������ְ�, ���丮 ��ü�� �������� �ʴ´ٸ�
		   FileNotFoundException ���ܰ� �߻��Ѵ�.
		�ۼ��� : 1209
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