package Chap5_Ex;

public class SearchService {
	/*
	 * ȸ�� ������ �����ϴ� Ŭ����
	 * �ۼ���  : 1119
	 * ȸ�� �̸����� �迭 ��ü���� ȸ���� �˻��ϴ� �Ǳ��
	 */
	
	/*
	 * memberŸ���� ��ü�� ������ ��ü�� member�� ����
	 * ȸ�� ���� ��ü 5���� �����.
	 * ȸ���̸��� �Ķ���Ͱ����� �޾Ƽ� ȸ�� ������ ������ִ� ����� �����.
	 * �̸��� ������ �ִ� ȸ�������� ã�����°��� �����ϴ� ������ �����ϰ� �⺻���� false�� ����
	 * �迭 ��ü�� ����Ǿ��ִ� ��ü ����ŭ for���� �����ϴ� ������ �����Ͽ���
	 * ȸ�������� ��ġ�Ѱ�? ã�����ٸ� printinfo(members[i])�� ȣ�⿡�� �ε����� ������ ����Ѵ�.
	 * if�� �����Ѵٸ� ȸ�� ������ ã�� ���̱� ������ searchResult ���� ���� true�� ����
	 * ���������� ã�Ҵ°� �� ã�Ҵ°��� booleanŸ���� ���� searchResult������ �������ְ� getter�޼����� ȣ���ؼ�
	 * ������ִ� �κ��̴�.
	 */
	Member[] members = new Member[5];
	public SearchService() {
		members[0] = new Member("�ø���", 164, 70,"�ѱ�");
		members[1] = new Member("johns", 162, 67,"����");
		members[2] = new Member("����", 174, 72,"�߱�");
		members[3] = new Member("���ݶ�", 175, 75,"�̱�");
		members[4] = new Member("����", 154, 59,"�Ϻ�");
	}
	boolean searchMember(String name) {
		boolean searchResult = false;
		for(int i = 0; i < members.length;i++) {
			if(members[i].getName().equals(name)) {
				printinfo(members[i]);
				searchResult = true;
			}
		}
		return searchResult;
	}
	private void printinfo(Member member) {
		System.out.println(member.getName() + "���� ã�� ���");
		System.out.println("�̸� : " + member.getName());
		System.out.println("���� : " + member.getHeight());
		System.out.println("������ : " + member.getWeight());
		System.out.println("���� : " + member.getNation());
	}
}
