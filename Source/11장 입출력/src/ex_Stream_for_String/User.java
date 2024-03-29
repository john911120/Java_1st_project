package ex_Stream_for_String;

public class User {
	/*
 	InputStreamReader 예제
 	- 사용자 1명에 대한 정보를 저장하는 클래스
 	*/
	private String id;
	private String passwd;
	private String dong;
	private int age;
	private String name;
	
	public User(String id, String passwd, String dong, int age, String name) {
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