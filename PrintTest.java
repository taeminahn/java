package kh.project1.test1;


public class PrintTest {

	public static void main(String[] args) {
		int num1 = 10;
		double num2 = 3.5;
		
		// print()
		System.out.print(10);
		System.out.print(3.5);
		System.out.print("�ȳ��ϼ���\n");
		
		// println()
		System.out.println(10);
		System.out.println(3.5);
		System.out.println("�ȳ��ϼ���");
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(10+20);
		System.out.println("�ȳ��ϼ���" + "��������!!");
		
		// printf("����� ����" [, ���ڰ�...])
		System.out.printf("�ȳ��ϼ���\t����Ʈ����\n");
		System.out.printf("\\\\����	�ð���.....\n");
		System.out.printf("\\, \', \"\n");
		System.out.printf("%f\n", num2);
		String name = "���¹�";
		int age = 27;
		System.out.printf("�� �̸��� %s�̰� ���̴� %d�� �Դϴ�.\n", name, age);
		System.out.printf("�� �̸��� "+name+ "�̰� ���̴� " +age+ "�� �Դϴ�.\n");
		System.out.printf("%d / %o / %x / %c \n", 65,65,65,65);
		
		String name2 = "ȫ�浿";
		int age2 = 20;
		String tel = "010-1234-1234";
		System.out.printf("�̸�\t: %s\n", name2);
		System.out.printf("����\t: %s\n", age2);
		System.out.printf("��ȭ��ȣ\t: %s\n", tel);
		System.out.println("�ݾ��� \\35,000�� �Դϴ� ");
		System.out.println("�̰��� ū����ǥ \" �Դϴ� ");
	}
}
