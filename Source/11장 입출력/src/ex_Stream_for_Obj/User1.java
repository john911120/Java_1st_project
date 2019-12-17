package ex_Stream_for_Obj;

import java.io.Serializable;

/*
 * Serializable(������� ������ �����ϴ� UserŬ������ Serializable �������̽� ���� ���� ����)
 *  -  �ƹ��� �޼ҵ嵵 ���ǰ� �Ǿ����� �ʾҴ�. ��, �ش� Ŭ���� ��ü�� ����ȭ ������� �ƴ����� ���θ� �Ǵ�
 *  	�ϱ� ���ؼ� ����̵ȴ�. �ش� Ŭ������ Serializable �������̽��� �����ϰ� �ִٸ� ����ȭ�� ������
 *      Ŭ�����̰� �����Ǿ����� �ʴ´ٸ� ����ȭ�� ���� �ʴ� Ŭ������ �Ǵ��Ѵ�. �����ϵ� ���� ��ü�� ����ȭ�� �õ��Ϸ��Ѵٸ�
 *      NotSerializableException ���ܰ� �߻��Ѵ�.
 * �ۼ��� : 1210
 */
public class User1 implements Serializable {
	private String id;
	private String passwd;
	private String dong;
	private int age;
	private String name;
	
	public User1(String id, String passwd, String dong, int age, String name) {
		super();
		this.id = id;
		this.passwd = passwd;
		this.dong = dong;
		this.age = age;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getDong() {
		return dong;
	}

	public void setDong(String dong) {
		this.dong = dong;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "���̵� = " + id + ",�̸� =" + name + ",���� = " + age + ", ��й�ȣ = " + passwd + ", �� = " + dong;
	}
}