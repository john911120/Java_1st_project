package Class_Type_Ex;

/*
 * personŬ������ �ڽ� Ŭ������ student Ŭ���� �����ϱ�
 * �ۼ��� : 1124
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
		System.out.println("�л��� ���� ��Ÿ���� ��Ģ���Դϴ�.");
	}
	
	public void study() {
		System.out.println("�о��� �����մϴ�.");
	}
	
}
