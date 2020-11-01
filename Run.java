package kh.oop;
class Member2{
	public int num;
	public Member2() {
		System.out.println("Member2 객체 생성");
	}
}
public class Run {

	public static void main(String[] args) {
		System.out.println("!!실행 클래스 시작!!");
		Person ps1 = new Person();
		ps1.name = "홍수명";
		ps1.age = 29;
		ps1.phone = "010-4151-2845";
		boolean result = ps1.setAge(150);
		if(result) {
			System.out.println("입력 성공");
		}
		else {
			System.out.println("입력 실패");
		}
		Person ps2 = new Person();
		ps2.name = "홍정은";
		ps2.age = 24;
		ps2.phone = "010-1324-1234";
//		// Member mb; 라고 선언하면 참조형 변수
//		Member mb = new Member();  // Member 클래스를 이용해 객체 생성
//		Member2 mb2 = new Member2(); // Member2 클래스를 이용해 객체 생성
//		mb.name = "홍길동"; // mb 객체의 name 멤버변수에 직접 값 입력
//		mb.setAge(20); // mb 객체의 setAge() 멤버메소드를 이용하여 값 입력
//	    System.out.println("이름은 : " + mb.name);
//	    System.out.println("나이는 : " + mb.getAge());
//	    
//	    Member mbmb = new Member();  // Member 클래스를 이용해 객체 생성
//	    mbmb.age = 30;
//	    mbmb.name = "이은지";
//	    System.out.println(mbmb.name);
//	    System.out.println(mbmb.age);
 		
	}

}
