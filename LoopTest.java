package kh.project1.test1;

import java.util.Scanner;

public class LoopTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.print("반복할 횟수 : ");
//		int num = scan.nextInt();
//		int sum = 0;
//		int i = 0;
		// while문 1
//		int i = 0;
//		while(num > i) {
//			++i;
//			System.out.println(i+"번째 반복");

		// while문 2
//		int i = 0;
//		while(true) {
//			++i;
//			if(num < i) {
//				break; /*return을 넣게 되면 해당 메서드는 완전 종료되어 밑에 프린트문은
//				 		출력되지 않을 뿐더러 에러뜸*/
//			}
//			System.out.println(i+"번째 반복");
//		}
		
		// while문 3
//		while(num > 0) {
//			System.out.println(num+"번째 반복");
//			num--;
//		}
		
		// while문 4 0부터 입력 받은 수까지의 합(변수 3개)
//		while(num > i) {
//			i++;
//			sum += i;
//		}
//		System.out.println(sum);
		
		// while문 5 0부터 입력 받은 수까지의 합(변수 2개)
//		while(num > 0) {
//			sum += num;
//			num--;
//		}
//		System.out.println(sum);
		
		// while문 6 0부터 입력 받은 수까지의 짝수들 합(변수 2개)
//		while(num > 0) {
//			if(num % 2 == 0) {
//				sum += num;
//			}
//			num--;
//		}
//		System.out.println(sum);
		
		// while문을 이용한 구구단(변수 2개)
//		System.out.print("몇 단을 출력하시겠습니까? : ");
//		int n = scan.nextInt();
//		while(i < 9) {
//			i++;
//			System.out.println(n+" x "+i+" = "+(n*i));
//		}
		
		// while문을 이용한 계산기 만들기
//		while(true) {
//			System.out.println("## 계산기 ##");
//			System.out.println("1. 더하기");
//			System.out.println("2. 빼기");
//			System.out.println("3. 나누기");
//			System.out.println("4. 곱하기");
//			System.out.println("5. 종료");
//			System.out.print("선택 : ");
//			int select = scan.nextInt();
//			if(select == 5) {
//				System.out.println("종료하겠습니다.");
//				return;
//			}
//			if(select <= 0 || select > 4) {
//				System.out.println("다시 입력하세요.");
//			}
//			else {
//				System.out.print("첫 번째 숫자를 입력해주세요. ");
//				int a = scan.nextInt();
//				System.out.print("두 번째 숫자를 입력해주세요. ");
//				int b = scan.nextInt();
//				switch(select) {
//				case 1 : System.out.println("값은 "+(a+b)+" 입니다.");
//					break;
//				case 2 : System.out.println("값은 "+(a-b)+" 입니다.");
//					break;
//				case 3 : 
//					if(b == 0) {
//						System.out.println("두 번째 숫자가 0입니다. 다시 입력하세요.");
//						break;
//					}
//					else {
//						System.out.println("값은 "+(double)a/b+" 입니다.");
//					}
//					break;
//				case 4 : System.out.println("값은 "+(a*b)+" 입니다.");
//					break;
//				}
//			}
//		}
		
		// do~while문1
//		int i = 1;
//		do {
//			System.out.println(i);
//			i++;
//		}while(i <= 10);
		
		// do~while문2
//		int num;
//		do {
//			System.out.print("정수 입력 : (종료 0)");
//			num = scan.nextInt();
//			System.out.println("입력 값 : "+num);
//		}while(num != 0);
		
		// for문
//		System.out.print("반복할 횟수 : ");
//		int num = scan.nextInt();
//		for(int i = 1; i <= num; i++) {
//			System.out.println(i+"번째 반족");
//		}
		
		// 중첩 for문 예제
//		for(int i = 1; i <= 10; i++) {
//			System.out.println("## 외부 반복문 " +i);
//			for(int j = 1; j <= 10; j++) {
//				System.out.println("외부"+i+"에 대한 내부 반복문 "+j);
//			}
//		}
		
		// 중첩 for문으로 구구단 만들기
//		for(int i = 2; i <= 9; i++) {
//			System.out.println(i+"단 시작");
//			for(int j = 1; j <= 9; j++) {
//				System.out.println(i+" x "+j+" = "+(i*j));
//			}
//		}
		
		// 중첩 for문으로 구구단 나열하기 1
//		for(int i = 2; i <= 9; i++) {
//			for(int j = 1; j <= 9; j++) {
//				System.out.print("\t"+i+" x "+j+" = "+(i*j));
//			}
//			System.out.println();
//		}
		
//		// 중첩 for문으로 구구단 나열하기 2
//		for(int i = 2; i <= 9; i++) {
//			for(int j = 1; j <= 9; j++) {
//				System.out.printf("%d x %d = %-3d ", i, j,(j*i));
//			}
//			System.out.println();
//		}
//		System.out.println();
//		System.out.println();
//		
//		// 중첩 for문으로 구구단 나열하기2
//		for(int i = 1; i <= 9; i++) {
//			for(int j = 2; j <= 9; j++) {
//				System.out.printf("%d x %d = %-3d ", j, i,(j*i));
//			}
//			System.out.println();
//		}
		
		// 중첩 while으로 구구단 나열하기 1
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
		
		
//		// 중첩 while으로 구구단 나열하기 2	
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
		
		// 별찍기 1
		System.out.println("## 별찍기 1 ##");
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("☆");
			}
			System.out.println();
		}
		
		// 별찍기 2
		System.out.println("## 별찍기 2 ##");
		for(int i = 5; i > 0; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("☆");
			}
			System.out.println();
		}
		
		// 별찍기 3
		System.out.println("## 별찍기 3 ##");
		for(int i = 1; i <= 5; i++) {
			for(int j = 4-i; j >= 0; j--) {
				System.out.print("    ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("☆");
			}
			System.out.println();
		}
		
		// 별찍기 4
		System.out.println("## 별찍기 4 ##");
		for(int i = 5; i > 0; i--) {
			for(int j = 4-i; j >= 0; j--) {
				System.out.print("    ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("☆");
			}
			System.out.println();
		}
	}
}
