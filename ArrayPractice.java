package kh.project1.test1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 실습문제 1
//		int[] arr = new int[10];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = i+1;
//			System.out.print(arr[i]+" ");
//		}
		
		// 실습문제 2
//		int[] arr = new int[10];
//		for(int i = arr.length; i > 0; i--) {
//			arr[i-1] = i;
//			System.out.print(arr[i-1]+" ");
//		}
		
		// 실습문제 3
//		System.out.print("양의 정수 : ");
//		int num = scan.nextInt();
//		if(num <= 0) {
//			System.out.println("양의 정수를 입력해주세요. ");
//		}
//		else {
//			int[] arr = new int[num];
//			for(int i = 0; i < arr.length; i++) {
//				arr[i] = i+1;
//				System.out.print(arr[i]+" ");
//			}
//		}
		
		// 실습문제 4
//		String[] fruit = new String[] {"사과","귤","포도","복숭아","참외"};
//		System.out.println(fruit[1]);
		
		// 실습문제 5
//		int count = 0;
//		System.out.print("문자열 : ");
//		String str1 = scan.next();
//		System.out.print("문자 : ");
//		char ch = scan.next().charAt(0);
//		char[] arr = new char[str1.length()];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = str1.charAt(i);
//		}
//		System.out.print(str1+"에 "+ch+"가 존재하는 위치(인덱스) : ");
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] == ch){
//				System.out.print(i+" ");
//				count += 1;
//			}
//		}
//		System.out.print("\n"+ch+" 개수 : "+count);
		
		// 실습문제 6
//		String[] day = new String[] {"월요일","화요일","수요일","목요일","금요일","토요일","일요일"};
//		System.out.print("0 ~ 6 사이 숫자 입력 : ");
//		int num = scan.nextInt();
//		if(num < 0 || num > 6) {
//			System.out.println("잘못 입력하셨습니다.");
//		}
//		else {
//			System.out.println(day[num]);
//		}
		
		// 실습문제 7
//		System.out.print("정수 : ");
//		int num = scan.nextInt();
//		int[] arr = new int[num];
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
//			num = scan.nextInt();
//			arr[i] = num;
//		}
//		num = 0;
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+" ");
//			num += arr[i];
//		}
//		System.out.println();
//		System.out.println("총 합 : "+num);
		
		// 실습문제 8
//		System.out.print("정수 : ");
//		int num = scan.nextInt();
//		while(true) {
//			if(num < 2 || num%2==0) {
//				System.out.println("다시 입력하세요.");
//				System.out.print("정수 : ");
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
		
		// 실습문제 9
//		String[] chicken = new String[] {"후라이드","양념치킨","간장치킨"};
//		System.out.print("치킨 이름을 입력하세요 : ");
//		String chickenName = scan.next();
//		for(int i = 0; i < chicken.length; i++) {
//			if(chickenName.equals(chicken[i])) {
//				System.out.println(chickenName+" 배달 가능");
//				return;
//			}
//		}
//		System.out.println(chickenName+"는(은) 없는 메뉴입니다.");
		
		// 실습문제 10
//		System.out.print("주민등록번호(-포함) : ");
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
		
		// 실습문제 11
//		int[] arr = new int[10];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random()*10+1);
//			System.out.print(arr[i]+" ");
//		}
		
		// 실습문제 12
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
//		System.out.println("\n최대값 : "+arr[arr.length-1]);
//		System.out.println("최소값 : "+arr[0]);

		// 실습문제 13
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
		
		// 실습문제 14 
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
		
		
		
		// 실습문제 15 
//		System.out.print("문자열 : ");
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
//					System.out.print("문자열에 있는 문자 : "+str1.charAt(i));
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
//		System.out.print("문자 개수 : "+count);
		
		
		// 실습문제 16
//		char select;
//		System.out.print("배열의 크기를 입력하세요 : ");
//		int num1 = scan.nextInt();
//		while(num1 <= 0) {
//			System.out.println("다시 입력해주세요.");
//			System.out.print("배열의 크기를 입력하세요 : ");
//			num1 = scan.nextInt();
//		}
//		int num2;
//		String[] subject= new String[num1];
//		String[] subject2;
//		String[] subject3;
//		for(int i = 0; i < num1; i++) {
//			System.out.print((i+1)+"번째 문자열 : ");
//			subject[i] = scan.next();
//		}
//		while(true) {
//			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
//			select = scan.next().charAt(0);
//			switch(select) {
//			case 'Y','y' : System.out.print("더 입력하고 싶은 개수 : ");
//					   num2 = scan.nextInt();
//					   if(num2 <= 0) {
//						   System.out.println("다시 입력해주세요. ");
//						   break;
//					   }
//					   else {
//						   num1 += num2;
//						   subject2 = new String[num1];
//						   subject3 = new String[num1];
//						   System.arraycopy(subject, 0, subject3, 0, (num1-num2));
//						   for(int i = (num1-num2)+1; i <= num1; i++) {
//								System.out.print((i)+"번째 문자열 : ");
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
//			default : System.out.println("다시 입력해주세요.");
//			}
//		}
		
		
	}
}
