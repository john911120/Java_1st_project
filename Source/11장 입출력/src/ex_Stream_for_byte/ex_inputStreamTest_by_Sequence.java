package ex_Stream_for_byte;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class ex_inputStreamTest_by_Sequence {

	/*
		SequenceInputStream
		- 입력 스트림 여러개를 하나의 입력 스트림으로 연결해서 데이터를 읽어들인다.
		작성일 : 1209
	*/
	public static void main(String[] args) {
		FileInputStream fln1 = null;
		FileInputStream fln2 = null;
		FileInputStream fln3 = null;
		SequenceInputStream si1 = null;
		SequenceInputStream si2 = null;
		
		try 
		{
			fln1 = new FileInputStream("test1.txt");
			fln2 = new FileInputStream("test2.txt");
			fln3 = new FileInputStream("test3.txt");
			
			Vector v = new Vector();
			v.add(fln1);
			v.add(fln2);
			v.add(fln3);
			
			Enumeration flns = v.elements();
			si1 = new SequenceInputStream(flns);
			
			int var_readbyte = -1;
			while((var_readbyte = si1.read()) != -1) {
				System.out.print((char)var_readbyte);
			}
			System.out.println();
			
			fln1 = new FileInputStream("test1.txt");
			fln2 = new FileInputStream("test2.txt");
			si2 = new SequenceInputStream(fln1,fln2);
			var_readbyte = -1;
			while((var_readbyte = si2.read()) != -1){
				System.out.print((char)var_readbyte);
			}
		}
		catch(IOException io) {
			io.printStackTrace();
		}
		finally {
			try {
				si1.close();
				si2.close();
			} catch(IOException io) {
				io.printStackTrace();
			}
		}
	}
}