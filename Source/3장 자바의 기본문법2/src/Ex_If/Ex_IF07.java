package Ex_If;

public class Ex_IF07 {
	/*
	 * ������ �Է� �޾Ƽ� �հ� ���հ��� �������ִ� ���α׷�
	 * 3�� �ڹ��� ���ʹ���2 ������ ������Ʈ�� ���󰡼� �� �ۼ��ϰ� ���� �ϴ� �ܰ��Դϴ�.
	 * ��ø if�� 
	 */
	public static void main(String[] args) {
		int kor = Integer.parseInt(args[0]);
		int mat = Integer.parseInt(args[1]);
		int eng = Integer.parseInt(args[2]);
		int total = 0;
		
		// ���� ���
		total = kor + mat + eng;
		
		// �ܺ� if����
		if(total >= 180) {
			// ���� if����
			if(kor < 40 || mat < 40 || eng < 40) {
				System.out.println("���������� ���� ���հ� �Դϴ�.");
			} else {
				System.out.println("�հ��Դϴ�. �����մϴ�.");
			} 
		} else {
			System.out.println("���� �������� ���� ���հ��Դϴ�.");
		}
	}
}
