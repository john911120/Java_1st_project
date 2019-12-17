package ex_Stream_for_basic_dataType;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ex_datastreamTest {

	/*
	 	DataInputStream // DataOutputStream
	 	- java������ ����Ʈ ������ �����͸� ������ϴ� Ŭ������ �����ϴ� ���� �ƴ϶� �⺻ ������ Ÿ������ ���� ������� �� �ִ� ������ Ŭ����
	 	    �� �����Ѵ�. �� Ŭ�������� �� DataOutput, DataInput�������̽��� �����ϰ� �ִ�. ���� DataOutputStream�� FilterInputStream
	 	    Ŭ������ �ٸ� ��Ʈ���� Ư�� ����� �߰��ϴ� ������ �Ѵ�. �� �� Ŭ������ ��� ���� Ŭ�������� ��ü�� ������ �� ����� �߰��� ��Ʈ�� ��ü�� �ʿ�� �ϴ�.
	 	�ۼ��� : 1210
	 */
	
	public static void main(String[] args) {
		FileOutputStream fo = null;
		FileInputStream fi = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		
		try {
			fo = new FileOutputStream("dataFile.txt");
			fi = new FileInputStream("dataFile.txt");
			dos = new DataOutputStream(fo);
			dis = new DataInputStream(fi);
			
			dos.writeShort(-1);
			dos.writeByte(2);
			dos.writeDouble(4.71);
			dos.writeLong(30);
			dos.writeUTF("seoul public Transfortation");
			
			System.out.println(dis.readUnsignedShort());
			dis.skip(1);
			System.out.println(dis.readDouble());
			System.out.println(dis.readLong());
			System.out.println(dis.readUTF());
		} catch(IOException io) {
			io.printStackTrace();
		}
		finally {
			try {
				fi.close();
				fo.close();
				dis.close();
				dos.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
