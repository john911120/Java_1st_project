package Method_Ex;

/*
 * this생성자 예제
 * 작성일  : 1118
 * 자기 자신 객체를 참조하는 레퍼런스 변수이다.
 */
class House{
		int price;
		String dong;
		int size;
		String kind;
		
		public House() {
			//System.out.println("this보다 앞에서 실행");
			this(100,32,"갈현동","아파트");
		}
		public House(int price) {
			this(price,32,"불광동","아파트");
		}
		public House(int price, int size) {
			this(price,size,"녹번동","아파트");
		}
		public House(int price, int size, String dong) {
			this(price,size,dong,"아파트");
		}
		public House(int price, int size, String dong, String kind) {
			this.price = price;
			this.size = size;
			this.dong = dong;
			this.kind = kind;
		}
	}
public class ThisTest {
		
	/*
	 * 생성자 테스트
	 */
	public static void main(String[] args) {
		House house1 = new House();
		System.out.println("house1.price =" + house1.price + ", house1.size = " + house1.size + ", house1.dong = " + house1.dong +
				", house1.kind = " + house1.kind);
		
		House house2 = new House(300);
		System.out.println("house2.price =" + house2.price + ", house2.size = " + house2.size + ", house2.dong = " + house2.dong +
				",house2.kind = " + house2.kind);
		
		House house3 = new House(300, 40);
		System.out.println("house3.price =" + house3.price + ", house3.size = " + house3.size + ",house3.dong = " + house3.dong +
				",house3.kind = " + house3.kind);
		
		House house4 = new House(300, 40,"연희동");
		System.out.println("house4.price =" + house4.price + ", house4.size = " + house4.size + ",house4.dong = " + house4.dong +
				",house4.kind = " + house4.kind);
		
		House house5 = new House(300, 40,"대현동","빌라");
		System.out.println("house5.price =" + house5.price + ", house5.size = " + house5.size + ",house5.dong = " + house5.dong +
				",house5.kind = " + house5.kind);
	}

}
