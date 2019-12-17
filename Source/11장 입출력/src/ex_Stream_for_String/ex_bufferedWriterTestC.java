package ex_Stream_for_String;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ex_bufferedWriterTestC {

	/*
 	BufferedWriter(new Line �޼ҵ� ���)
 	- flush ����� �����Ǿ��־ flush�� ������ϴ� �����͵��� ���������� ������� ��µȴ�.
 	- Buffer�� ������� �����͸� �� ���� ����ϸ� flush�� ������ �ʾƵ� �ڵ����� flushó���� �Ǹ鼭
 	   ��� ��Ʈ���� ��µ� ������� ������� ����� ������ ���� �ȿ� ���� ����� �ʰ����� �ʴ� �����Ͱ� ����ִٸ�
 	   ���� �ȿ��� ��� �Ǿ��ִ� ������� �ڵ����� flush���� �ʴ´�.
 	�ۼ��� : 1210
 */
	
	public static void main(String[] args) {
		FileWriter fileW = null;
		BufferedWriter buW = null;
		
		try {
			fileW = new FileWriter("bufferWriter2.txt");
			buW = new BufferedWriter(fileW,4);
			buW.write("1�� ����");
			buW.newLine();
			buW.write("2�� ����");
			buW.newLine();
			buW.write("3�� ����");
			buW.newLine();
			buW.write("4�� ����");
			buW.newLine();
			/*
			 * ���� ���� �����͵��� ������� �÷��� ���ִ� �κ��ε� 
			 * BufferedWriter ��Ʈ���� close()�ϴ� �κ��� �����Ƿ� ���⼭ �� ������ �ص� �ȴ�.
			buW.flush();
			*/
			
		} catch(IOException io) {
			io.printStackTrace();
		}
		finally {
			try {
				buW.close();
			} catch(IOException io) {
				io.printStackTrace();
			}
		}
	}
}
