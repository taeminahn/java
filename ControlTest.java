package kh.project1.test1;

import java.util.Scanner;

public class ControlTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
		// if-else�� 1
//		if(num > 0) {
//			System.out.println("����Դϴ�.");
//			System.out.println("������ ���Դϴ�.");
//		}
//		else {
//			System.out.println("����� �ƴմϴ�.");
//		}
		
		// if-else�� 2
//		if(num % 2 == 0) {
//			System.out.println("¦��");
//		}
//		else {
//			System.out.println("Ȧ��");
//		}
		
		// if-else if-else��1
//		if(num > 0) {
//			System.out.println("0���� ū ��");
//		} 
//		else if(num < 0) {
//			System.out.println("0���� ���� ��");
//		}
//		else {
//			System.out.println("0�� ���� ��");
//		}
		
		// if-else if-else��2
//		if (num == 0) {
//			System.out.println("0�Դϴ�.");
//		}
//		else if(num % 2 ==1) {
//			System.out.println("Ȧ���Դϴ�.");
//		}
//		else {
//			System.out.println("¦���Դϴ�.");
//		}
		
		// if-else if-else��3
//		if (num % 2 == 0 && num != 0) {
//			System.out.println("¦���Դϴ�.");
//		}
//		else if(num % 2 ==1) {
//			System.out.println("Ȧ���Դϴ�.");
//		}
//		else {
//			System.out.println("0�Դϴ�.");
//		}
		
		//if-else�� 3 (if�ȿ� �� if�� ���� ���)
//		if (num % 2 == 0) {
//			if(num == 0) {
//				System.out.println("0�Դϴ�.");
//			}
//			else {
//				System.out.println("¦���Դϴ�.");
//			}
//		}
//		else {
//			System.out.println("Ȧ���Դϴ�.");
//		}
		
		// if-else if-else��4
//		System.out.print("�� �Է� : ");
//		int month = scan.nextInt();
//		String season;
//		if(month == 1 || month == 2 || month == 12) {
//			season = "�ܿ�";
//		}
//		else if(month >= 3 && month <= 5) {
//			season = "��";
//		}
//		else if(month >= 6 && month <= 8) {
//			season = "����";
//		}
//		else if(month >= 9 && month <= 11) {
//			season = "����";
//		}
//		else {
//			season = "�ش��ϴ� ������ �����ϴ�.";
//		}
//		System.out.println(season);
//		System.out.println("���α׷� ����");
		
		// if-else if-else��5 (�� �������� month ������ season ���� ����)
//		System.out.print("�µ� �Է�: ");
//		int temperature = scan.nextInt();
//		if(month == 1 || month == 2 || month == 12) {
//			season = "�ܿ�";
//			if(temperature <= -15) {
//				season += "(���� �溸)";
//			}
//			else if(temperature <= -12) {
//				season += "(���� ���Ǻ�)";
//			}
//		}
//		else if(month >= 3 && month <= 5) {
//			season = "��";
//		}
//		else if(month >= 6 && month <= 8) {
//			season = "����";
//			if(temperature >= 35) {
//				season += "(���� �溸)";
//			}
//			else if(temperature >= 33) {
//				season += "(���� ���Ǻ�)";
//			}
//		}
//		else if(month >= 9 && month <= 11) {
//			season = "����";
//		}
//		else {
//			season = "�ش��ϴ� ������ �����ϴ�.";
//		}
//		System.out.println(season);
//		System.out.println("���α׷� �����մϴ�.");
		
		
		// if�� ���� ���� ���α׷� �����
//		System.out.println("##���� ���� ���α׷�##");
//		System.out.print("���� �Ͻ� �ο��� �� �� �� �Դϱ�? ");
//		int people = scan.nextInt();
//		int money = 0; int a = 0; int b = 0;
//		if(people > 0) {
//			System.out.print("��� �� ���Դϱ�? (�ο��� 1��5õ��) ");
//			a = scan.nextInt();
//			money += a*15000;
//				if(people == a) {
//					System.out.println("�����Ͻ� �� �ݾ��� "+money+"�� �Դϴ�.");
//				}
//				else if(people - a > 0 && a > 0) {
//					System.out.print("���̴� �� ���Դϱ�? (�ο��� 5õ��) ");
//					b = scan.nextInt();
//					if(people - a == b) {
//						money += b*5000;
//						System.out.println("�����Ͻ� �� �ݾ��� "+money+"�� �Դϴ�.");
//					}
//					else {
//						System.out.println("�ο� ���� �ٽ� Ȯ�����ּ���.");
//					}
//					
//				}
//				else {
//					System.out.println("�ο� ���� �ٽ� Ȯ�����ּ���.");
//				}
//		}	
//		else {
//			System.out.println("�ο� ���� �ٽ� Ȯ�����ּ���.");
//		}
		
		// if�� ���� �����
