package 산술연산자;

public class Args_Test {
	
	/*
	 * 점수를 인자로 받아서 총점과 평균을 구하는 예제
	 */
	public static void main(String[] args) {
		int total = 0;
		int avg = 0;
		
		int kor = Integer.parseInt(args[0]);
		int math = Integer.parseInt(args[0]);
		int eng = Integer.parseInt(args[0]);
		int jap = Integer.parseInt(args[0]);
		
		total = kor + math + eng + jap;
		avg = total / 4;
		
		System.out.println("total = " + total);
		System.out.println("avg = " + avg);
	}

}
