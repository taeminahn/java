package kh.project1.test1;

import java.util.Arrays;
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
//			for(int i = 0; i < lotto.length; i++) {
//				lotto[i] = (int)(Math.random()*45+1);
//			}
//			for(int k = 0; k < lotto.length; k++) {
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
//			for(int i = 0; i < lotto.length; i++) {
//				lotto[i] = (int)(Math.random()*45+1);
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
//			for(int k = 0; k < lotto.length; k++) {
//				System.out.printf("%02d ",lotto[k]);
//			}
//			System.out.println();
//		}
		
		// �ζ�(�ߺ�x, ����o)
//		int tmp = 0;
//		int[] lotto = new int[7];
//		System.out.println("### �ζ� ��ȣ ������ ###");
//		System.out.print("������ ��ȣ ���� : ");
//		int num = scan.nextInt();
//		for(int j = 1; j <= num; j++) {
//			System.out.print(j+"��° ���� ��ȣ : ");
//			for(int i = 0; i < lotto.length; i++) {
//				lotto[i] = (int)(Math.random()*45+1);
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
//			for(int i = 0; i < lotto.length; i++) {
//				for(int m = 1+i; m < 7; m++) {
//					if(lotto[i] > lotto[m]) {
//						tmp = lotto[i];
//						lotto[i] = lotto[m];
//						lotto[m] = tmp;
//						continue;
//					}
//				}
//			}
//			for(int k = 0; k < lotto.length; k++) {
//				System.out.printf("%02d ",lotto[k]);
//			}
//			System.out.println();
//		}
		
		// �迭 ����
//		String[] studentName; // �޸��� �ּҸ� �����ϴ� �������� ����(Stack ����)
//		// �迭 �Ҵ� - ������ ������� ����
////	studentName = new String[10]; 
////	// ���� �����͸� �����ϴ� �� ������ ���� �� �ּҸ� ���������� ����(Heap ����)
		
//		System.out.print("�л��� ����Դϱ�? ");
//		int count = scan.nextInt();
//		studentName = new String[count];
//		
//		for(int i = 0; i < studentName.length; i++) {
//			System.out.print(i+1+"��° �л� �̸� : ");
//			studentName[i] = scan.next();
//		}
//		System.out.println("## �л� �� ##");
//		for(int j = 0; j < studentName.length; j++) {
//			System.out.println(j+1+"��° �л� �̸� : "+studentName[j]);
//		}
		
		// �迭 ���� ����
//		int[] arr1 = new int[] {10,20,30,40,50};
//		int[] arr2 = arr1;
//		
//		arr1[0] = 100;
//		
//		System.out.println("arr1 �ּ� : "+arr1);
//		for(int i = 0; i < arr1.length; i++) {
//			System.out.println(arr1[i]+" ");
//		}
//		System.out.println();
//		System.out.println("arr2 �ּ� : "+arr2);
//		for(int i = 0; i < arr2.length; i++) {
//			System.out.println(arr2[i]+" ");
//		}
		
		// �迭 ���� ����
//		int[] arr1 = new int[] {10,20,30,40,50};
//		int[] arr2 = new int[5];
		
		// ��� 1
//		for(int i = 2; i < arr1.length; i++) {
//			arr2[i] = arr1[i];
//		}
		
		// ��� 2
		//System.arraycopy(�����迭, ���� ������ġ, ������ �迭, ������ ������ġ, ������ ����);
//		// ��ü ������ ����
//		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
//		// Ư�� ������ ����
//		System.arraycopy(arr1, 3, arr2, 0, arr1.length-3);
		
		// ��� 3
		//Arrays.copyOf(�����迭, ������ ����);
//		// ��ü ������ ����
//		arr2 = Arrays.copyOf(arr1, arr1.length);
//		// Ư�� ������ ����
//		arr2 = Arrays.copyOf(arr1, 3);
		//Arrays.copyOf(�����迭, ������ġ, ����ġ+1);
//		// Ư�� ������ ����
//		arr2 = Arrays.copyOfRange(arr1, 3, arr1.length);
		
		// ��� 4
//		arr2 = arr1.clone();
		
		// ��� Ȯ�� ���α׷�
//		System.out.println("arr1 �ּ� : "+arr1);
//		for(int i = 0; i < arr1.length; i++) {
//			System.out.println(arr1[i]+" ");
//		}
//		System.out.println();
//		System.out.println("arr2 �ּ� : "+arr2);
//		for(int i = 0; i < arr2.length; i++) {
//			System.out.println(arr2[i]+" ");
//		}
		
		// 2���� �迭 ���� ���
//		int[][] arr1;
//		int arr2[][];
//		int[] arr3[];
//		
//		// 2���� �迭 �Ҵ�
//		arr1 = new int[3][5];
//		arr2 = new int[3][]; // 1���� �迭 ���� Ȯ���ϱ⶧���� 1���� �迭�� �Ҵ� ����
////		arr2 = new int[][3]; // �̰� ������
//		
//		// ������ 1���� �迭�� ���̰� ���� �ʾƵ� ��
//		arr2[0] = new int[5];
//		arr2[1] = new int[3];
//		arr2[2] = new int[10];
//		
//		// 1���� �迭 = 3�� ����
//		//1���� �迭�� 0 ��° = 5��, 1���� �迭�� 2��° = 3��, 1���� �迭�� 3��° = 4��
//		arr3 = new int[][] {{10,20,30,40,50}, {10,20,30}, {10,20,30,40}};
		
		// 2���� �迭
		int[][] arr = new int[2][4];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (j+1)*10;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		
		
	}
}
