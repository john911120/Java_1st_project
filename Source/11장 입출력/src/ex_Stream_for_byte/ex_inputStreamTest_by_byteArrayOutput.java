package ex_Stream_for_byte;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ex_inputStreamTest_by_byteArrayOutput {

	/*
		ByteArrayOutputStream
		- �޸𸮿� �����Ǿ� �ִ� ����Ʈ �迭 ��ü���� �����͸� �о���̴� ������ �Ѵ�.
		�ۼ��� : 1209
	*/
	public static void main(String[] args) {
		String msg = "ByteArrayOutputStream test";
		ByteArrayOutputStream bao = null;
		
		try 
		{
			bao = new ByteArrayOutputStream();
			bao.write(msg.getBytes());
			System.out.println("bao = " + bao);
		} 
		catch(IOException io) {
			io.printStackTrace();
		}
		finally {
			try 
			{
				bao.close();
			} catch(IOException io) {
				io.printStackTrace();
			}
		}
	}
}