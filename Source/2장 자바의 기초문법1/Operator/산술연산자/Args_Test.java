package ���������;

public class Args_Test {
	
	/*
	 * ������ ���ڷ� �޾Ƽ� ������ ����� ���ϴ� ����
	 */
	public static void main(String[] args) {
		int total = 0;
		int avg = 0;
		
		int kor = Integer.parseInt(args[0]);
		int math = Integer.parseInt(args[0]);
		int eng = Integer.parseInt(args[0]);
		int jap = Integer.parseInt(args[0]);
		
		total = kor + math + eng + jap;
		avg = total / 4;
		
		System.out.println("total = " + total);
		System.out.println("avg = " + avg);
	}

}
