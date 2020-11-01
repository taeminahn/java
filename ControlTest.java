package kh.project1.test1;

import java.util.Scanner;

public class ControlTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
		// if-else문 1
//		if(num > 0) {
//			System.out.println("양수입니다.");
//			System.out.println("조건이 참입니다.");
//		}
//		else {
//			System.out.println("양수가 아닙니다.");
//		}
		
		// if-else문 2
//		if(num % 2 == 0) {
//			System.out.println("짝수");
//		}
//		else {
//			System.out.println("홀수");
//		}
		
		// if-else if-else문1
//		if(num > 0) {
//			System.out.println("0보다 큰 수");
//		} 
//		else if(num < 0) {
//			System.out.println("0보다 작은 수");
//		}
//		else {
//			System.out.println("0과 같은 수");
//		}
		
		// if-else if-else문2
//		if (num == 0) {
//			System.out.println("0입니다.");
//		}
//		else if(num % 2 ==1) {
//			System.out.println("홀수입니다.");
//		}
//		else {
//			System.out.println("짝수입니다.");
//		}
		
		// if-else if-else문3
//		if (num % 2 == 0 && num != 0) {
//			System.out.println("짝수입니다.");
//		}
//		else if(num % 2 ==1) {
//			System.out.println("홀수입니다.");
//		}
//		else {
//			System.out.println("0입니다.");
//		}
		
		//if-else문 3 (if안에 또 if를 썼을 경우)
//		if (num % 2 == 0) {
//			if(num == 0) {
//				System.out.println("0입니다.");
//			}
//			else {
//				System.out.println("짝수입니다.");
//			}
//		}
//		else {
//			System.out.println("홀수입니다.");
//		}
		
		// if-else if-else문4
//		System.out.print("월 입력 : ");
//		int month = scan.nextInt();
//		String season;
//		if(month == 1 || month == 2 || month == 12) {
//			season = "겨울";
//		}
//		else if(month >= 3 && month <= 5) {
//			season = "봄";
//		}
//		else if(month >= 6 && month <= 8) {
//			season = "여름";
//		}
//		else if(month >= 9 && month <= 11) {
//			season = "가을";
//		}
//		else {
//			season = "해당하는 계절이 없습니다.";
//		}
//		System.out.println(season);
//		System.out.println("프로그램 종료");
		
		// if-else if-else문5 (위 예제문에 month 변수와 season 변수 있음)
//		System.out.print("온도 입력: ");
//		int temperature = scan.nextInt();
//		if(month == 1 || month == 2 || month == 12) {
//			season = "겨울";
//			if(temperature <= -15) {
//				season += "(한파 경보)";
//			}
//			else if(temperature <= -12) {
//				season += "(한파 주의보)";
//			}
//		}
//		else if(month >= 3 && month <= 5) {
//			season = "봄";
//		}
//		else if(month >= 6 && month <= 8) {
//			season = "여름";
//			if(temperature >= 35) {
//				season += "(폭염 경보)";
//			}
//			else if(temperature >= 33) {
//				season += "(폭염 주의보)";
//			}
//		}
//		else if(month >= 9 && month <= 11) {
//			season = "가을";
//		}
//		else {
//			season = "해당하는 계절이 없습니다.";
//		}
//		System.out.println(season);
//		System.out.println("프로그램 종료합니다.");
		
		
		// if문 놀이 공원 프로그램 만들기
//		System.out.println("##놀이 공원 프로그램##");
//		System.out.print("입장 하실 인원은 총 몇 명 입니까? ");
//		int people = scan.nextInt();
//		int money = 0; int a = 0; int b = 0;
//		if(people > 0) {
//			System.out.print("어른은 몇 명입니까? (인원당 1만5천원) ");
//			a = scan.nextInt();
//			money += a*15000;
//				if(people == a) {
//					System.out.println("지불하실 총 금액은 "+money+"원 입니다.");
//				}
//				else if(people - a > 0 && a > 0) {
//					System.out.print("아이는 몇 명입니까? (인원당 5천원) ");
//					b = scan.nextInt();
//					if(people - a == b) {
//						money += b*5000;
//						System.out.println("지불하실 총 금액은 "+money+"원 입니다.");
//					}
//					else {
//						System.out.println("인원 수를 다시 확인해주세요.");
//					}
//					
//				}
//				else {
//					System.out.println("인원 수를 다시 확인해주세요.");
//				}
//		}	
//		else {
//			System.out.println("인원 수를 다시 확인해주세요.");
//		}
		
		// if문 계산기 만들기
