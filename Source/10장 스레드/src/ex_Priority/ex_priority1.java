package ex_Priority;

	class ImportantThread extends Thread{
		public ImportantThread(String name) {
			super(name);
		}

		@Override
		public void run() {
			for(int i = 1; i <= 15; i++) {
				System.out.println(currentThread().getName());
			}
		}
	}
	
	class NotImportantThread extends Thread{
		public NotImportantThread(String name) {
			super(name);
		}
		@Override
		public void run() {
			for(int i = 1; i <= 15; i++) {
				System.out.println(currentThread().getName());
			}
		}
	}

public class ex_priority1 {

	/* 
	 	- �켱������ �������� ���� ������
	 	���� ������ ������� ���� �߿��� �۾��� �ϴ� �����尡 �ִٸ� �켱������ ���� �����ϴ� ���̴�.
	 	�ۼ��� : 1207
	 */
	
	public static void main(String[] args) {
		ImportantThread it = new ImportantThread("�߿��� �۾�");
		NotImportantThread nit = new NotImportantThread("�� �߿��� �۾�");
		nit.start();
		it.start();
	}

}
