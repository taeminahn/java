package kh.project1.test1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// �ǽ����� 1
//		int[] arr = new int[10];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = i+1;
//			System.out.print(arr[i]+" ");
//		}
		
		// �ǽ����� 2
//		int[] arr = new int[10];
//		for(int i = arr.length; i > 0; i--) {
//			arr[i-1] = i;
//			System.out.print(arr[i-1]+" ");
//		}
		
		// �ǽ����� 3
//		System.out.print("���� ���� : ");
//		int num = scan.nextInt();
//		if(num <= 0) {
//			System.out.println("���� ������ �Է����ּ���. ");
//		}
//		else {
//			int[] arr = new int[num];
//			for(int i = 0; i < arr.length; i++) {
//				arr[i] = i+1;
//				System.out.print(arr[i]+" ");
//			}
//		}
		
		// �ǽ����� 4
//		String[] fruit = new String[] {"���","��","����","������","����"};
//		System.out.println(fruit[1]);
		
		// �ǽ����� 5
//		int count = 0;
//		System.out.print("���ڿ� : ");
//		String str1 = scan.next();
//		System.out.print("���� : ");
//		char ch = scan.next().charAt(0);
//		char[] arr = new char[str1.length()];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = str1.charAt(i);
//		}
//		System.out.print(str1+"�� "+ch+"�� �����ϴ� ��ġ(�ε���) : ");
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] == ch){
//				System.out.print(i+" ");
//				count += 1;
//			}
//		}
//		System.out.print("\n"+ch+" ���� : "+count);
		
		// �ǽ����� 6
//		String[] day = new String[] {"������","ȭ����","������","�����","�ݿ���","�����","�Ͽ���"};
//		System.out.print("0 ~ 6 ���� ���� �Է� : ");
//		int num = scan.nextInt();
//		if(num < 0 || num > 6) {
//			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
//		}
//		else {
//			System.out.println(day[num]);
//		}
		
		// �ǽ����� 7
//		System.out.print("���� : ");
//		int num = scan.nextInt();
//		int[] arr = new int[num];
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print("�迭 "+i+"��° �ε����� ���� �� : ");
//			num = scan.nextInt();
//			arr[i] = num;
//		}
//		num = 0;
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+" ");
//			num += arr[i];
//		}
//		System.out.println();
//		System.out.println("�� �� : "+num);
		
		// �ǽ����� 8
//		System.out.print("���� : ");
//		int num = scan.nextInt();
//		while(true) {
//			if(num < 2 || num%2==0) {
//				System.out.println("�ٽ� �Է��ϼ���.");
//				System.out.print("���� : ");
//				num = scan.nextInt();
//				
//			}
//			else {
//				break;
//			}
//		}
//		int[] arr = new int[num];
//		for(int i = 0; i < arr.length; i++) {
//			if(i > (arr.length-1)/2) {
//				for(int j = 0; j < (arr.length-1)/2; j++) {
//					arr[i+j] = i-(j+1);
//				}
//				break;
//			}
//			else {
//				arr[i] = i+1;
//			}
//		}
//		for(int i = 0; i < arr.length; i++) {
//			if(i == arr.length-1) {
//				System.out.print(arr[i]);
//			}
//			else {
//				System.out.print(arr[i]+", ");
//			}
//		}
		
		// �ǽ����� 9
//		String[] chicken = new String[] {"�Ķ��̵�","���ġŲ","����ġŲ"};
//		System.out.print("ġŲ �̸��� �Է��ϼ��� : ");
//		String chickenName = scan.next();
//		for(int i = 0; i < chicken.length; i++) {
//			if(chickenName.equals(chicken[i])) {
//				System.out.println(chickenName+" ��� ����");
//				return;
//			}
//		}
//		System.out.println(chickenName+"��(��) ���� �޴��Դϴ�.");
		
		// �ǽ����� 10
//		System.out.print("�ֹε�Ϲ�ȣ(-����) : ");
//		String jumin = scan.next();
//		char[] dupliJumin1 = new char[jumin.length()];
//		char[] dupliJumin2 = new char[jumin.length()];
//		for(int i = 0; i < jumin.length(); i++) {
//			dupliJumin1[i] = jumin.charAt(i);
//		}
//		System.arraycopy(dupliJumin1, 0, dupliJumin2, 0, dupliJumin1.length);
//		for(int i = 0; i < jumin.length(); i++) {
//			if(i > 7) {
//				dupliJumin2[i] = '*';
//			}
//		}
//		for(int i = 0; i < jumin.length(); i++) {
//			System.out.print(dupliJumin2[i]);
//		}
		
		// �ǽ����� 11
