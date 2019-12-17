package ex_Stream_for_basic_dataType;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ex_datastreamTest {

	/*
	 	DataInputStream // DataOutputStream
	 	- java에서는 바이트 단위로 데이터를 입출력하는 클래스만 제공하는 것이 아니라 기본 데이터 타입으로 값을 입출력할 수 있는 형태의 클래스
	 	    를 제공한다. 이 클래스들은 각 DataOutput, DataInput인터페이스를 구현하고 있다. 또한 DataOutputStream과 FilterInputStream
	 	    클래스는 다른 스트림에 특정 기능을 추가하는 역할을 한다. 이 두 클래스는 상속 받은 클래스들은 객체를 생성할 때 기능을 추가할 스트림 객체를 필요로 하다.
	 	작성일 : 1210
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
