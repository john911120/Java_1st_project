package ex_Stream_for_String;


import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ex_outputStreamWriter {

	/*
 	OutputStreamWriter
 	- ����Ʈ ��� ��� ��Ʈ���� ���� ��� ��� ��Ʈ������ ��ȯ�� �� �ִ� ����� �����Ѵ�.
 	   ��Ʈ��ũ ���α׷��� ��� �������� ���� ������ �����͸� ����ϸ� outputStreamWriter�� �̿��ؼ�
 	   ����Ʈ ���� ��� ��Ʈ���� ���� ���� ��� ��Ʈ������ ��ȯ �۾��� �ؾ��Ѵ�.
 	�ۼ��� : 1210
 */
	
	public static void main(String[] args) {
		FileOutputStream fileOutputS = null;
		OutputStreamWriter outWriter = null;
		BufferedWriter buffW = null;	
		
		try {
			fileOutputS = new FileOutputStream("outputStream.txt");
			outWriter = new OutputStreamWriter(fileOutputS);
			buffW = new BufferedWriter(outWriter);
			
			buffW.write("OutputStreamWriter �׽�Ʈ");
			buffW.newLine();
			buffW.write("OutputStreamWriter �׽�Ʈ");
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
