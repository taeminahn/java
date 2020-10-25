package kh.project1.test1;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 실습문제 1
		System.out.print("이름을 입력하세요 : ");
		String name = scan.next();
		System.out.print("성별을 입력하세요(남/여) : ");
		char s = scan.next().charAt(0);
		System.out.print("나이를 입력하세요 : ");
		int age = scan.nextInt();
		System.out.print("키을 입력하세요(cm) : ");
		float height = scan.nextFloat();
		System.out.printf("키 %.1fcm인 %d살 %s자 %s님 반갑습니다^^\n", height, age, s, name);
		
		// 실습문제2
		System.out.print("첫 번째 정수 : ");
		int num1 = scan.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = scan.nextInt();
		System.out.printf("더하기 결과 : %d\n",(num1+num2));
		System.out.printf("빼기 결과 : %d\n",(num1-num2));
		System.out.printf("곱하기 결과 : %d\n",(num1*num2));
		System.out.printf("나누기 결과 : %d\n",(num1/num2));
		
		// 실습문제3
		System.out.print("가로 : ");
		float x = scan.nextFloat();
		System.out.print("세로 : ");
		float y = scan.nextFloat();
//		System.out.println("면적 : "+(x*y));
//		System.out.println("둘레 : "+((x+y)*2));
		System.out.printf("면적 : %.2f\n",(x*y));
		System.out.printf("둘레 : %.1f\n",((x+y)*2));
		
		// 실습문제4
		System.out.print("문자열을 입력하세요 : ");
		scan.skip("[\\r\\n]+");
		String a = scan.nextLine();
		System.out.printf("첫 번째 문자 : %s\n", a.charAt(0));
		System.out.printf("두 번째 문자 : %s\n", a.charAt(1));
		System.out.printf("세 번째 문자 : %s\n", a.charAt(2));
	}

}
