package kh.oop;
class Member2{
	public int num;
	public Member2() {
		System.out.println("Member2 ��ü ����");
	}
}
public class Run {

	public static void main(String[] args) {
		System.out.println("!!���� Ŭ���� ����!!");
		Person ps1 = new Person();
		ps1.name = "ȫ����";
		ps1.age = 29;
		ps1.phone = "010-4151-2845";
		boolean result = ps1.setAge(150);
		if(result) {
			System.out.println("�Է� ����");
		}
		else {
			System.out.println("�Է� ����");
		}
		Person ps2 = new Person();
		ps2.name = "ȫ����";
		ps2.age = 24;
		ps2.phone = "010-1324-1234";
//		// Member mb; ��� �����ϸ� ������ ����
//		Member mb = new Member();  // Member Ŭ������ �̿��� ��ü ����
//		Member2 mb2 = new Member2(); // Member2 Ŭ������ �̿��� ��ü ����
//		mb.name = "ȫ�浿"; // mb ��ü�� name ��������� ���� �� �Է�
//		mb.setAge(20); // mb ��ü�� setAge() ����޼ҵ带 �̿��Ͽ� �� �Է�
//	    System.out.println("�̸��� : " + mb.name);
//	    System.out.println("���̴� : " + mb.getAge());
//	    
//	    Member mbmb = new Member();  // Member Ŭ������ �̿��� ��ü ����
//	    mbmb.age = 30;
//	    mbmb.name = "������";
//	    System.out.println(mbmb.name);
//	    System.out.println(mbmb.age);
 		
	}

}