//		int[] arr = new int[10];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random()*10+1);
//			System.out.print(arr[i]+" ");
//		}
		
		// �ǽ����� 12
//		int tmp;
//		int[] arr = new int[10];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random()*10+1);
//			System.out.print(arr[i]+" ");
//		}
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = i+1; j < arr.length; j++) {
//				if(arr[i] > arr[j]) {
//					tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp;
//					continue;
//				}
//			}
//		}
//		System.out.println("\n�ִ밪 : "+arr[arr.length-1]);
//		System.out.println("�ּҰ� : "+arr[0]);

		// �ǽ����� 13
//		int[] arr = new int[10];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random()*10+1);
//			if(i == 0) {
//				continue;
//			}
//			else {
//				for(int j = 0; j < i; j++ ) {
//					if(arr[i] == arr[j]) {
//						i--;
//						continue;
//					}
//				}
//			}
//		}
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
		
		// �ǽ����� 14 
//		int tmp = 0;
//		int[] lotto = new int[6];
//		for(int i = 0; i < lotto.length; i++) {
//			lotto[i] = (int)(Math.random()*45+1);
//			if(i == 0) {
//				continue;
//			}
//			else {
//				for(int m = 0; m < i; m++ ) {
//					if(lotto[i] == lotto[m]) {
//						i--;
//						continue;
//					}
//				}
//			}
//		}
//		for(int i = 0; i < lotto.length; i++) {
//			for(int m = 1+i; m < 6; m++) {
//				if(lotto[i] > lotto[m]) {
//					tmp = lotto[i];
//					lotto[i] = lotto[m];
//					lotto[m] = tmp;
//					continue;
//				}
//			}
//		}
//		for(int i = 0; i < lotto.length; i++) {
//			System.out.print(lotto[i]+" ");
//		}
		
		
		
		// �ǽ����� 15 
//		System.out.print("���ڿ� : ");
//		String str1 = scan.next();
//		int count = 0;
//		boolean check = false;
//		char[] arr = new char[str1.length()];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = str1.charAt(i);
//			check = false;
//			for(int j = 0; j < i; j++) {
//				if(arr[j] == str1.charAt(i)) {
//					check = true;
//					break;
//				}
//			}
//			if(check == false) {
//				if(i == 0) {
//					System.out.print("���ڿ��� �ִ� ���� : "+str1.charAt(i));
//					count += 1;
//				}
//				else {
//					System.out.print(", "+str1.charAt(i));
//					count += 1;
//				}
//				
//			}
//			else {
//				continue;
//			}
//		}
//		System.out.println();
//		System.out.print("���� ���� : "+count);
		
		
		// �ǽ����� 16
//		char select;
//		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");
//		int num1 = scan.nextInt();
//		while(num1 <= 0) {
//			System.out.println("�ٽ� �Է����ּ���.");
//			System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");
//			num1 = scan.nextInt();
//		}
//		int num2;
//		String[] subject= new String[num1];
//		String[] subject2;
//		String[] subject3;
//		for(int i = 0; i < num1; i++) {
//			System.out.print((i+1)+"��° ���ڿ� : ");
//			subject[i] = scan.next();
//		}
//		while(true) {
//			System.out.print("�� ���� �Է��Ͻðڽ��ϱ�?(Y/N) : ");
//			select = scan.next().charAt(0);
//			switch(select) {
//			case 'Y','y' : System.out.print("�� �Է��ϰ� ���� ���� : ");
//					   num2 = scan.nextInt();
//					   if(num2 <= 0) {
//						   System.out.println("�ٽ� �Է����ּ���. ");
//						   break;
//					   }
//					   else {
//						   num1 += num2;
//						   subject2 = new String[num1];
//						   subject3 = new String[num1];
//						   System.arraycopy(subject, 0, subject3, 0, (num1-num2));
//						   for(int i = (num1-num2)+1; i <= num1; i++) {
//								System.out.print((i)+"��° ���ڿ� : ");
//								subject2[i-1] = scan.next();
//							}
//						   System.arraycopy(subject2, (num1-num2), subject3, (num1-num2), num2);
//						   subject = subject3.clone();
//						   
//						   break;
//					   }
//			case 'N','n' :
//				for(int i = 0; i < subject.length; i++) {
//					if(i == subject.length-1) {
//						System.out.print(subject[i]+"]");
//					}
//					else if(i==0) {
//						System.out.print("["+subject[i]+", ");
//					}
//					else {
//						System.out.print(subject[i]+", ");
//					}
//				}
//				return;
//			default : System.out.println("�ٽ� �Է����ּ���.");
//			}
//		}
		
		
	}
}
