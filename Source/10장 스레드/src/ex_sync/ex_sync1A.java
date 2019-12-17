package ex_sync;

	class EasyTicket1 implements Runnable{
		int ticketNum = 10; // �ܿ� �¼��� 10�ڸ� �ۿ� �ȳ��Ҵ�.
		
		@Override
		public void run() {
			for(int i = 1; i <= 10; i++) {
				try {
					Thread.sleep(1000);
				}
				catch(InterruptedException e){
					e.printStackTrace();
				}
				getTicket();
			}
		}

		public synchronized void getTicket() {
			ticketNum -= 1;
			if(ticketNum <= 0) {
				System.out.println(Thread.currentThread().getName()+ ",");
				
				System.out.println("�ܿ� �¼� ����");
				return;
			}
			System.out.println(Thread.currentThread().getName()+ ",");
			
			System.out.println("���� �ܿ� �¼���" + ticketNum + "�¼��Դϴ�.");
		}
	}
		
		


public class ex_sync1A {

	/*
	  	- ����ȭ ����(�޼ҵ忡 ����ȭ, ����ȭ �ڵ� ��ϸ� ���� �� ����)
	  	
	  	�ۼ��� : 1207	  	
	 */
	
	/* �޼ҵ忡 ����ȭ�ϴ� �⺻ ����
	 
	public synchronized void method()
	{
	
	}
	
	*/
	
	
	
	public static void main(String[] args) {
		EasyTicket1 et = new EasyTicket1();
		Thread et1 = new Thread(et,"TicketConsumer1");
		Thread et2 = new Thread(et,"TicketConsumer2");
		et1.start();
		et2.start();
	}

}
