package kh.project1.test1;
// Scanner Class ����
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// Scanner ����
		Scanner scan = new Scanner(System.in);
		// ���� �Է¹ޱ�
//		System.out.print("������ �Է��ϼ���: ");
//		int num1;
//		num1 = scan.nextInt();
//		System.out.println("�Է°� :" + num1);
//		
//		// �Ǽ� �Է¹ޱ�
//		System.out.print("�Ǽ��� �Է��ϼ���: ");
//		float num2;
//		num2 = scan.nextFloat();
//		System.out.println("�Է°� :" + num2);
//		
//		System.out.print("�Ǽ�(double)�� �Է��ϼ���: ");
//		double num3;
//		num3 = scan.nextDouble();
//		System.out.println("�Է°� :" + num3);
//	
//		// ���ڿ� �Է�
//		System.out.print("���ڿ��� �Է��ϼ���: ");
//		String str1;
//		str1 = scan.next();
//		System.out.println("�Է°� :" + str1);
//		
//		System.out.print("���ڿ��� �Է��ϼ���: ");
//		String str2;
//		//scan.skip("[\\r\\n]+"); //�̰� �־ ��(���Ͱ� �����ִ� ���)
//								  // \r ���� ���� ������ Ŀ�� �̵�
//		                          // \n ���� ���� �ٷ� Ŀ�� �̵�
//								  // "[]+" �� skip�� ����
//		scan.nextLine();     // ���Ͱ��� �����ִ� �� �ٽ� �ʱ�ȭ����
//		str2 = scan.nextLine(); //nextLine�� ���͵� �ν��ؼ� ���ۿ� ���� ����
//		System.out.println("�Է°� :" + str2); //�ٸ� next���� ���Ͱ��� ���ۿ� ����
		

		System.out.print("�̸� : ");
		String name = scan.next();
		
		System.out.print("���� : ");
		int age = scan.nextInt();
		
		System.out.print("��ȭ��ȣ : ");
		scan.skip("[\\r\\n]+");
		String tel = scan.nextLine();
		
		System.out.printf("�� �̸��� %s�̰�, ���̴� %d���̰�, ��ȭ��ȣ�� %s �Դϴ�.\n", name, age, tel);
		
	}

}
