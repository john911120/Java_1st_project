package ex_HashMap_bulletin_ContentRWD;

import java.util.HashMap;

public class LoginSVC {
	private HashMap<String, String> loginDatas;
	private HashMap<String, User> userDatas;
	
	public LoginSVC() {
		loginDatas = new HashMap<String, String>();
		userDatas = new HashMap<String, User>();
		loginDatas.put("java", "java");
		userDatas.put("java", new User("java","java","응암동",22,"시명이"));
	}
	public User login(String id, String passwd) {
		User user = null;
		if(loginDatas.containsKey(id)) {
			if(loginDatas.get(id).equals(passwd)) {
				user = userDatas.get(id);
			}
		}
		return user;
	}
}
