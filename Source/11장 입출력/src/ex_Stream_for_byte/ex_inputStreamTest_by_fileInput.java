package ex_Stream_for_byte;

import java.io.FileInputStream;
import java.io.IOException;

public class ex_inputStreamTest_by_fileInput {

	/*
		FileInputStream
		- Ư�� ���Ϸκ��� ����Ʈ ������ �����͸� �о���̴� ��Ʈ�� Ŭ�����̴�.
		�ۼ��� : 1209
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