package kh.project1.test1;

import java.util.Scanner;

public class LoopPractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		// �ǽ�����1
//		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
//		int num = scan.nextInt();
//		if(num < 1) {
//			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
//		}
//		for(int i = 1; i <= num; i++) {
//			System.out.print(i+" ");
//		}
		
		// �ǽ�����2
//		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
//		int num = scan.nextInt();;
//		while(num <= 0) {
//			System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
//			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
//			num = scan.nextInt();
//		}
//		for(int i = 1; i <= num; i++) {
//			System.out.print(i+" ");
//		}
		
		// �ǽ�����3
//		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
//		int num = scan.nextInt();
//		if(num < 1) {
//			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
//		}
//		for(int i = num; i >= 1; i--) {
//			System.out.print(i+" ");
//		}
		
		// �ǽ�����4
//		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
//		int num = scan.nextInt();;
//		while(num <= 0) {
//			System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
//			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
//			num = scan.nextInt();
//		}
//		for(int i = num; i >= 1; i--) {
//			System.out.print(i+" ");
//		}
		
		// �ǽ�����5
//		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
//		int num = scan.nextInt();
//		int sum = 0;
//		for(int i = 1; i <= num; i++) {
//			if(num == i) {
//				System.out.print(i+" = ");
//				sum += i;
//			}
//			else {
//				sum += i;
//				System.out.print(i+" + ");
//			}
//		}
//		System.out.print(+sum);
		
		// �ǽ�����6
//		System.out.print("ù ��° ���� : ");
//		int num1 = scan.nextInt();
//		System.out.print("�� ��° ���� : ");
//		int num2 = scan.nextInt();
//		if(num1 <= 0 || num2 <= 0) {
//			System.out.println("1 �̻��� ���ڸ� �Է����ּ���");
//		}
//		else {
//			for(int i = num2; i <= num1; i++) {
//				System.out.print(i+" ");
//			}
//			for(int i = num1; i <= num2; i++) {
//				System.out.print(i+" ");
//			}
//		}
		
		
		// �ǽ�����7
//		System.out.print("ù ��° ���� : ");
//		int num1 = scan.nextInt();
//		System.out.print("�� ��° ���� : ");
//		int num2 = scan.nextInt();
//		while(num1 <= 0 || num2 <= 0) {
//			System.out.println("1 �̻��� ���ڸ� �Է����ּ���");
//			System.out.print("ù ��° ���� : ");
//			num1 = scan.nextInt();
//			System.out.print("�� ��° ���� : ");
//			num2 = scan.nextInt();
//		}
//		if(num1 >= 0 && num2 >= 0) {
//			for(int i = num2; i <= num1; i++) {
//				System.out.print(i+" ");
//			}
//			for(int i = num1; i <= num2; i++) {
//				System.out.print(i+" ");
//			}
//		}
		
		// �ǽ�����8
//		System.out.print("���� : ");
//		int num = scan.nextInt();
//		System.out.println("===== "+num+"�� =====");
//		for(int i = 1; i <= 9; i++) {
//			System.out.println(num+" * "+i+" = "+(num*i));
//		}
		
		// �ǽ�����9
//		System.out.print("���� : ");
//		int num = scan.nextInt();
//		if(num >= 10) {
//			System.out.println("9 ������ ���ڸ� �Է����ּ���.");
//		}
//		else if(num < 2) {
//			System.out.println("2 �̻��� ���ڸ� �Է����ּ���.");
//		}
//		else {
//			for(int i = num; i <= 9; i++) {
//				System.out.println("===== "+i+"�� =====");
//				for(int j = 1; j <= 9; j++) {
//					System.out.println(i+" * "+j+" = "+(i*j));
//				}
//			}
//			
//		}
		
		// �ǽ�����10
//		System.out.print("���� : ");
//		int num = scan.nextInt();
//		while(num >= 10 || num < 2) {
//			if(num >= 10) {
//				System.out.println("9 ������ ���ڸ� �Է����ּ���.");
//				System.out.print("���� : ");
//				num = scan.nextInt();
//			}
//			else if(num < 2) {
//				System.out.println("2 �̻��� ���ڸ� �Է����ּ���.");
//				System.out.print("���� : ");
//				num = scan.nextInt();
//			}
//		}
//		for(int i = num; i <= 9; i++) {
//			System.out.println("===== "+i+"�� =====");
//			for(int j = 1; j <= 9; j++) {
//				System.out.println(i+" * "+j+" = "+(i*j));
//			}
//		}
		
		// �ǽ�����11
//		System.out.print("���� ���� : ");
//		int num1 = scan.nextInt();
//		System.out.print("���� : ");
//		int num2 = scan.nextInt();
//		for(int i = 0; i < 10; i++) {
//			System.out.print(num1+" ");
//			num1 += num2;
//		}
		
		// �ǽ�����12
//		String str; int num1; int num2;
//		while(true) {
//			System.out.print("������(+, -, *, /, %) : ");
//			str = scan.next();
//			switch(str) {
//			case "exit" : System.out.println("���α׷��� �����մϴ�.");
//				return;
//			}
//			System.out.print("����1 : ");
//			num1 = scan.nextInt();
//			System.out.print("����2 : ");
//			num2 = scan.nextInt();
//			switch(str) {
//			case "+" : System.out.println(num1+" + "+num2+" = "+(num1+num2));
//				break;
//			case "-" : System.out.println(num1+" - "+num2+" = "+(num1-num2));
//				break;
//			case "*" : System.out.println(num1+" * "+num2+" = "+(num1*num2));
//				break;
//			case "/" : 
//				if(num2 == 0) {
//					System.out.println(num2+"���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");
//					break;
//				}
//				else {
//					System.out.println(num1+" / "+num2+" = "+((float)num1/num2));
//					break;
//				}
//			case "%" : System.out.println(num1+" % "+num2+" = "+(num1%num2));
//				break;
//			default : System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���");
//			}
//		}
		
		// �ǽ�����13
//		System.out.print("���� �Է� : ");
//		int num = scan.nextInt();
//		for(int i = 1; i <= num; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// �ǽ�����14
//		System.out.print("���� �Է� : ");
//		int num = scan.nextInt();
//		for(int i = 1; i <= num; i++) {
//			for(int j = num-i; j >= 0; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}

}
