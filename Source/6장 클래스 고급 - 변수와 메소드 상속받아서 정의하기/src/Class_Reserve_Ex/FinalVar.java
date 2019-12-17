package Class_Reserve_Ex;
	
	class VarClass {
		final int x;
		static final int y = 100;
		public VarClass(int x) {
			this.x = x;
		}
	}
	
public class FinalVar {
	/*
	 * final변수 사용 테스트
	 * 작성일 : 1122
	 */
	public static void main(String[] args) {
		//VarClass.y = 30;
		VarClass vc1 = new VarClass(10);
		//vc1.y = 50;
		//vc1.x = 40;
		VarClass vc2 = new VarClass(20);
		//vc1.y = 70;
		//vc1.x = 80;
	}

}
