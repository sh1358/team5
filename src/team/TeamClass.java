package team;

interface Member {
	public void MemberList(); // 회원목록보기

	public void MemberAdd(); // 회원 추가

}
class Manager implements Member{
	public void MemberAdd() {
		System.out.println("회원등록을 하겠습니다.");
	}
	public void MemberList() {
		System.out.println("관리자권한으로 회원 목록을 봅니다.");
	}
}
class General implements Member{
	public void MemberAdd() {
		System.out.println("관리자에게 문의 하세요.");
	}
	public void MemberList() {
		System.out.println("회원목록을 봅니다.");
	}
}
