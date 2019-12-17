package ex_RandomAccessFile;

import java.io.FileOutputStream;
import java.io.RandomAccessFile;

/*
 * RandomAccessFile
 *  -  �������� ����� ��Ʈ���� �ܹ��� �۾��� �����߾��µ� ��� ��Ʈ���� ���� �۾��� �����߾��� �Է� ��Ʈ����
 *     �б� �۾��� �����߾���. �����͸� ����ϸ鼭 ���ÿ� �о���̴� ����� ������. �׷��� �� Ŭ������ ����ϸ�
 *     �����͸� �����鼭 ���ÿ� ����� ������ ����� �����Ѵ�.pointer�� ����ؼ� �۾��� ��ġ�� ������ �� ���ִ�.
 *  
 * �ۼ��� : 1211
 */

public class ex_RandomAccessFileTest {

	public static void main(String[] args) {
		RandomAccessFile raf = null;
		
		try {
			raf = new RandomAccessFile("random.txt","rw");		
			System.out.println("���� ���� ������ : " + raf.getFilePointer());
			
			raf.writeInt(75);
			raf.writeBoolean(false);
			raf.writeChar('A');
			raf.writeLong(100);
			
			System.out.println("������ ��� �� ���� ������ : " + raf.getFilePointer());
			raf.seek(0);
			System.out.println("int �� ��� : " + raf.readInt());
			System.out.println("boolean �� ��� : " + raf.readBoolean());
			
			raf.skipBytes(2);
			System.out.println("long �� ��� : " + raf.readLong());
			
	} catch(Exception e) {
		e.printStackTrace();
		}
	}
}
