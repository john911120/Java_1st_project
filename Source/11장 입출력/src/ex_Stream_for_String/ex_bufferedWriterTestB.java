package ex_Stream_for_String;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ex_bufferedWriterTestB {

	/*
 	BufferedWriter(flush메소드 호출했을 때의 경우)
 	- flush 기능이 구현되어있어서 flush를 해줘야하는 데이터들이 최종적으로 대상으로 출력된다.
 	- Buffer의 사이즈보다 데이터를 더 많이 출력하면 flush를 해주지 않아도 자동으로 flush처리가 되면서
 	   출력 스트림에 출력된 내용들이 대상으로 출력이 되지만 버퍼 안에 버퍼 사이즈를 초과하지 않는 데이터가 들어있다면
 	   버퍼 안에서 출력 되어있는 내용들은 자동으로 flush되지 않는다.
 	작성일 : 1210
 */
	
	public static void main(String[] args) {
		FileWriter fileW = null;
		BufferedWriter buW = null;
		
		try {
			fileW = new FileWriter("bufferWriter.txt");
			buW = new BufferedWriter(fileW,4);
			buW.write('A');
			buW.write('B');
			buW.write('C');
			buW.write('D');
			/*
			 * 버퍼 안의 데이터들을 대상으로 플러시 해주는 부분인데 
			 * BufferedWriter 스트림을 close()하는 부분이 있으므로 여기서 는 생략을 해도 된다.
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
