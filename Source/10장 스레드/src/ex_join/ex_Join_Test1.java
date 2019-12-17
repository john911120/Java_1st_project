package ex_join;

import java.util.ArrayList;

class BeforeThread extends Thread{
	public BeforeThread(String name) {
		super(name);
	}

	private void addCar() 
	{
		System.out.println("addCar");
		ex_Join_Test1.carList.add("K5");
		ex_Join_Test1.carList.add("소나타");
		ex_Join_Test1.carList.add("스포티지");
	}
		
	@Override
	public void run() {
		System.out.println(currentThread().getName() + "실행");
		try{sleep(1000);} 
		
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		addCar();
	}
}
	class AfterThread extends Thread {
		public AfterThread(String name) {
			super(name);
		}

		@Override
		public void run() {
			System.out.println(currentThread().getName() + "실행");
			ArrayList<String> carList = ex_Join_Test1.carList ;
			for(int i = 0; i<carList.size();i++) {
				System.out.println(carList.get(i));
			}
		}
	}

public class ex_Join_Test1 {

	/*
		Join 메소드 예제
		- 스레드를 여러 개 동시에 실행 할 때 어떤 스레드가 실행이 될것인가에 대한 정확한 제어가 안된다. 특정한 스레드가 전부 실행된 후 다른 스레드가 실행되게하려면
		   일정한 처리를 해줘야한다. 이럴 때 사용하는 메소드가 join이다. 호출한 스레드 작업이 모두 끝날 때 까지 다른 스레드가 대기하게 하는 기능을 제공한다.
		작성일 : 1206
	*/
	
	public static ArrayList<String> carList = new ArrayList<String>();

	public static void main(String[] args) {
		BeforeThread beforeThread = new BeforeThread("BeforeThread");
		AfterThread afterThread = new AfterThread("afterThread");
		beforeThread.start();
		afterThread.start();
	}

}
