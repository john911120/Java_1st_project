package ex_Stream_for_String;


import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ex_outputStreamWriter {

	/*
 	OutputStreamWriter
 	- 바이트 기반 출력 스트림을 문자 기반 출력 스트림으로 변환할 수 있는 기능을 제공한다.
 	   네트워크 프로그램인 경우 소켓으로 문자 단위로 데이터를 출력하면 outputStreamWriter를 이용해서
 	   바이트 단위 출력 스트림을 문자 단위 출력 스트림으로 변환 작업을 해야한다.
 	작성일 : 1210
 */
	
	public static void main(String[] args) {
		FileOutputStream fileOutputS = null;
		OutputStreamWriter outWriter = null;
		BufferedWriter buffW = null;	
		
		try {
			fileOutputS = new FileOutputStream("outputStream.txt");
			outWriter = new OutputStreamWriter(fileOutputS);
			buffW = new BufferedWriter(outWriter);
			
			buffW.write("OutputStreamWriter 테스트");
			buffW.newLine();
			buffW.write("OutputStreamWriter 테스트");
			buffW.newLine();
			
		} catch(IOException io) {
			io.printStackTrace();
		}
		finally {
			try {
				buffW.close();
			} catch(IOException io) {
				io.printStackTrace();
			}
		}
	}
}
