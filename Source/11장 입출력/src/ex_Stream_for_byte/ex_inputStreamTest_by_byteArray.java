package ex_Stream_for_byte;

import java.io.ByteArrayInputStream;

public class ex_inputStreamTest_by_byteArray {

	/*
		ByteArrayInputStream
		- �޸𸮿� �����Ǿ� �ִ� ����Ʈ �迭 ��ü���� �����͸� �о���̴� ������ �Ѵ�.
		�ۼ��� : 1209
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