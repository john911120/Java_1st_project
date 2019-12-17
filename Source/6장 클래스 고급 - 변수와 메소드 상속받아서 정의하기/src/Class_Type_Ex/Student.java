package Class_Type_Ex;

/*
 * person클래스의 자식 클래스인 student 클래스 정의하기
 * 작성일 : 1124
 */

public class Student extends Person {
	private String schoolKind;
	private String grade;
	private String getschoolKind() {
		return schoolKind;
	}
	
	public String getSchoolKind() {
		return schoolKind;
	}
	public void setSchoolKind(String schoolKind) {
		this.schoolKind = schoolKind;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public void showSleepstyle() {
		System.out.println("학생의 수면 스타일은 규칙적입니다.");
	}
	
	public void study() {
		System.out.println("학업에 매진합니다.");
	}
	
}
