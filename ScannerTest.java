package kh.project1.test1;
// Scanner Class 포함
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// Scanner 생성
		Scanner scan = new Scanner(System.in);
		// 정수 입력받기
//		System.out.print("정수를 입력하세요: ");
//		int num1;
//		num1 = scan.nextInt();
//		System.out.println("입력값 :" + num1);
//		
//		// 실수 입력받기
//		System.out.print("실수를 입력하세요: ");
//		float num2;
//		num2 = scan.nextFloat();
//		System.out.println("입력값 :" + num2);
//		
//		System.out.print("실수(double)를 입력하세요: ");
//		double num3;
//		num3 = scan.nextDouble();
//		System.out.println("입력값 :" + num3);
//	
//		// 문자열 입력
//		System.out.print("문자열를 입력하세요: ");
//		String str1;
//		str1 = scan.next();
//		System.out.println("입력값 :" + str1);
//		
//		System.out.print("문자열를 입력하세요: ");
//		String str2;
//		//scan.skip("[\\r\\n]+"); //이걸 넣어도 됨(엔터값 없애주는 기능)
//								  // \r 줄의 가장 앞으로 커서 이동
//		                          // \n 줄의 다음 줄로 커서 이동
//								  // "[]+" 는 skip의 문법
//		scan.nextLine();     // 엔터값이 남아있는 걸 다시 초기화해줌
//		str2 = scan.nextLine(); //nextLine은 엔터도 인식해서 버퍼에 남지 않음
//		System.out.println("입력값 :" + str2); //다른 next들은 엔터값을 버퍼에 남김
		

		System.out.print("이름 : ");
		String name = scan.next();
		
		System.out.print("나이 : ");
		int age = scan.nextInt();
		
		System.out.print("전화번호 : ");
		scan.skip("[\\r\\n]+");
		String tel = scan.nextLine();
		
		System.out.printf("제 이름은 %s이고, 나이는 %d살이고, 전화번호는 %s 입니다.\n", name, age, tel);
		
	}

}
