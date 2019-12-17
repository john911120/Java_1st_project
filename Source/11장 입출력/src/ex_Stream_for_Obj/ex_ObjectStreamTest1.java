package ex_Stream_for_Obj;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ex_ObjectStreamTest1 {

	/*
	 * Serializable(objectInputStream/objectOutputStream)
	 *  -  �ƹ��� �޼ҵ嵵 ���ǰ� �Ǿ����� �ʾҴ�. ��, �ش� Ŭ���� ��ü�� ����ȭ ������� �ƴ����� ���θ� �Ǵ�
	 *  	�ϱ� ���ؼ� ����̵ȴ�. �ش� Ŭ������ Serializable �������̽��� �����ϰ� �ִٸ� ����ȭ�� ������
	 *      Ŭ�����̰� �����Ǿ����� �ʴ´ٸ� ����ȭ�� ���� �ʴ� Ŭ������ �Ǵ��Ѵ�. �����ϵ� ���� ��ü�� ����ȭ�� �õ��Ϸ��Ѵٸ�
	 *      NotSerializableException ���ܰ� �߻��Ѵ�.
	 * �ۼ��� : 1210
	 */
	
	public static void main(String[] args) {
		User1 beforUser1 = new User1("aaa","aaa","�ֹ���",12,"��Ѹ�");
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
