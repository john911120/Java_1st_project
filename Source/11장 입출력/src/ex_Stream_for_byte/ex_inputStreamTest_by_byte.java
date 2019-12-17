package ex_Stream_for_byte;

import java.io.IOException;

public class ex_inputStreamTest_by_byte {

	/*
		inputTypeTest(inputStream)
		- 바이트 기반 입력 스트림의 최상위 클래스로 여러 하위 클래스들이 
		   해당 클래스를 상속받고 있다.
		작성일 : 1209
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
			System.out.println("읽은 값 : " + (char)var_byte);
		}
		while(true);
	}
}
