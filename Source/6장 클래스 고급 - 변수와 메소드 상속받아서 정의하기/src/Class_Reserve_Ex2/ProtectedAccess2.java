package Class_Reserve_Ex2;

public class ProtectedAccess2 extends ProtectedData {

	/*
	 * protected �� ���� ���� �����ڴ� ���� ��Ű�� �������� ���� ����������
	 * �ٸ� ��Ű���� ������ �ȵȴ�. �ٸ� ��Ű���� ��쿡�� �ڽ� Ŭ���������� ������ ������
	 * ���� �������̴�. ��Ű���� �޶� �ڽ� Ŭ���������� ������ �����ϴ�.
	 * �ٸ� ��Ű������ ����� ����ϰ��� �Ѵٸ� ProtectedDataŬ������ ��� �޾Ƽ� �����ؾ��Ѵ�.
	 * �ۼ��� : 1122
	 */
	void printVar() {
		System.out.println("protectedVar = " + protectedVar);
	}
	
	
	public static void main(String[] args) {
		ProtectedAccess2 pa = new ProtectedAccess2();
		pa.printVar();
	}

}