//		System.out.println("##계산기##");
//		System.out.println("1.더하기");
//		System.out.println("2.빼기");
//		System.out.println("3.나누기");
//		System.out.println("4.곱하기");
//		System.out.print("선택 : ");
//		int select = scan.nextInt();
//		if(select > 0 && select <= 4) {
//			System.out.print("첫 번째 숫자를 입력해주세요. ");
//			int a = scan.nextInt();
//			System.out.print("두 번째 숫자를 입력해주세요. ");
//			int b = scan.nextInt();
//			if(select == 1) {
//				System.out.println("값은 "+(a+b)+"입니다.");
//			}
//			else if(select == 2) {
//				System.out.println("값은 "+(a-b)+"입니다.");
//			}
//			else if(select == 3) {
//				if(b == 0) {
//					System.out.println("두 번째 숫자가 0입니다.");
//				}
//				else {
//				System.out.println("값은 "+((double)a/b)+"입니다.");
//				}
//			}
//			else if(select == 4) {
//				System.out.println("값은 "+(a*b)+"입니다.");
//			}
//		}
//		else {
//			System.out.println("다시 선택해주세요.");
//		}
		
		// switch문1
//		System.out.print("정수를 입력하세요 : ");
//		int select = scan.nextInt();
//		switch(select) {
//		case 1 : System.out.println("1 입력");
//				break;
//		case 2 : System.out.println("2 입력");
//				break;
//		case 3 : System.out.println("3 입력");
//				break;
//		case 4 : System.out.println("4 입력");
//				break;
//		default : System.out.println("기타입력");
		
		// switch문2
//		System.out.print("정수를 입력하세요 : ");
//		int select = scan.nextInt();
//		switch(select/10) {
//		case 0 : System.out.println("0~9 입력");
//			break;
//		case 1 : System.out.println("10~19 입력");
//			break;
//		case 2 : System.out.println("20~29 입력");
//			break;
//		case 3 : System.out.println("30~39 입력");
//			break;
//		case 4 : System.out.println("40~49 입력");
//			break;
//		default : System.out.println("기타입력");
//		}
		
		// switch문3
//		System.out.print("이름을 입력하세요 : ");
//		String select = scan.next();
//		switch(select) 
//		{
//		case "이은지" :
//		case "김우영" : System.out.println("1팀입니다.");
//			break;
//		case "최민재" :
//		case "홍정은" :
//		case "안태민" : System.out.println("2팀입니다.");
//			break;
//		default : System.out.println("기타입력");
//		}
		
		// switch문4
//		String team;
//		System.out.print("조를 입력해주세요. ");
//		int num = scan.nextInt();
//		switch(num % 5) {
//		case 1 : team = "1조";
//			break;
//		case 2 : team = "2조";
//			break;
//		case 3 : team = "3조";
//			break;
//		case 4 : team = "4조";
//			break;
//		default : team = "다시";
//		}
//		System.out.println(team);
	
		// switch문5
//		System.out.println("## 계산기 ##");
//		System.out.println("1.더하기");
//		System.out.println("2.빼기");
//		System.out.println("3.나누기");
//		System.out.println("4.곱하기");
//		System.out.print("선택 : ");
//		int select = scan.nextInt();
//		if(select <= 0 || select > 4) {
//			System.out.println("다시 입력하세요.");
//		}
//		else {
//			System.out.print("첫 번째 숫자를 입력해주세요. ");
//			int a = scan.nextInt();
//			System.out.print("두 번째 숫자를 입력해주세요. ");
//			int b = scan.nextInt();
//			switch(select) {
//			case 1 : System.out.println("값은 "+(a+b)+" 입니다.");
//				break;
//			case 2 : System.out.println("값은 "+(a-b)+" 입니다.");
//				break;
//			case 3 : 
//				if(b == 0) {
//					System.out.println("두 번째 숫자가 0입니다. 다시 입력하세요.");
//					break;
//				}
//				else {
//					System.out.println("값은 "+(double)a/b+" 입니다.");
//				}
//				break;
//			case 4 : System.out.println("값은 "+(a*b)+" 입니다.");
//				break;
//			}
//		
//		}
		
		System.out.print("아이디 : ");
		String id = scan.next();
		System.out.print("비밀번호 : ");
		String pw = scan.next();
		switch(id) {
		case "abc" :
			switch(pw) {
			case "123" : System.out.println("로그인 성공");
				break;
			default : System.out.println("비밀번호가 틀렸습니다.");
				break;
			}
			break;
		default : System.out.println("아이디가 틀렸습니다.");
		}
		
	}
}

