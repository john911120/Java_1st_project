package ex_RandomAccessFile;

import java.io.FileOutputStream;
import java.io.RandomAccessFile;

/*
 * RandomAccessFile
 *  -  이전까지 사용한 스트림은 단방향 작업만 가능했었는데 출력 스트림은 쓰기 작업만 가능했었고 입력 스트림은
 *     읽기 작업만 가능했었다. 데이터를 출력하면서 동시에 읽어들이는 기능은 없었다. 그러나 이 클래스를 사용하면
 *     데이터를 읽으면서 동시에 출력이 가능한 기능을 제공한다.pointer를 사용해서 작업할 위치를 조절을 할 수있다.
 *  
 * 작성일 : 1211
 */

public class ex_RandomAccessFileTest {

	public static void main(String[] args) {
		RandomAccessFile raf = null;
		
		try {
			raf = new RandomAccessFile("random.txt","rw");		
			System.out.println("시작 파일 포인터 : " + raf.getFilePointer());
			
			raf.writeInt(75);
			raf.writeBoolean(false);
			raf.writeChar('A');
			raf.writeLong(100);
			
			System.out.println("데이터 출력 후 파일 포인터 : " + raf.getFilePointer());
			raf.seek(0);
			System.out.println("int 값 출력 : " + raf.readInt());
			System.out.println("boolean 값 출력 : " + raf.readBoolean());
			
			raf.skipBytes(2);
			System.out.println("long 값 출력 : " + raf.readLong());
			
	} catch(Exception e) {
		e.printStackTrace();
		}
	}
}
