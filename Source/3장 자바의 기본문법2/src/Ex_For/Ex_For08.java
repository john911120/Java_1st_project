package Ex_For;

public class Ex_For08 {
	/*
	 * �ﰢ�� �������� ���ڸ� ����ϴ� ����
	 * 3�� �ڹ��� ���ʹ���2 ������ ������Ʈ�� ���󰡼� �� �ۼ��ϰ� ���� �ϴ� �ܰ��Դϴ�.
	 * ���� for��
	 */
	public static void main(String[] args) {
		int num = 0;
		for(int x = 1; x <= 5;x++) {
			for(int y = 1; y<=x;y++) {
				System.out.print(++num+"\t");
			}
			System.out.println();
		}
		
		num = 0;
		for(int x = 1; x <= 5;x++) {
			for(int y = 1; y<=(6-x);y++) {
				System.out.print(++num+"\t");
			}
			System.out.println();
		}
	}
}
