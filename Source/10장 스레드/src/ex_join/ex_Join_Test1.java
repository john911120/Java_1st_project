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
		ex_Join_Test1.carList.add("�ҳ�Ÿ");
		ex_Join_Test1.carList.add("����Ƽ��");
	}
		
	@Override
	public void run() {
		System.out.println(currentThread().getName() + "����");
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
			System.out.println(currentThread().getName() + "����");
			ArrayList<String> carList = ex_Join_Test1.carList ;
			for(int i = 0; i<carList.size();i++) {
				System.out.println(carList.get(i));
			}
		}
	}

public class ex_Join_Test1 {

	/*
		Join �޼ҵ� ����
		- �����带 ���� �� ���ÿ� ���� �� �� � �����尡 ������ �ɰ��ΰ��� ���� ��Ȯ�� ��� �ȵȴ�. Ư���� �����尡 ���� ����� �� �ٸ� �����尡 ����ǰ��Ϸ���
		   ������ ó���� ������Ѵ�. �̷� �� ����ϴ� �޼ҵ尡 join�̴�. ȣ���� ������ �۾��� ��� ���� �� ���� �ٸ� �����尡 ����ϰ� �ϴ� ����� �����Ѵ�.
		�ۼ��� : 1206
	*/
	
	public static ArrayList<String> carList = new ArrayList<String>();

	public static void main(String[] args) {
		BeforeThread beforeThread = new BeforeThread("BeforeThread");
		AfterThread afterThread = new AfterThread("afterThread");
		beforeThread.start();
		afterThread.start();
	}

}
