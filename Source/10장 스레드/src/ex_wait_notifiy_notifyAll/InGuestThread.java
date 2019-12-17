package ex_wait_notifiy_notifyAll;

/*
  	손님이 들어오는 기능을 수행하는 스레드 클래스
  	작성일 : 1207
 */

public class InGuestThread extends Thread {
	InOutProcess ip;
	
	public InGuestThread(InOutProcess ip) {
		this.ip = ip;
	}

	@Override
	public void run() {
		for(int i = 1; i < 10; i++) {
			ip.inGuest();
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
