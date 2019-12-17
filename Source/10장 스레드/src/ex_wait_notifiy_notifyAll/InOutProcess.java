package ex_wait_notifiy_notifyAll;

public class InOutProcess {

	/*
	  손님이 들어오고 나가는 기능을 정의하는 클래스를 정의하는 코드
	  작성일 : 1207
	*/
	
	public static int MAX_GUEST = 5;
	int guestNum = 0;
	
	
	public synchronized void inGuest() {
		System.out.println("손님이 들어왔다.");
		guestNum++;
		System.out.println("현재 손님은" + guestNum + "명입니다.");
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
		System.out.println("손님이 나갔다.");
		guestNum--;
		System.out.println("현재 손님은" + guestNum + "명입니다.");
	}
	
	public static void main(String[] args) {
		InOutProcess ip = new InOutProcess();
		InGuestThread ig = new InGuestThread(ip);
		OutGuestThread og = new OutGuestThread(ip);
		
		ig.start();
		og.start();
	}

}
