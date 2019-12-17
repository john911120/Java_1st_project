package ex_Stream_for_byte;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ex_inputStreamTest_by_byteArrayOutput {

	/*
		ByteArrayOutputStream
		- 메모리에 생성되어 있는 바이트 배열 객체에서 데이터를 읽어들이는 역할을 한다.
		작성일 : 1209
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