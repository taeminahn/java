package kh.project1.test1;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// �ǽ����� 1
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = scan.next();
		System.out.print("������ �Է��ϼ���(��/��) : ");
		char s = scan.next().charAt(0);
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = scan.nextInt();
		System.out.print("Ű�� �Է��ϼ���(cm) : ");
		float height = scan.nextFloat();
		System.out.printf("Ű %.1fcm�� %d�� %s�� %s�� �ݰ����ϴ�^^\n", height, age, s, name);
		
		// �ǽ�����2
		System.out.print("ù ��° ���� : ");
		int num1 = scan.nextInt();
		System.out.print("�� ��° ���� : ");
		int num2 = scan.nextInt();
		System.out.printf("���ϱ� ��� : %d\n",(num1+num2));
		System.out.printf("���� ��� : %d\n",(num1-num2));
		System.out.printf("���ϱ� ��� : %d\n",(num1*num2));
		System.out.printf("������ ��� : %d\n",(num1/num2));
		
		// �ǽ�����3
		System.out.print("���� : ");
		float x = scan.nextFloat();
		System.out.print("���� : ");
		float y = scan.nextFloat();
//		System.out.println("���� : "+(x*y));
//		System.out.println("�ѷ� : "+((x+y)*2));
		System.out.printf("���� : %.2f\n",(x*y));
		System.out.printf("�ѷ� : %.1f\n",((x+y)*2));
		
		// �ǽ�����4
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		scan.skip("[\\r\\n]+");
		String a = scan.nextLine();
		System.out.printf("ù ��° ���� : %s\n", a.charAt(0));
		System.out.printf("�� ��° ���� : %s\n", a.charAt(1));
		System.out.printf("�� ��° ���� : %s\n", a.charAt(2));
	}

}
