package kh.project1.test1;

import java.util.Scanner;

public class ContorolPractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		// �ǽ�����1
//		System.out.println("1. �Է�");
//		System.out.println("2. ����");
//		System.out.println("3. ��ȸ");
//		System.out.println("4. ����");
//		System.out.println("7. ����");
//		System.out.print("�޴� ��ȣ�� �Է��ϼ��� ");
//		int num1 = scan.nextInt();
//		switch(num1) {
//		case 1 : System.out.println("�Է� �޴��Դϴ�.");
//			break;
//		case 2 : System.out.println("���� �޴��Դϴ�.");
//			break;
//		case 3 : System.out.println("���� �޴��Դϴ�.");
//			break;
//		case 4 : System.out.println("���� �޴��Դϴ�.");
//			break;
//		case 7 : System.out.println("���α׷��� ����˴ϴ�.");
//			break;
//		default : System.out.println("�ٽ� �������ּ���.");
//		}
//		
//		// �ǽ�����2
//		System.out.print("���ڸ� �� �� �Է��ϼ���  : ");
//		int num2 = scan.nextInt();
//		if(num2 < 0) {
//			System.out.println("����� �Է����ּ���.");
//		}
//		else if(num2 % 2 == 0) {
//			System.out.println("¦����.");
//		}
//		else {
//			System.out.println("Ȧ����");
//		}
//		
//		// �ǽ�����3
//		System.out.print("�������� : ");
//		int a = scan.nextInt();
//		System.out.print("�������� : ");
//		int b = scan.nextInt();
//		System.out.print("�������� : ");
//		int c = scan.nextInt();
//		int sum = a+b+c;
//		float avr = (a+b+c)/3;
//		if(a >= 40 && b >= 40 && c >= 40 && avr >= 60) {
//			System.out.println("���� : "+a);
//			System.out.println("���� : "+b);
//			System.out.println("���� : "+c);
//			System.out.println("�հ� : "+sum);
//			System.out.println("��� : "+avr);
//			System.out.println("�����մϴ�, �հ��Դϴ�!");
//		}
//		else {
//			System.out.println("���հ��Դϴ�.");
//		}
//		
//		// �ǽ�����4
//		System.out.print("1~12 ������ ���� �Է� : ");
//		int month = scan.nextInt();
//		switch(month) {
//		case 1:
//		case 2:
//		case 12: System.out.println(month+"���� �ܿ��Դϴ�.");
//			break;
//		case 3:
//		case 4:
//		case 5: System.out.println(month+"���� ���Դϴ�.");
//			break;
//		case 6:
//		case 7:
//		case 8: System.out.println(month+"���� �����Դϴ�.");
//			break;
//		case 9:
//		case 10:
//		case 11: System.out.println(month+"���� �����Դϴ�.");
//			break;
//		default : System.out.println(month+"���� �߸� �Էµ� ���Դϴ�.");
//		}
//		
//		// �ǽ�����5
//		String myId = "abc";
//		String myPw = "1234";
//		System.out.print("���̵� : ");
//		String id = scan.next();
//		System.out.print("��й�ȣ : ");
//		String pw = scan.next();
//		if(myId.equals(id) && myPw.equals(pw)) {
//			System.out.println("�α��� ����.");
//		}
//		else if(myId.equals(id)) {
//			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
//		}
//		else {
//			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
//		}
//		
//		
//		// �ǽ�����6
//		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ���  : ");
//		String grade = scan.next();
//		switch(grade) {
//		case "������" : System.out.println("ȸ������, �Խñ� ����, �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�");
//			break;
//		case "ȸ��" : System.out.println("�Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�");
//			break;
//		case "��ȸ��" : System.out.println("�Խñ� ��ȸ");
//			break;
//		default : System.out.println("�ٽ� �Է����ּ���.");
//		}
//		
//		// �ǽ�����7
//		System.out.print("Ű(m)�� �Է��� �ּ��� : ");
//		double height = scan.nextDouble();
//		System.out.print("������(kg)�� �Է��� �ּ��� : ");
//		double weight = scan.nextDouble();
//		double bmi = weight / (height * height);
//		System.out.println("BMI ���� : "+bmi);
//		if(bmi >= 30) {
//			System.out.println("�� ��");
//		}
//		else if(bmi >= 25) {
//			System.out.println("��");
//		}
//		else if(bmi >= 23) {
//			System.out.println("��ü��");
//		}
//		else if(bmi >= 18.5) {
//			System.out.println("����ü��");
//		}
//		else {
//			System.out.println("��ü��");
//		}
//		
//		// �ǽ�����8
//		System.out.print("�ǿ�����1 �Է� : ");
//		int n1 = scan.nextInt();
//		System.out.print("�ǿ�����2 �Է� : ");
//		int n2 = scan.nextInt();
//		System.out.print("�����ڸ� �Է� : ");
//		String op = scan.next();
//		float calc = 0;
//		switch(op) {
//		case "+" : calc = (n1+n2);
//			break;
//		case "-" : calc = (n1-n2);
//			break;
//		case "*" : calc = (n1*n2);
//			break;
//		case "/" : calc = ((float)n1/n2);
//			break;
//		case "%" : calc = (n1%n2);
//		}
//		System.out.printf("%d %s %d = %f\r", n1, op, n2, calc);
		
		// �ǽ�����9
		System.out.print("�߰� ��� ���� : ");
		int score1 = scan.nextInt();
		System.out.print("�⸻ ��� ���� : ");
		int score2 = scan.nextInt();
		System.out.print("���� ���� : ");
		int score3 = scan.nextInt();
		System.out.print("�⼮ ȸ�� : ");
		int att = scan.nextInt();
		double avr1 = score1*0.2;
		double avr2 = score2*0.3;
		double avr3 = score3*0.3;
		double avrAtt = att*1.0;
		double totalAtt = (avrAtt/20)*100;
		double total = avr1+avr2+avr3+avrAtt;
		System.out.println("=============���=============");
		if(totalAtt < 70) {
			System.out.println("Fail [�⼮ ȸ�� ���� ("+att+"/20)]");
		}
		else {
			System.out.println("�߰� ��� ����(20) : "+avr1);
			System.out.println("�⸻ ��� ����(30) : "+avr2);
			System.out.println("���� ����		(30) : "+avr3);
			System.out.println("�⼮ ����		(20) : "+avrAtt);
			System.out.println("���� : "+total);
			System.out.println(totalAtt);
			if(total < 70) {
				System.out.println("Fail [���� �̴�]");
			}
			else {
				System.out.println("Pass");
			}
		}
	}

}
