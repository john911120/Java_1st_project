package ex_Stream_for_Obj;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * Serializable(Externalizable)
 *  -  Serializable�� �ڽ� �������̽���, Serializable �������̽��� ������ Ŭ������ ��� ��������
 *     ���� ����ȭ ����� ������ Externalizable �������̽��� ������ Ŭ���������� readExternal�޼ҵ峪
 *     writeExternal �޼ҵ忡�� ������ �����鸸 ����ȭ ����� �ȴ�.
 * �ۼ��� : 1211
 */

public class ex_ObjectStreamTest2 {

	public static void main(String[] args) {
		User2 beforUser2 = new User2("aab","app","ȫ����",11,"ȫ����");
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
