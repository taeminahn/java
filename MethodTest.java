package kh.project1.test1;

import java.util.Scanner;

public class MethodTest {
	
//	public static int func1(int num)  {
//		System.out.println("func �޼���");
//		int sum = 0;
//		for(int i = 0; i <= num; i++) {
//			sum += i;
//			
//		}
//		return sum;
//	}
	
	public static int plus(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	public static int minus(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
	public static int multi(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
	public static int divide(int num1, int num2) {
		int result = num1 / num2;
		return result;
	}
	public static int rest(int num1, int num2) {
		int result = num1 % num2;
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int sum;
//		System.out.println("���� �޼���");
//		sum = func1(10);
//		System.out.println(sum);
//		System.out.println("���� �޼���2");
//		System.out.println(func1(20));
//		System.out.println(func1(20)+10);

		// ������ �� ����� �Լ��� ����
		int result;
		while(true) {
			System.out.println("## ���� ##");
			System.out.println("1. ���ϱ�");
			System.out.println("2. ����");
			System.out.println("3. ���ϱ�");
			System.out.println("4. ������");
			System.out.println("5. ������");
			System.out.println("6. ����");
			System.out.print("�����ϼ��� : ");
			int select = scan.nextInt();
			if(select == 6) {
				System.out.println("���α׷��� �����մϴ�. ");
				return;
			}
			else if(select <= 0 || select > 5) {
				System.out.println("�ٽ� �������ּ���.");
			}
			else {
				System.out.print("ù ��° ������ �Է��ϼ��� : ");
				int num1 = scan.nextInt();
				System.out.print("�� ��° ������ �Է��ϼ��� : ");
				int num2 = scan.nextInt();
				switch(select) {
				case 1: System.out.println("���� ���� : "+plus(num1,num2));
					break;
				case 2: System.out.println("�� ���� : "+minus(num1,num2));
					break;
				case 3: System.out.println("���� ���� : "+multi(num1,num2));
					break;
				case 4: 
					if(num2 == 0) {
						System.out.println("�� ��° ������ 0�Դϴ�. �ٽ� �Է����ּ���.");
						break;
					}
					System.out.println("���� ���� : "+divide(num1,num2));
					break;
				case 5: System.out.println("���� ������ ���� : "+rest(num1,num2));
					break;
				}
			}
			
		}
		
	
		
	}

}
