package ex_Stream_for_Obj;

import java.io.Serializable;

/*
 * Serializable(사용자의 정보를 저장하는 User클래스를 Serializable 인터페이스 구현 정의 예제)
 *  -  아무런 메소드도 정의가 되어있지 않았다. 단, 해당 클래스 객체가 직렬화 대상인지 아닌지의 여부를 판단
 *  	하기 위해서 사용이된다. 해당 클래스가 Serializable 인터페이스를 구현하고 있다면 직렬화가 가능한
 *      클래스이고 구현되어있지 않는다면 직렬화가 되지 않는 클래스로 판단한다. 구현하디 않은 객체를 직렬화를 시도하려한다면
 *      NotSerializableException 예외가 발생한다.
 * 작성일 : 1210
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
		return "아이디 = " + id + ",이름 =" + name + ",나이 = " + age + ", 비밀번호 = " + passwd + ", 동 = " + dong;
	}
}