package ex_wait_notifiy_notifyAll;

public class InOutProcess {

	/*
	  �մ��� ������ ������ ����� �����ϴ� Ŭ������ �����ϴ� �ڵ�
	  �ۼ��� : 1207
	*/
	
	public static int MAX_GUEST = 5;
	int guestNum = 0;
	
	
	public synchronized void inGuest() {
		System.out.println("�մ��� ���Դ�.");
		guestNum++;
		System.out.println("���� �մ���" + guestNum + "���Դϴ�.");
		if(guestNum == MAX_GUEST) {
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void outGuest() {
		if(guestNum < 1) {
			notify();
			return;
		}
		System.out.println("�մ��� ������.");
		guestNum--;
		System.out.println("���� �մ���" + guestNum + "���Դϴ�.");
	}
	
	public static void main(String[] args) {
		InOutProcess ip = new InOutProcess();
		InGuestThread ig = new InGuestThread(ip);
		OutGuestThread og = new OutGuestThread(ip);
		
		ig.start();
		og.start();
	}

}
