package ex_Stream_for_Obj;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ex_ObjectStreamTest1 {

	/*
	 * Serializable(objectInputStream/objectOutputStream)
	 *  -  아무런 메소드도 정의가 되어있지 않았다. 단, 해당 클래스 객체가 직렬화 대상인지 아닌지의 여부를 판단
	 *  	하기 위해서 사용이된다. 해당 클래스가 Serializable 인터페이스를 구현하고 있다면 직렬화가 가능한
	 *      클래스이고 구현되어있지 않는다면 직렬화가 되지 않는 클래스로 판단한다. 구현하디 않은 객체를 직렬화를 시도하려한다면
	 *      NotSerializableException 예외가 발생한다.
	 * 작성일 : 1210
	 */
	
	public static void main(String[] args) {
		User1 beforUser1 = new User1("aaa","aaa","쌍문동",12,"고둘리");
		User1 afterUser1 = null;
		FileOutputStream fileos = null;
		ObjectOutputStream objectos = null;
		FileInputStream fileis = null;
		ObjectInputStream objectis = null;
		
		try {
			fileos = new FileOutputStream("userInfo.ser");
			objectos = new ObjectOutputStream(fileos);
			objectos.writeObject(beforUser1);
			
			fileis = new FileInputStream("userInfo.ser");
			objectis = new ObjectInputStream(fileis);
			afterUser1 = (User1) objectis.readObject();
			
			System.out.println(afterUser1);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fileos.close();
				fileis.close();
				objectos.close();
				objectis.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
