package team;

interface Member {
	public void MemberList(); // ȸ����Ϻ���

	public void MemberAdd(); // ȸ�� �߰�

}
class Manager implements Member{
	public void MemberAdd() {
		System.out.println("ȸ������� �ϰڽ��ϴ�.");
	}
	public void MemberList() {
		System.out.println("�����ڱ������� ȸ�� ����� ���ϴ�.");
	}
}
class General implements Member{
	public void MemberAdd() {
		System.out.println("�����ڿ��� ���� �ϼ���.");
	}
	public void MemberList() {
		System.out.println("ȸ������� ���ϴ�.");
	}
}
