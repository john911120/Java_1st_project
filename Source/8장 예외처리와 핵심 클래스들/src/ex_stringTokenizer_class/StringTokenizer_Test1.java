package ex_stringTokenizer_class;

import java.util.StringTokenizer;

public class StringTokenizer_Test1 {

	/*
		������ ���ڿ��� Ư�� �����ڷ� �и��ؼ� �и��� ���ڿ����� ��ū���� ��ȯ���ִ� Ŭ�����̴�.
		Ư�� �����͵��� Ư�� �����ڷ� ���еǾ� ���� �� �� �ش� �����͵��� �����ڷ� �и��Ͽ� �����͸� ���� �� �� �ִ�.
		�ۼ��� : 1201
		
	*/
	public static void main(String[] args) {
		//|�� �����ڷ� ����� ���
		/*
		 * �����ȣ�� �� �� �� �� �ǹ��� |���� �����ߴ�.
		 */
		String source1 = "135-802|�����|������|������|������û";
		StringTokenizer st1 = new StringTokenizer(source1,"|");
		String zip = st1.nextToken();
		String shi = st1.nextToken();
		String gu = st1.nextToken();
		String dong = st1.nextToken();
		String build = st1.nextToken();
		
		// ����ϱ�
		System.out.println("�����ȣ:" + zip);
		System.out.println("��:" + shi);
		System.out.println("��:" + gu);
		System.out.println("��:" + dong);
		System.out.println("�ǹ�:" + build);
	}

}
