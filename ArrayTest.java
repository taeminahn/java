package kh.project1.test1;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// �迭1
//		int[] arr = new int[5];
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		// �ʱⰪ : boolean - false, char : \u0000
		// ������ : 0, �Ǽ��� : 0.0, ������ : null
		
		
		// �迭2(for������ �迭�ȿ� �� �ֱ�)
//		int[] arr = new int[5];
//		for(int i = 0; i < 5; i++) {
//			arr[i] = (i+1)*10;
//		}
//		for(int i = 0; i < 5; i++){
//			System.out.println(arr[i]);
//		}
		
		// �迭3(for������ �迭���� ���� ������ �̿�(length)�Ͽ� �� �ֱ�)
//		int[] arr = new int[100];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = (i+1)*10;
//		}
//		for(int i = 0; i < arr.length; i++){
//			System.out.println(arr[i]);
//		}
		
		// �迭4(C�������� �л��� �̸� �Է��ϱ�)
//		String[] cClass = new String[5];
//		for(int i = 0; i < cClass.length; i++) {
//			cClass[i] = scan.next();
//		}
//		System.out.println("## C������ �л� ��� ##");
//		for(int i = 0; i < cClass.length; i++) {
//			System.out.println("�̸� : "+cClass[i]);
//		}
		
		// �迭 ����
//		int[] arr = new int[5];
//		int sum = 0;
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print((i+1)+"��° �� �Է� : ");
//			arr[i] = scan.nextInt();
//		}
//		for(int i = 0; i < arr.length; i++) {
//			if(arr.length-1 == i) {
//				System.out.print(arr[i]+" = ");
//			}
//			else {
//				System.out.print(arr[i]+" + ");
//			}
//			sum += arr[i];
//		}
//		System.out.print(sum);
		

		// �ζ�(�ߺ�o, ����x)
//		�Ǽ������� ������ ����(0.0 <= ������ < 1.0)
//		(����ȯ)(Math.random()*����+���ۼ�)
//		System.out.println(Math.random());
//		System.out.println((int)(Math.random()*45+1));
//		int[] lotto = new int[7];
//		System.out.println("### �ζ� ��ȣ ������ ###");
//		System.out.print("������ ��ȣ ���� : ");
//		int num = scan.nextInt();
//		for(int j = 1; j <= num; j++) {
//			System.out.print(j+"��° ���� ��ȣ : ");
//			for(int i = 0; i < 7; i++) {
//				lotto[i] = (int)(Math.random()*45+1);
//			}
//			for(int k = 0; k < 7; k++) {
//				System.out.printf("%02d ",lotto[k]);
//			}
//			System.out.println();
//		}
		
		
		// �ζ�(�ߺ�x, ����x)
//		int[] lotto = new int[7];
//		System.out.println("### �ζ� ��ȣ ������ ###");
//		System.out.print("������ ��ȣ ���� : ");
//		int num = scan.nextInt();
//		for(int j = 1; j <= num; j++) {
//			System.out.print(j+"��° ���� ��ȣ : ");
//			for(int i = 0; i < 7; i++) {
//				lotto[i] = (int)(Math.random()*7+1);
//				if(i == 0) {
//					continue;
//				}
//				else {
//					for(int m = 0; m < i; m++ ) {
//						if(lotto[i] == lotto[m]) {
//							i--;
//							continue;
//						}
//					}
//				}
//			}
//			for(int k = 0; k < 7; k++) {
//				System.out.printf("%02d ",lotto[k]);
//			}
//			System.out.println();
//		}
		
		// �ζ�(�ߺ�x, ����o)
		int tmp = 0;
		int[] lotto = new int[7];
		System.out.println("### �ζ� ��ȣ ������ ###");
		System.out.print("������ ��ȣ ���� : ");
		int num = scan.nextInt();
		for(int j = 1; j <= num; j++) {
			System.out.print(j+"��° ���� ��ȣ : ");
			for(int i = 0; i < 7; i++) {
				lotto[i] = (int)(Math.random()*45+1);
				if(i == 0) {
					continue;
				}
				else {
					for(int m = 0; m < i; m++ ) {
						if(lotto[i] == lotto[m]) {
							i--;
							continue;
						}
					}
				}
			}
			for(int i = 0; i < 7; i++) {
				for(int m = 1+i; m < 7; m++) {
					if(lotto[i] > lotto[m]) {
						tmp = lotto[i];
						lotto[i] = lotto[m];
						lotto[m] = tmp;
						continue;
					}
				}
			}
			for(int k = 0; k < 7; k++) {
				System.out.printf("%02d ",lotto[k]);
			}
			System.out.println();
		}
		
//		if( arr[0]) > arr[1]) {
//		   tmp = arr[o];
//		   arr[1] = tmp;
	
	}
}