//		System.out.println("##����##");
//		System.out.println("1.���ϱ�");
//		System.out.println("2.����");
//		System.out.println("3.������");
//		System.out.println("4.���ϱ�");
//		System.out.print("���� : ");
//		int select = scan.nextInt();
//		if(select > 0 && select <= 4) {
//			System.out.print("ù ��° ���ڸ� �Է����ּ���. ");
//			int a = scan.nextInt();
//			System.out.print("�� ��° ���ڸ� �Է����ּ���. ");
//			int b = scan.nextInt();
//			if(select == 1) {
//				System.out.println("���� "+(a+b)+"�Դϴ�.");
//			}
//			else if(select == 2) {
//				System.out.println("���� "+(a-b)+"�Դϴ�.");
//			}
//			else if(select == 3) {
//				if(b == 0) {
//					System.out.println("�� ��° ���ڰ� 0�Դϴ�.");
//				}
//				else {
//				System.out.println("���� "+((double)a/b)+"�Դϴ�.");
//				}
//			}
//			else if(select == 4) {
//				System.out.println("���� "+(a*b)+"�Դϴ�.");
//			}
//		}
//		else {
//			System.out.println("�ٽ� �������ּ���.");
//		}
		
		// switch��1
//		System.out.print("������ �Է��ϼ��� : ");
//		int select = scan.nextInt();
//		switch(select) {
//		case 1 : System.out.println("1 �Է�");
//				break;
//		case 2 : System.out.println("2 �Է�");
//				break;
//		case 3 : System.out.println("3 �Է�");
//				break;
//		case 4 : System.out.println("4 �Է�");
//				break;
//		default : System.out.println("��Ÿ�Է�");
		
		// switch��2
//		System.out.print("������ �Է��ϼ��� : ");
//		int select = scan.nextInt();
//		switch(select/10) {
//		case 0 : System.out.println("0~9 �Է�");
//			break;
//		case 1 : System.out.println("10~19 �Է�");
//			break;
//		case 2 : System.out.println("20~29 �Է�");
//			break;
//		case 3 : System.out.println("30~39 �Է�");
//			break;
//		case 4 : System.out.println("40~49 �Է�");
//			break;
//		default : System.out.println("��Ÿ�Է�");
//		}
		
		// switch��3
//		System.out.print("�̸��� �Է��ϼ��� : ");
//		String select = scan.next();
//		switch(select) 
//		{
//		case "������" :
//		case "��쿵" : System.out.println("1���Դϴ�.");
//			break;
//		case "�ֹ���" :
//		case "ȫ����" :
//		case "���¹�" : System.out.println("2���Դϴ�.");
//			break;
//		default : System.out.println("��Ÿ�Է�");
//		}
		
		// switch��4
//		String team;
//		System.out.print("���� �Է����ּ���. ");
//		int num = scan.nextInt();
//		switch(num % 5) {
//		case 1 : team = "1��";
//			break;
//		case 2 : team = "2��";
//			break;
//		case 3 : team = "3��";
//			break;
//		case 4 : team = "4��";
//			break;
//		default : team = "�ٽ�";
//		}
//		System.out.println(team);
	
		// switch��5
//		System.out.println("## ���� ##");
//		System.out.println("1.���ϱ�");
//		System.out.println("2.����");
//		System.out.println("3.������");
//		System.out.println("4.���ϱ�");
//		System.out.print("���� : ");
//		int select = scan.nextInt();
//		if(select <= 0 || select > 4) {
//			System.out.println("�ٽ� �Է��ϼ���.");
//		}
//		else {
//			System.out.print("ù ��° ���ڸ� �Է����ּ���. ");
//			int a = scan.nextInt();
//			System.out.print("�� ��° ���ڸ� �Է����ּ���. ");
//			int b = scan.nextInt();
//			switch(select) {
//			case 1 : System.out.println("���� "+(a+b)+" �Դϴ�.");
//				break;
//			case 2 : System.out.println("���� "+(a-b)+" �Դϴ�.");
//				break;
//			case 3 : 
//				if(b == 0) {
//					System.out.println("�� ��° ���ڰ� 0�Դϴ�. �ٽ� �Է��ϼ���.");
//					break;
//				}
//				else {
//					System.out.println("���� "+(double)a/b+" �Դϴ�.");
//				}
//				break;
//			case 4 : System.out.println("���� "+(a*b)+" �Դϴ�.");
//				break;
//			}
//		
//		}
		
		System.out.print("���̵� : ");
		String id = scan.next();
		System.out.print("��й�ȣ : ");
		String pw = scan.next();
		switch(id) {
		case "abc" :
			switch(pw) {
			case "123" : System.out.println("�α��� ����");
				break;
			default : System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				break;
			}
			break;
		default : System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}
		
	}
}

