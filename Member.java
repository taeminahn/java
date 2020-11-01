package kh.oop;

public class Member {
	public String name; // 멤버 변수(속성 = Field)
	public int age;     // 멤버 변수(속성 = Field)
	
	public Member() {
		System.out.println("Member 객체 생성됨");
	}  // 생성자
	
	public String getName() {  // 멤버 메소드(기능 = Method)
		return name;
	}
	
	public void setName(String name) {  // 멤버 메소드(기능 = Method)
		this.name = name;
	}
	
	public int getAge() {  // 멤버 메소드(기능 = Method)
		return age;
	}
	
	public void setAge(int age) {  // 멤버 메소드(기능 = Method)
		this.age = age;
		// 메서드 안에 변수의 값을 class 안에 선언된 변수에 값을 넣겠다!
	}
}
