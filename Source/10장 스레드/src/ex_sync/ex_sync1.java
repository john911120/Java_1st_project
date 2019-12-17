package ex_sync;

	class EasyTicket implements Runnable{
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

		public void getTicket() {
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
		
		


public class ex_sync1 {

	/*
	  	- ����ȭ ����(����ȭ �۾� ���� ����)
	  	����ȭ�� ����ǥ�� �߱��ϴ� ����â����� �����ϸ� �ܿ� �¼��� 1�ڸ� �ۿ� ���µ� ���� �����忡��
	  	���ÿ� �޼ҵ尡 �����ؼ� ����ó���� ��������µ� ���⼭ �ùٸ��� ����ó���� �Ǿ��ٰ� ���� ����.
	  	�׷��� �ʿ��Ѱ� ����ȭ ��, Ư�� �����尡 �۾�ó���ϰ� ������ �ٸ� �����忡���� �ش� �޼ҵ忡 ���� �ȵǰ�
	  	�ϴ� ����� ����ȭ��� �Ѵ�. 
	  	�ۼ��� : 1207
	  	
	 */
	
	public static void main(String[] args) {
		EasyTicket et = new EasyTicket();
		Thread et1 = new Thread(et,"TicketConsumer1");
		Thread et2 = new Thread(et,"TicketConsumer2");
		et1.start();
		et2.start();
	}

}
