package kh.project1.test1;

import java.util.Scanner;

public class MethodTest {
	
//	public static int func1(int num)  {
//		System.out.println("func 메서드");
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
//		System.out.println("메인 메서드");
//		sum = func1(10);
//		System.out.println(sum);
//		System.out.println("메인 메서드2");
//		System.out.println(func1(20));
//		System.out.println(func1(20)+10);

		// 계산기의 각 기능을 함수로 구현
		int result;
		while(true) {
			System.out.println("## 계산기 ##");
			System.out.println("1. 더하기");
			System.out.println("2. 빼기");
			System.out.println("3. 곱하기");
			System.out.println("4. 나누기");
			System.out.println("5. 나머지");
			System.out.println("6. 종료");
			System.out.print("선택하세요 : ");
			int select = scan.nextInt();
			if(select == 6) {
				System.out.println("프로그램을 종료합니다. ");
				return;
			}
			else if(select <= 0 || select > 5) {
				System.out.println("다시 선택해주세요.");
			}
			else {
				System.out.print("첫 번째 정수를 입력하세요 : ");
				int num1 = scan.nextInt();
				System.out.print("두 번째 정수를 입력하세요 : ");
				int num2 = scan.nextInt();
				switch(select) {
				case 1: System.out.println("더한 값은 : "+plus(num1,num2));
					break;
				case 2: System.out.println("뺀 값은 : "+minus(num1,num2));
					break;
				case 3: System.out.println("곱한 값은 : "+multi(num1,num2));
					break;
				case 4: 
					if(num2 == 0) {
						System.out.println("두 번째 정수가 0입니다. 다시 입력해주세요.");
						break;
					}
					System.out.println("나눈 값은 : "+divide(num1,num2));
					break;
				case 5: System.out.println("나눈 나머지 값은 : "+rest(num1,num2));
					break;
				}
			}
			
		}
		
	
		
	}

}
