package kh.project1.test1;

public class TestClass {
		
	public static void main(String[] args) {
		System.out.println(10); 		// 정수
		System.out.println(3.5); 		// 실수
		System.out.println('A'); 		// 단일문자
		System.out.println("Hello");	// 문자열
		System.out.println(10+30);		// 정수연산
		System.out.println(5.5+3.5);	// 실수연산
		System.out.println(10+3.5);     // 정수 + 실수 연산
		System.out.println('A'+'B');	/* 단일문자연산 = 정수형
											으로 바뀌어 아스키코드로
											표현됨*/
		System.out.println(10+'A');		/* 정수+단일문자 연산
											= 위와 동일*/
		System.out.println("Hello"+"Bye");// 문자열 연산 = 문자열로 표현
		System.out.println("Hello"+'A'); // 문자열+단일문자 = 문자열 표현
		System.out.println("Hello"+20);  // 문자열+정수 = 문자열 표현
		System.out.println("Hello"+3.5); // 문자열+실수 = 문자열 표현
										//문자열과 연산하면 무조건 문자열로 표현
		System.out.println(0b101);      //2진수 → 10진수 / 2진수 앞에 0b붙임
		System.out.println(256);		//10진수
		System.out.println(0256);		//10진수 → 8진수 / 10진수 앞에 0붙임
		System.out.println(0x256);		//10진수 → 16진수 / 10진수 앞에 0x붙임
		
	}
}
