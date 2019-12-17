package ex_String_class;

public class StringTest_2 {
	/*
		¹®ÀÚ¿­ °´Ã¼ ºñ±³ ¿¹Á¦
		ÀÛ¼ºÀÏ : 1129
	*/
	
	public static void main(String[] args) {
		String string1 = "TestString";
		String string2 = "testMessage";
		
		System.out.println("string1 == string2: " + (string1 == string2));
		System.out.println("string1.equals(string2): " + (string1.equals(string2)));
		
		String string3 = "ÇÔ²² Æø4ÇÏÀÚ";
		String string4 = "°ù°ù°ù°ù°ù°ù";
		
		System.out.println("string3 == string4: " + (string3 == string4));
		System.out.println("string3.equals(string4): " + (string3.equals(string4)));
		
	}

}
