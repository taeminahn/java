package kh.project1.test1;

import java.util.Scanner;

public class LoopPractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		// 실습문제1
//		System.out.print("1이상의 숫자를 입력하세요 : ");
//		int num = scan.nextInt();
//		if(num < 1) {
//			System.out.println("1 이상의 숫자를 입력해주세요.");
//		}
//		for(int i = 1; i <= num; i++) {
//			System.out.print(i+" ");
//		}
		
		// 실습문제2
//		System.out.print("1이상의 숫자를 입력하세요 : ");
//		int num = scan.nextInt();;
//		while(num <= 0) {
//			System.out.println("1이상의 숫자를 입력해주세요.");
//			System.out.print("1이상의 숫자를 입력하세요 : ");
//			num = scan.nextInt();
//		}
//		for(int i = 1; i <= num; i++) {
//			System.out.print(i+" ");
//		}
		
		// 실습문제3
//		System.out.print("1이상의 숫자를 입력하세요 : ");
//		int num = scan.nextInt();
//		if(num < 1) {
//			System.out.println("1 이상의 숫자를 입력해주세요.");
//		}
//		for(int i = num; i >= 1; i--) {
//			System.out.print(i+" ");
//		}
		
		// 실습문제4
//		System.out.print("1이상의 숫자를 입력하세요 : ");
//		int num = scan.nextInt();;
//		while(num <= 0) {
//			System.out.println("1이상의 숫자를 입력해주세요.");
//			System.out.print("1이상의 숫자를 입력하세요 : ");
//			num = scan.nextInt();
//		}
//		for(int i = num; i >= 1; i--) {
//			System.out.print(i+" ");
//		}
		
		// 실습문제5
//		System.out.print("1이상의 숫자를 입력하세요 : ");
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
		
		// 실습문제6
//		System.out.print("첫 번째 숫자 : ");
//		int num1 = scan.nextInt();
//		System.out.print("두 번째 숫자 : ");
//		int num2 = scan.nextInt();
//		if(num1 <= 0 || num2 <= 0) {
//			System.out.println("1 이상의 숫자를 입력해주세요");
//		}
//		else {
//			for(int i = num2; i <= num1; i++) {
//				System.out.print(i+" ");
//			}
//			for(int i = num1; i <= num2; i++) {
//				System.out.print(i+" ");
//			}
//		}
		
		
		// 실습문제7
//		System.out.print("첫 번째 숫자 : ");
//		int num1 = scan.nextInt();
//		System.out.print("두 번째 숫자 : ");
//		int num2 = scan.nextInt();
//		while(num1 <= 0 || num2 <= 0) {
//			System.out.println("1 이상의 숫자를 입력해주세요");
//			System.out.print("첫 번째 숫자 : ");
//			num1 = scan.nextInt();
//			System.out.print("두 번째 숫자 : ");
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
		
		// 실습문제8
//		System.out.print("숫자 : ");
//		int num = scan.nextInt();
//		System.out.println("===== "+num+"단 =====");
//		for(int i = 1; i <= 9; i++) {
//			System.out.println(num+" * "+i+" = "+(num*i));
//		}
		
		// 실습문제9
//		System.out.print("숫자 : ");
//		int num = scan.nextInt();
//		if(num >= 10) {
//			System.out.println("9 이하의 숫자만 입력해주세요.");
//		}
//		else if(num < 2) {
//			System.out.println("2 이상의 숫자만 입력해주세요.");
//		}
//		else {
//			for(int i = num; i <= 9; i++) {
//				System.out.println("===== "+i+"단 =====");
//				for(int j = 1; j <= 9; j++) {
//					System.out.println(i+" * "+j+" = "+(i*j));
//				}
//			}
//			
//		}
		
		// 실습문제10
//		System.out.print("숫자 : ");
//		int num = scan.nextInt();
//		while(num >= 10 || num < 2) {
//			if(num >= 10) {
//				System.out.println("9 이하의 숫자만 입력해주세요.");
//				System.out.print("숫자 : ");
//				num = scan.nextInt();
//			}
//			else if(num < 2) {
//				System.out.println("2 이상의 숫자만 입력해주세요.");
//				System.out.print("숫자 : ");
//				num = scan.nextInt();
//			}
//		}
//		for(int i = num; i <= 9; i++) {
//			System.out.println("===== "+i+"단 =====");
//			for(int j = 1; j <= 9; j++) {
//				System.out.println(i+" * "+j+" = "+(i*j));
//			}
//		}
		
		// 실습문제11
//		System.out.print("시작 숫자 : ");
//		int num1 = scan.nextInt();
//		System.out.print("공차 : ");
//		int num2 = scan.nextInt();
//		for(int i = 0; i < 10; i++) {
//			System.out.print(num1+" ");
//			num1 += num2;
//		}
		
		// 실습문제12
//		String str; int num1; int num2;
//		while(true) {
//			System.out.print("연산자(+, -, *, /, %) : ");
//			str = scan.next();
//			switch(str) {
//			case "exit" : System.out.println("프로그램을 종료합니다.");
//				return;
//			}
//			System.out.print("정수1 : ");
//			num1 = scan.nextInt();
//			System.out.print("정수2 : ");
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
//					System.out.println(num2+"으로 나눌 수 없습니다. 다시 입력해주세요.");
//					break;
//				}
//				else {
//					System.out.println(num1+" / "+num2+" = "+((float)num1/num2));
//					break;
//				}
//			case "%" : System.out.println(num1+" % "+num2+" = "+(num1%num2));
//				break;
//			default : System.out.println("없는 연산자입니다. 다시 입력해주세요");
//			}
//		}
		
		// 실습문제13
//		System.out.print("정수 입력 : ");
//		int num = scan.nextInt();
//		for(int i = 1; i <= num; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// 실습문제14
//		System.out.print("정수 입력 : ");
//		int num = scan.nextInt();
//		for(int i = 1; i <= num; i++) {
//			for(int j = num-i; j >= 0; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}

}
