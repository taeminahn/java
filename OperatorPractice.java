package kh.project1.test1;

import java.util.Scanner;

public class OperatorPractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// �ǽ�����1
		System.out.print("���� : ");
		int num1 = scan.nextInt();
		System.out.println(num1>0 ? "�����":"����� �ƴϴ�");
		
	// �ǽ�����2
		System.out.print("���� : ");
		int num2 = scan.nextInt();
		System.out.println(num2==0 ? "0�̴�":"������");
		
	// �ǽ�����3
		System.out.print("���� : ");
		int num3 = scan.nextInt();
		System.out.println(num3%2==0 ? "¦����":"Ȧ����");
	
	// �ǽ�����4
		System.out.print("�ο� �� : ");
		int person = scan.nextInt();
		System.out.print("���� ���� : ");
		int candy = scan.nextInt();
		System.out.println("1�δ� ���� ���� : "+candy/person);
		System.out.println("���� ���� ���� : "+candy%person);
	
	// �ǽ�����5
	
		System.out.print("�̸� : ");
		String name = scan.nextLine();
		System.out.print("�г�(���ڸ�) : ");
		int grade = scan.nextInt();
		System.out.print("��(���ڸ�) : ");
		int group = scan.nextInt();
		System.out.print("��ȣ(���ڸ�) : ");
		int number = scan.nextInt();
		System.out.print("����(M/F) : ");
		char gender = scan.next().charAt(0);
		gender = gender == 'M' ? '��' : '��';
		System.out.print("����(�Ҽ��� �Ʒ� ��°�ڸ�����) : ");
		float score = scan.nextFloat();
		System.out.printf("%d�г� %d�� %d�� %s %s�л��� ������ %.2f�̴�.\n",grade ,group, number, name, gender, score);
	
	// �ǽ�����6
	
		System.out.print("���� : ");
		int age = scan.nextInt();
		System.out.println(age>19 ? "����" : (age<=13 ? "���" : "û�ҳ�"));
	
	// �ǽ�����7
	
		System.out.print("���� : ");
		int a = scan.nextInt();
		System.out.print("���� : ");
		int b = scan.nextInt();
		System.out.print("���� : ");
		int c = scan.nextInt();
		int sum = a+b+c;
		System.out.printf("�հ� : %d\n", sum);
		System.out.printf("��� : %.1f\n", (float)sum/3);
		System.out.println((a >= 40 && b >= 40 && c >= 40) && ((sum/3) >= 60) ? "�հ�" : "���հ�");
	
	// �ǽ�����8
	
		System.out.print("�ֹι�ȣ�� �Է��ϼ���(- ����) : ");
		scan.skip("[\\r\\n]+");
		String rn = scan.nextLine();
		System.out.println(rn.charAt(7) == '1' ? "����" : "����");
	
	// �ǽ�����9
	
		System.out.print("����1 : ");
		int n1 = scan.nextInt();
		System.out.print("����2 : ");
		int n2 = scan.nextInt();
		System.out.print("�Է� : ");
		int n3 = scan.nextInt();
		System.out.println(n3>=n1 && n3>n2 ? "true" : "false");
	
	// �ǽ�����10
	
		System.out.print("�Է�1 : ");
		int number1 = scan.nextInt();
		System.out.print("�Է�2 : ");
		int number2 = scan.nextInt();
		System.out.print("�Է�3 : ");
		int number3 = scan.nextInt();
		System.out.println(number1 == number2 && number2 == number3 ? "true" : "false");
	
	// �ǽ�����11
	
		System.out.print("A����� ���� : ");
		int money1 = scan.nextInt();
		System.out.print("B����� ���� : ");
		int money2 = scan.nextInt();
		System.out.print("C����� ���� : ");
		int money3 = scan.nextInt();
		double incen1 = money1 + (money1*0.4);
		double incen2 = money2 + (money2*0.0);
		double incen3 = money3 + (money3*0.15);			
		System.out.println("A��� ����/����+a : "+ money1 + "/" + incen1);
		System.out.println(incen1 >= 3000 ? "3000 �̻�" : "3000 �̸�");
		System.out.println("B��� ����/����+a : "+ money2 + "/" + incen2);
		System.out.println(incen2 >= 3000 ? "3000 �̻�" : "3000 �̸�");
		System.out.println("C��� ����/����+a : "+ money3 + "/" + incen3);
		System.out.println(incen3 >= 3000 ? "3000 �̻�" : "3000 �̸�");
	}

}
