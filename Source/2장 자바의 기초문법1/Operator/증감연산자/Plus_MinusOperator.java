package ����������;

public class Plus_MinusOperator {
	/*
	 * ���� ������ �׽�Ʈ ����
	 * �ۼ��� : 191102
	 */
	
	public static void main(String[] args) {
		int var_inc = 1;
		int var_dec = 1;
		int result = 0;
		
		//++, -- ������ ����
		
		/*
		 * ���� ���� 1�� ������Ű�ų� 1�� ���ҽ�Ű�� �����ڷ� ��ġ�� ���� 
		 * ���� �޶����� �ȴ� �տ����� ���� �����ڰ� ���� ����ǰ� �ٸ� ������ �����ϰ�
		 * �ڿ� ���� �ٸ� ���� ���� �����ϰ� ���� �����ڸ� �����Ѵ�.
		 */
		result = var_inc++;
		System.out.println("result = " + result);
		System.out.println("var_inc = " + var_inc);
		
		result = ++var_inc;
		System.out.println("result = " + result);
		System.out.println("var_inc = " + var_inc);
		
		result = var_dec--;
		System.out.println("result = " + result);
		System.out.println("var_dec = " + var_dec);

		result = --var_dec;
		System.out.println("result = " + result);
		System.out.println("var_dec = " + var_dec);

		
	}

}
