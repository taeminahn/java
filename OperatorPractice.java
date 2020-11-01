package kh.project1.test1;

import java.util.Scanner;

public class OperatorPractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 실습문제1
		System.out.print("정수 : ");
		int num1 = scan.nextInt();
		System.out.println(num1>0 ? "양수다":"양수가 아니다");
		
	// 실습문제2
		System.out.print("정수 : ");
		int num2 = scan.nextInt();
		System.out.println(num2==0 ? "0이다":"음수다");
		
	// 실습문제3
		System.out.print("정수 : ");
		int num3 = scan.nextInt();
		System.out.println(num3%2==0 ? "짝수다":"홀수다");
	
	// 실습문제4
		System.out.print("인원 수 : ");
		int person = scan.nextInt();
		System.out.print("사탕 개수 : ");
		int candy = scan.nextInt();
		System.out.println("1인당 사탕 개수 : "+candy/person);
		System.out.println("남은 사탕 개수 : "+candy%person);
	
	// 실습문제5
	
		System.out.print("이름 : ");
		String name = scan.nextLine();
		System.out.print("학년(숫자만) : ");
		int grade = scan.nextInt();
		System.out.print("반(숫자만) : ");
		int group = scan.nextInt();
		System.out.print("번호(숫자만) : ");
		int number = scan.nextInt();
		System.out.print("성별(M/F) : ");
		char gender = scan.next().charAt(0);
		gender = gender == 'M' ? '남' : '여';
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		float score = scan.nextFloat();
		System.out.printf("%d학년 %d반 %d번 %s %s학생의 성적은 %.2f이다.\n",grade ,group, number, name, gender, score);
	
	// 실습문제6
	
		System.out.print("나이 : ");
		int age = scan.nextInt();
		System.out.println(age>19 ? "성인" : (age<=13 ? "어린이" : "청소년"));
	
	// 실습문제7
	
		System.out.print("국어 : ");
		int a = scan.nextInt();
		System.out.print("영어 : ");
		int b = scan.nextInt();
		System.out.print("수학 : ");
		int c = scan.nextInt();
		int sum = a+b+c;
		System.out.printf("합계 : %d\n", sum);
		System.out.printf("평균 : %.1f\n", (float)sum/3);
		System.out.println((a >= 40 && b >= 40 && c >= 40) && ((sum/3) >= 60) ? "합격" : "불합격");
	
	// 실습문제8
	
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		scan.skip("[\\r\\n]+");
		String rn = scan.nextLine();
		System.out.println(rn.charAt(7) == '1' ? "남자" : "여자");
	
	// 실습문제9
	
		System.out.print("정수1 : ");
		int n1 = scan.nextInt();
		System.out.print("정수2 : ");
		int n2 = scan.nextInt();
		System.out.print("입력 : ");
		int n3 = scan.nextInt();
		System.out.println(n3>=n1 && n3>n2 ? "true" : "false");
	
	// 실습문제10
	
		System.out.print("입력1 : ");
		int number1 = scan.nextInt();
		System.out.print("입력2 : ");
		int number2 = scan.nextInt();
		System.out.print("입력3 : ");
		int number3 = scan.nextInt();
		System.out.println(number1 == number2 && number2 == number3 ? "true" : "false");
	
	// 실습문제11
	
		System.out.print("A사원의 연봉 : ");
		int money1 = scan.nextInt();
		System.out.print("B사원의 연봉 : ");
		int money2 = scan.nextInt();
		System.out.print("C사원의 연봉 : ");
		int money3 = scan.nextInt();
		double incen1 = money1 + (money1*0.4);
		double incen2 = money2 + (money2*0.0);
		double incen3 = money3 + (money3*0.15);			
		System.out.println("A사원 연봉/연봉+a : "+ money1 + "/" + incen1);
		System.out.println(incen1 >= 3000 ? "3000 이상" : "3000 미만");
		System.out.println("B사원 연봉/연봉+a : "+ money2 + "/" + incen2);
		System.out.println(incen2 >= 3000 ? "3000 이상" : "3000 미만");
		System.out.println("C사원 연봉/연봉+a : "+ money3 + "/" + incen3);
		System.out.println(incen3 >= 3000 ? "3000 이상" : "3000 미만");
	}

}
