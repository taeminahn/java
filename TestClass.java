package kh.project1.test1;

public class TestClass {
		
	public static void main(String[] args) {
		System.out.println(10); 		// ����
		System.out.println(3.5); 		// �Ǽ�
		System.out.println('A'); 		// ���Ϲ���
		System.out.println("Hello");	// ���ڿ�
		System.out.println(10+30);		// ��������
		System.out.println(5.5+3.5);	// �Ǽ�����
		System.out.println(10+3.5);     // ���� + �Ǽ� ����
		System.out.println('A'+'B');	/* ���Ϲ��ڿ��� = ������
											���� �ٲ�� �ƽ�Ű�ڵ��
											ǥ����*/
		System.out.println(10+'A');		/* ����+���Ϲ��� ����
											= ���� ����*/
		System.out.println("Hello"+"Bye");// ���ڿ� ���� = ���ڿ��� ǥ��
		System.out.println("Hello"+'A'); // ���ڿ�+���Ϲ��� = ���ڿ� ǥ��
		System.out.println("Hello"+20);  // ���ڿ�+���� = ���ڿ� ǥ��
		System.out.println("Hello"+3.5); // ���ڿ�+�Ǽ� = ���ڿ� ǥ��
										//���ڿ��� �����ϸ� ������ ���ڿ��� ǥ��
		System.out.println(0b101);      //2���� �� 10���� / 2���� �տ� 0b����
		System.out.println(256);		//10����
		System.out.println(0256);		//10���� �� 8���� / 10���� �տ� 0����
		System.out.println(0x256);		//10���� �� 16���� / 10���� �տ� 0x����
		
	}
}
