package Class_Reserve_Ex2;

import Class_Reserve_Ex1.PublicData;

/*
 * �ٸ� ��Ű���� �����ϴ� Ŭ������ ����ϰ� �ǹǷ� import������Ѵ�.
 * �ۼ��� : 1122
 */
public class PublicAccess {

	public static void main(String[] args) {
		PublicData pd = new PublicData();
		System.out.println("publicdata = " + pd.publicVar);
	}

}
