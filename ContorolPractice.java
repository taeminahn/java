package kh.project1.test1;

import java.util.Scanner;

public class ContorolPractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		// 실습문제1
//		System.out.println("1. 입력");
//		System.out.println("2. 수정");
//		System.out.println("3. 조회");
//		System.out.println("4. 삭제");
//		System.out.println("7. 종료");
//		System.out.print("메뉴 번호를 입력하세요 ");
//		int num1 = scan.nextInt();
//		switch(num1) {
//		case 1 : System.out.println("입력 메뉴입니다.");
//			break;
//		case 2 : System.out.println("수정 메뉴입니다.");
//			break;
//		case 3 : System.out.println("조희 메뉴입니다.");
//			break;
//		case 4 : System.out.println("삭제 메뉴입니다.");
//			break;
//		case 7 : System.out.println("프로그램이 종료됩니다.");
//			break;
//		default : System.out.println("다시 선택해주세요.");
//		}
//		
//		// 실습문제2
//		System.out.print("숫자를 한 개 입력하세요  : ");
//		int num2 = scan.nextInt();
//		if(num2 < 0) {
//			System.out.println("양수만 입력해주세요.");
//		}
//		else if(num2 % 2 == 0) {
//			System.out.println("짝수다.");
//		}
//		else {
//			System.out.println("홀수만");
//		}
//		
//		// 실습문제3
//		System.out.print("국어점수 : ");
//		int a = scan.nextInt();
//		System.out.print("수학점수 : ");
//		int b = scan.nextInt();
//		System.out.print("영어점수 : ");
//		int c = scan.nextInt();
//		int sum = a+b+c;
//		float avr = (a+b+c)/3;
//		if(a >= 40 && b >= 40 && c >= 40 && avr >= 60) {
//			System.out.println("국어 : "+a);
//			System.out.println("수학 : "+b);
//			System.out.println("영어 : "+c);
//			System.out.println("합계 : "+sum);
//			System.out.println("평균 : "+avr);
//			System.out.println("축하합니다, 합격입니다!");
//		}
//		else {
//			System.out.println("불합격입니다.");
//		}
//		
//		// 실습문제4
//		System.out.print("1~12 사이의 정수 입력 : ");
//		int month = scan.nextInt();
//		switch(month) {
//		case 1:
//		case 2:
//		case 12: System.out.println(month+"월은 겨울입니다.");
//			break;
//		case 3:
//		case 4:
//		case 5: System.out.println(month+"월은 봄입니다.");
//			break;
//		case 6:
//		case 7:
//		case 8: System.out.println(month+"월은 여름입니다.");
//			break;
//		case 9:
//		case 10:
//		case 11: System.out.println(month+"월은 가을입니다.");
//			break;
//		default : System.out.println(month+"월은 잘못 입력된 달입니다.");
//		}
//		
//		// 실습문제5
//		String myId = "abc";
//		String myPw = "1234";
//		System.out.print("아이디 : ");
//		String id = scan.next();
//		System.out.print("비밀번호 : ");
//		String pw = scan.next();
//		if(myId.equals(id) && myPw.equals(pw)) {
//			System.out.println("로그인 성공.");
//		}
//		else if(myId.equals(id)) {
//			System.out.println("비밀번호가 틀렸습니다.");
//		}
//		else {
//			System.out.println("아이디가 틀렸습니다.");
//		}
//		
//		
//		// 실습문제6
//		System.out.print("권한을 확인하고자 하는 회원 등급  : ");
//		String grade = scan.next();
//		switch(grade) {
//		case "관리자" : System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
//			break;
//		case "회원" : System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
//			break;
//		case "비회원" : System.out.println("게시글 조회");
//			break;
//		default : System.out.println("다시 입력해주세요.");
//		}
//		
//		// 실습문제7
//		System.out.print("키(m)를 입력해 주세요 : ");
//		double height = scan.nextDouble();
//		System.out.print("몸무게(kg)를 입력해 주세요 : ");
//		double weight = scan.nextDouble();
//		double bmi = weight / (height * height);
//		System.out.println("BMI 지수 : "+bmi);
//		if(bmi >= 30) {
//			System.out.println("고도 비만");
//		}
//		else if(bmi >= 25) {
//			System.out.println("비만");
//		}
//		else if(bmi >= 23) {
//			System.out.println("과체중");
//		}
//		else if(bmi >= 18.5) {
//			System.out.println("정상체중");
//		}
//		else {
//			System.out.println("저체중");
//		}
//		
//		// 실습문제8
//		System.out.print("피연산자1 입력 : ");
//		int n1 = scan.nextInt();
//		System.out.print("피연산자2 입력 : ");
//		int n2 = scan.nextInt();
//		System.out.print("연산자를 입력 : ");
//		String op = scan.next();
//		float calc = 0;
//		switch(op) {
//		case "+" : calc = (n1+n2);
//			break;
//		case "-" : calc = (n1-n2);
//			break;
//		case "*" : calc = (n1*n2);
//			break;
//		case "/" : calc = ((float)n1/n2);
//			break;
//		case "%" : calc = (n1%n2);
//		}
//		System.out.printf("%d %s %d = %f\r", n1, op, n2, calc);
		
		// 실습문제9
		System.out.print("중간 고사 점수 : ");
		int score1 = scan.nextInt();
		System.out.print("기말 고사 점수 : ");
		int score2 = scan.nextInt();
		System.out.print("과제 점수 : ");
		int score3 = scan.nextInt();
		System.out.print("출석 회수 : ");
		int att = scan.nextInt();
		double avr1 = score1*0.2;
		double avr2 = score2*0.3;
		double avr3 = score3*0.3;
		double avrAtt = att*1.0;
		double totalAtt = (avrAtt/20)*100;
		double total = avr1+avr2+avr3+avrAtt;
		System.out.println("=============결과=============");
		if(totalAtt < 70) {
			System.out.println("Fail [출석 회수 부족 ("+att+"/20)]");
		}
		else {
			System.out.println("중간 고사 점수(20) : "+avr1);
			System.out.println("기말 고사 점수(30) : "+avr2);
			System.out.println("과제 점수		(30) : "+avr3);
			System.out.println("출석 점수		(20) : "+avrAtt);
			System.out.println("총점 : "+total);
			System.out.println(totalAtt);
			if(total < 70) {
				System.out.println("Fail [점수 미달]");
			}
			else {
				System.out.println("Pass");
			}
		}
	}

}
