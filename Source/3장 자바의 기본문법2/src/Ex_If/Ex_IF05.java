package Ex_If;

public class Ex_IF05 {
	/*
	 * ���̵�� ��й�ȣ ��ġ ���θ� �Ǵ��ؼ� �α����� ó���ϴ� ����
	 * 3�� �ڹ��� ���ʹ���2 ������ ������Ʈ�� ���󰡼� �� �ۼ��ϰ� ���� �ϴ� �ܰ��Դϴ�.
	 * ���� if�� ����
	 */
	
	/*
	 * ���α׷� �ۼ� ����
	 * ���̵� : java
	 * ��й�ȣ : java
	 * ���̵� ��ġ������ ��й�ȣ�� Ʋ���ٸ� "��й�ȣ�� ���� �ʽ��ϴ�." �޽��� ���
	 * ���̵�� ��� ��ȣ�� ��ġ�ϸ� "�α��� ����" �̶�� �޽����� ����Ѵ�.
	 * ���̵� Ʋ���� ��쿡�� "ȸ�� ������ ��ġ ���� �ʽ��ϴ�."��� �޽����� ����Ѵ�.
	 */
	public static void main(String[] args) {
		String id = args[0];
		String password = args[1];
		
		if(!id.equals("java")) {
			System.out.println("ȸ�� ������ ��ġ ���� �ʽ��ϴ�.");
		} else if (!password.equals("java")) {
			System.out.println("��й�ȣ�� ���� �ʽ��ϴ�.");
		} else {
			System.out.println("�α��� ����");
		}
		
	}
}
