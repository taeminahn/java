package kh.project1.test1;

import java.util.Scanner;

public class LoopTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.print("�ݺ��� Ƚ�� : ");
//		int num = scan.nextInt();
//		int sum = 0;
//		int i = 0;
		// while�� 1
//		int i = 0;
//		while(num > i) {
//			++i;
//			System.out.println(i+"��° �ݺ�");

		// while�� 2
//		int i = 0;
//		while(true) {
//			++i;
//			if(num < i) {
//				break; /*return�� �ְ� �Ǹ� �ش� �޼���� ���� ����Ǿ� �ؿ� ����Ʈ����
//				 		��µ��� ���� �Ӵ��� ������*/
//			}
//			System.out.println(i+"��° �ݺ�");
//		}
		
		// while�� 3
//		while(num > 0) {
//			System.out.println(num+"��° �ݺ�");
//			num--;
//		}
		
		// while�� 4 0���� �Է� ���� �������� ��(���� 3��)
//		while(num > i) {
//			i++;
//			sum += i;
//		}
//		System.out.println(sum);
		
		// while�� 5 0���� �Է� ���� �������� ��(���� 2��)
//		while(num > 0) {
//			sum += num;
//			num--;
//		}
//		System.out.println(sum);
		
		// while�� 6 0���� �Է� ���� �������� ¦���� ��(���� 2��)
//		while(num > 0) {
//			if(num % 2 == 0) {
//				sum += num;
//			}
//			num--;
//		}
//		System.out.println(sum);
		
		// while���� �̿��� ������(���� 2��)
//		System.out.print("�� ���� ����Ͻðڽ��ϱ�? : ");
//		int n = scan.nextInt();
//		while(i < 9) {
//			i++;
//			System.out.println(n+" x "+i+" = "+(n*i));
//		}
		
		// while���� �̿��� ���� �����
//		while(true) {
//			System.out.println("## ���� ##");
//			System.out.println("1. ���ϱ�");
//			System.out.println("2. ����");
//			System.out.println("3. ������");
//			System.out.println("4. ���ϱ�");
//			System.out.println("5. ����");
//			System.out.print("���� : ");
//			int select = scan.nextInt();
//			if(select == 5) {
//				System.out.println("�����ϰڽ��ϴ�.");
//				return;
//			}
//			if(select <= 0 || select > 4) {
//				System.out.println("�ٽ� �Է��ϼ���.");
//			}
//			else {
//				System.out.print("ù ��° ���ڸ� �Է����ּ���. ");
//				int a = scan.nextInt();
//				System.out.print("�� ��° ���ڸ� �Է����ּ���. ");
//				int b = scan.nextInt();
//				switch(select) {
//				case 1 : System.out.println("���� "+(a+b)+" �Դϴ�.");
//					break;
//				case 2 : System.out.println("���� "+(a-b)+" �Դϴ�.");
//					break;
//				case 3 : 
//					if(b == 0) {
//						System.out.println("�� ��° ���ڰ� 0�Դϴ�. �ٽ� �Է��ϼ���.");
//						break;
//					}
//					else {
//						System.out.println("���� "+(double)a/b+" �Դϴ�.");
//					}
//					break;
//				case 4 : System.out.println("���� "+(a*b)+" �Դϴ�.");
//					break;
//				}
//			}
//		}
		
		// do~while��1
//		int i = 1;
//		do {
//			System.out.println(i);
//			i++;
//		}while(i <= 10);
		
		// do~while��2
//		int num;
//		do {
//			System.out.print("���� �Է� : (���� 0)");
//			num = scan.nextInt();
//			System.out.println("�Է� �� : "+num);
//		}while(num != 0);
		
		// for��
//		System.out.print("�ݺ��� Ƚ�� : ");
//		int num = scan.nextInt();
//		for(int i = 1; i <= num; i++) {
//			System.out.println(i+"��° ����");
//		}
		
		// ��ø for�� ����
//		for(int i = 1; i <= 10; i++) {
//			System.out.println("## �ܺ� �ݺ��� " +i);
//			for(int j = 1; j <= 10; j++) {
//				System.out.println("�ܺ�"+i+"�� ���� ���� �ݺ��� "+j);
//			}
//		}
		
		// ��ø for������ ������ �����
//		for(int i = 2; i <= 9; i++) {
//			System.out.println(i+"�� ����");
//			for(int j = 1; j <= 9; j++) {
//				System.out.println(i+" x "+j+" = "+(i*j));
//			}
//		}
		
		// ��ø for������ ������ �����ϱ� 1
//		for(int i = 2; i <= 9; i++) {
//			for(int j = 1; j <= 9; j++) {
//				System.out.print("\t"+i+" x "+j+" = "+(i*j));
//			}
//			System.out.println();
//		}
		
//		// ��ø for������ ������ �����ϱ� 2
//		for(int i = 2; i <= 9; i++) {
//			for(int j = 1; j <= 9; j++) {
//				System.out.printf("%d x %d = %-3d ", i, j,(j*i));
//			}
//			System.out.println();
//		}
//		System.out.println();
//		System.out.println();
//		
//		// ��ø for������ ������ �����ϱ�2
//		for(int i = 1; i <= 9; i++) {
//			for(int j = 2; j <= 9; j++) {
//				System.out.printf("%d x %d = %-3d ", j, i,(j*i));
//			}
//			System.out.println();
//		}
		
		// ��ø while���� ������ �����ϱ� 1
//		int dan1 = 2; int num1 = 1;
//		while(dan1 < 10) {
//			num1 = 1;
//			while(num1 < 10) {
//				System.out.printf("%d x %d = %-3d ", dan1, num1,(dan1*num1));
//				num1++;
//			}
//			System.out.println();
//			dan1++;
//		}
		
		
//		// ��ø while���� ������ �����ϱ� 2	
//		int dan2 = 2; int num2 = 1;
//		while(num2 < 10) {
//			dan2 = 2;
//			while(dan2 < 10) {
//				System.out.printf("%d x %d = %-3d ", dan2, num2,(dan2*num2));
//				dan2++;
//			}
//			System.out.println();
//			num2++;
//		}
		
		// ����� 1
		System.out.println("## ����� 1 ##");
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
		
		// ����� 2
		System.out.println("## ����� 2 ##");
		for(int i = 5; i > 0; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
		
		// ����� 3
		System.out.println("## ����� 3 ##");
		for(int i = 1; i <= 5; i++) {
			for(int j = 4-i; j >= 0; j--) {
				System.out.print("    ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("��");
			}
			System.out.println();
		}
		
		// ����� 4
		System.out.println("## ����� 4 ##");
		for(int i = 5; i > 0; i--) {
			for(int j = 4-i; j >= 0; j--) {
				System.out.print("    ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("��");
			}
			System.out.println();
		}
	}
}
