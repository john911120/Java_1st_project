package ex_sync;

	class DressingRoomThread implements Runnable{
		
		@Override
		public void run() {
			synchronized(this) {
				for(int i = 12; i >= 1; i--) {
					try {
						Thread.sleep(1000);
					}
					catch(InterruptedException e){
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName());
					System.out.println("Dressing ����" + (i*10) + "�� ��..");
				}
				System.out.println(Thread.currentThread().getName() + "dressing �Ϸ�");
			}
		}
	}
			
public class ex_sync2 {

	/*
	  	- ����ȭ ����(Ư�� ��ü�� ����ȭ�� ������ ����)
	  	�մ��� ���� �巹�� �뿡�� ���� �Դ� ������ �ٸ� �մ��� �������� ����ȭ ó���ϴ� �����̴�.
	  	�ۼ��� : 1207
	  	
	 */
	
	public static void main(String[] args) {
		DressingRoomThread dr = new DressingRoomThread();
		
		Thread t1 = new Thread(dr,"ù ��° �մ�");
		Thread t2 = new Thread(dr,"�� ��° �մ�");
		
		t1.start();
		t2.start();
	}

}
