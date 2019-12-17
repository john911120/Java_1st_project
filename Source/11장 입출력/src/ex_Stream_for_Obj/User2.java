package ex_Stream_for_Obj;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class User2 implements Externalizable {
	private String id;
	private String passwd;
	private String dong;
	private int age;
	private String name;
	
	public User2() {
		
	}
	
	public User2(String id, String passwd, String dong, int age, String name) {
		super();
		this.id = id;
		this.passwd = passwd;
		this.dong = dong;
		this.age = age;
		this.name = name;
	}
	
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		id = in.readUTF();
		passwd = in.readUTF();
		dong = in.readUTF();
		age = in.readInt();
		name = in.readUTF();
	}
	
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(id);
		out.writeUTF(passwd);
		out.writeUTF(dong);
		out.writeInt(age);
		out.writeUTF(name);
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