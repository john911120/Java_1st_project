package Method_Ex;

public class Boiler{
	String maker;
	int temp;
	String color;
	
	void tempUP() {
		temp++;
	}
	void tempUp(int amount) {
		temp = temp + amount;
	}
}