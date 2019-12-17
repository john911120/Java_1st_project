package ex_Thread;

class MyThread2 implements Runnable{
	
	public void run() {
		for(int i = 1; i <= 20; i++) {
			try 
			{
				System.out.print(Thread.currentThread().getName());
				Thread.sleep(10);
				for (int j = 1; j <= i; j++) {
					System.out.print("$");
				}
				System.out.println();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ex_Thread_Test2 {

	/*
		Runnable �������̽��� �����ؼ� ������ �����ϱ�
		- run()�޼ҵ� �ϳ��� ���ǵǾ��ִ�. Runnable �������̽��� �����ؼ� �����带 �����Ϸ��� run()�޼��常 �������ָ� �ȴ�.
		   �����带 �������� ���� �ش� Ŭ���� ��ü�� ������ Ŭ������ �ƴϴ�. ���� �����尡 ���� �Ǿ��� ��, ó���ؾ��ϴ� ��ɸ� run()���� ������ �� ���̴�.
		   ������ ��ü�� ������� ThreadŬ�������� �����Ǵ� ������ �����ڸ� ����ؾ��Ѵ�.
		�ۼ��� : 1206
	*/
	
	public static void main(String[] args) {
		MyThread2 myThread2 = new MyThread2();
		Thread thread = new Thread(myThread2,"myThread2");
		thread.start();
	}

}
