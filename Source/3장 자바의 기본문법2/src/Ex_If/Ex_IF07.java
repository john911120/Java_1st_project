package Ex_If;

public class Ex_IF07 {
	/*
	 * 성적을 입력 받아서 합격 불합격을 결정해주는 프로그램
	 * 3장 자바의 기초문법2 공부한 프로젝트가 날라가서 재 작성하고 저장 하는 단계입니다.
	 * 중첩 if문 
	 */
	public static void main(String[] args) {
		int kor = Integer.parseInt(args[0]);
		int mat = Integer.parseInt(args[1]);
		int eng = Integer.parseInt(args[2]);
		int total = 0;
		
		// 총점 계산
		total = kor + mat + eng;
		
		// 외부 if문장
		if(total >= 180) {
			// 내부 if문장
			if(kor < 40 || mat < 40 || eng < 40) {
				System.out.println("과락점수로 인해 불합격 입니다.");
			} else {
				System.out.println("합격입니다. 축하합니다.");
			} 
		} else {
			System.out.println("총점 부족으로 인해 불합격입니다.");
		}
	}
}
