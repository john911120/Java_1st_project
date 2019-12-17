package ex_Stream_for_byte;

import java.io.ByteArrayInputStream;

public class ex_inputStreamTest_by_byteArray {

	/*
		ByteArrayInputStream
		- 메모리에 생성되어 있는 바이트 배열 객체에서 데이터를 읽어들이는 역할을 한다.
		작성일 : 1209
	*/
	public static void main(String[] args) {
		byte[] datas = new byte[] {10, 20, 30, 40};
		ByteArrayInputStream bai = new ByteArrayInputStream(datas);
		int var_readbyte = -1;
		
		while((var_readbyte = bai.read()) != -1) {
			System.out.print(var_readbyte + "");
		}
		
		}
	}