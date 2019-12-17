package ex_Stream_for_Obj;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * Serializable(Externalizable)
 *  -  Serializable의 자식 인터페이스로, Serializable 인터페이스를 구현한 클래스의 모든 변수들은
 *     전부 직렬화 대상이 되지만 Externalizable 인터페이스를 구현한 클래스에서는 readExternal메소드나
 *     writeExternal 메소드에서 정의한 변수들만 직렬화 대상이 된다.
 * 작성일 : 1211
 */

public class ex_ObjectStreamTest2 {

	public static void main(String[] args) {
		User2 beforUser2 = new User2("aab","app","홍은동",11,"홍갑동");
		User2 afterUser2 = null;
		FileOutputStream fileos = null;
		ObjectOutputStream objectos = null;
		FileInputStream fileis = null;
		ObjectInputStream objectis = null;
		
		try {
			fileos = new FileOutputStream("user1Info.ser");
			objectos = new ObjectOutputStream(fileos);
			objectos.writeObject(beforUser2);
			
			fileis = new FileInputStream("user1Info.ser");
			objectis = new ObjectInputStream(fileis);
			afterUser2 = (User2) objectis.readObject();
			
			System.out.println(afterUser2);
	} catch(Exception e) {
		e.printStackTrace();
	}
		finally {
			try {
				fileos.close();
				fileis.close();
				objectos.close();
				objectis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
