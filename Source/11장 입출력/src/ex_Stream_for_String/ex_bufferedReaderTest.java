package ex_Stream_for_String;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex_bufferedReaderTest {

	/*
 	Reader // BufferedReader
 	- �ڹٿ��� ���� ��� ����� ����� �����ϱ� ���� Reader, WriterŬ������ �����Ѵ�. InputStream�� �����Ǵ� Ŭ������ ReaderŬ�����̰�
 	   OutputStream�� �����Ǵ� Ŭ������ Writer Ŭ�����̴�.
 	- BufferedReader�� Reader ��Ʈ���� ���� ����� �߰��ϴ� ��Ʈ�� Ŭ������ ��󿡼� �����͸� ���� �� ���ۿ� �о��ٰ� ���۷κ��� ���ʷ� �о���̱� 
 	   ������ ������ ��������. ���� readLine()�̶�� �� ���κ��� �����͸� �о StringŸ������ �����͸� ��ȯ�� �ִ� ���� �޼ҵ尡 �����Ͽ��� ��� �󵵰� ����.
 	�ۼ��� : 1210
 */
	
	public static void main(String[] args) {
		FileInputStream fi = null;
		InputStreamReader isr = null;
		BufferedReader bfr = null;
		
		try {
			fi = new FileInputStream("bufferReader2.txt");
			isr = new InputStreamReader(fi);
			bfr = new BufferedReader(isr);
			
			String str = null;
			
			while((str = bfr.readLine()) != null) {
				System.out.println(str);
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fi.close();
				isr.close();
				bfr.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
