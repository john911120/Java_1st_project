package ex_Stream_for_byte;

import java.io.IOException;

public class ex_inputStreamTest_by_byte {

	/*
		inputTypeTest(inputStream)
		- ����Ʈ ��� �Է� ��Ʈ���� �ֻ��� Ŭ������ ���� ���� Ŭ�������� 
		   �ش� Ŭ������ ��ӹް� �ִ�.
		�ۼ��� : 1209
	*/
	public static void main(String[] args) {
		int var_byte = -1;
		
		do {
			try 
			{
				var_byte = System.in.read();
			}
			catch (IOException io)
			{
				io.printStackTrace();
			}
			if(var_byte == 10 || var_byte == 13) continue;
			if(var_byte == -1) break;
			System.out.println("���� �� : " + (char)var_byte);
		}
		while(true);
	}
}
