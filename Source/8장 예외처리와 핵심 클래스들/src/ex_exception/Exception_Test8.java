package ex_exception;

class ArgsException extends Exception{
	private int argsNumber;
	
	public int getArgsNumber() {
		return argsNumber;
	}

	public void setArgsNumber(int argsNumber) {
		this.argsNumber = argsNumber;
	}
	
	public ArgsException(String msg) {
		super(msg);
	}
}

public class Exception_Test8 {
	/*
	 * ���� ó�� ����(����� ���� ���� ����)
	 * �ۼ��� : 1128
	 */
	
	public static void main(String[] args) {
		try {
			if(args.length != 2) {
				ArgsException ae = new ArgsException("���ڸ� 2�� �Է��ؾ��մϴ�.");
				ae.setArgsNumber(args.length);
				throw ae;
			}
		 else {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		}
	}
		catch(ArgsException a){
			System.out.println(a.getMessage());
			System.out.println("����� �Է��� ���� ���� "+ a.getArgsNumber() + "���Դϴ�.");
		}
	}
}
