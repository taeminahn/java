package kh.oop;

public class Member {
	public String name; // ��� ����(�Ӽ� = Field)
	public int age;     // ��� ����(�Ӽ� = Field)
	
	public Member() {
		System.out.println("Member ��ü ������");
	}  // ������
	
	public String getName() {  // ��� �޼ҵ�(��� = Method)
		return name;
	}
	
	public void setName(String name) {  // ��� �޼ҵ�(��� = Method)
		this.name = name;
	}
	
	public int getAge() {  // ��� �޼ҵ�(��� = Method)
		return age;
	}
	
	public void setAge(int age) {  // ��� �޼ҵ�(��� = Method)
		this.age = age;
		// �޼��� �ȿ� ������ ���� class �ȿ� ����� ������ ���� �ְڴ�!
	}
}
