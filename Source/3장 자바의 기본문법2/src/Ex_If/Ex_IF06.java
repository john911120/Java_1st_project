package Ex_If;

public class Ex_IF06 {
	/*
	 * ������ �Է¹޾� ��Ģ������ �ϴ� ����
	 * 3�� �ڹ��� ���ʹ���2 ������ ������Ʈ�� ���󰡼� �� �ۼ��ϰ� ���� �ϴ� �ܰ��Դϴ�.
	 * ���� if�� ����
	 */
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[2]);
		String operation = args[1];
		int result = 0;
		
		
		if(operation.equals("+")) {
			result = num1 + num2;
		}
		else if(operation.equals("-")) {
			result = num1 - num2;
		}
		else if(operation.equals("/")) {
			result = num1 / num2;
		}
		else if(operation.equals("X")) {
			result = num1 * num2;
		}
		if(result != 0) {
			System.out.println(num1 + operation + num2 + "=" + result);
		} else {
			System.out.println("�����ڰ� �߸��Ǿ����ϴ�.");
		}
		
	}
	
}
