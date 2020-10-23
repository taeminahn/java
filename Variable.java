package kh.project1.test1;

public class Variable {

	public static void main(String[] args) {
		// 변수 선언
		int num;
		// 변수 사용 - 값 대입
		num = 10;
		// 변수 사용 - 값 읽기
		System.out.println(num);	// 10
		
		num = 10+20;
		System.out.println(num);	// 30
		
		// 변수 선언 후 바로 값 대입(초기값)
		int num2 = 20;
		System.out.println(num);
		// 여러 개의 변수를 동시에 선언
		int num3, num4, num5;
		// 여러 개의 변수 동시에 선언 후 바로 값 대입(초기값)
		int num6, num7 = 40, num8 = 50;
		
		// 변수값을 다른 변수에 대입
		int num9 = 10;
		int num10 = num9;
		
		// 변수값을 이용해 연산 후 다시 대입
		int num11 = 100;
		System.out.println(num11);
		num11 = num11 + 1;
		System.out.println(num11);
		num11 = 100;
		System.out.println(num11);
		
		// 데이터 타입에 따른 변수 선언
		byte num01 = 100; // 1byte 크기의 정수형태 공간
		System.out.println("num01 변수 값 : " + num01); // 100
		short num02 = 10000; // 2byte 크기의 정수형태 공간
		System.out.println("num02 변수 값 : " + num02); // 10000
		int num03 = 10000000; // 4byte 크기의 정수형태 공간
		System.out.println("num03 변수 값 : " + num03); //10000000
		long num04 = 10000000000l;
		System.out.println("num04 변수 값 : " + num04);
		float num05 = (float)3.5; // 4byte 크기의 실수형태 공간(3.5f로 캐스팅해도 됨)		
		System.out.println("num05 변수 값 : " + num05); // 3.5
		double num06 = 12345.234;		  // 8byte 크기의 실수형태 공간
		System.out.println("num06 변수 값 : " + num06); // 12345.234
		char ch = '가'; // 2byte 크기의 단일문자형태 공간
		System.out.println("ch 변수 값 : " + ch); 		 // 가
		String str = "배부름~"; // 가변크기의 문자열형태 공간
		System.out.println("str 변수 값 : " + str);	 // 배부름~
		System.out.println("str 변수 값 : " + str.charAt(0)); // 특정위치 한글자 추출
		System.out.println("str 변수 값 : " + str.length());  // 문자 개수
		boolean bl = true;	// 1byte 크기의 논리형태 공간
		System.out.println("bl 변수 값 : " + bl);       // true
		bl = false;
		System.out.println("bl 변수 값 : " + bl);		 // false
		
		// 변수에 다른 형태 데이터 대입
//		int in1 = 3.5;  // 에러
		float fl1 = 5;  // 5.0
		System.out.println("fl1 변수 값 : " + fl1);
		double fl2 = 100; // 100.0
		System.out.println("fl2 변수 값 : " + fl2);
		int in2 = 'A';  //  65
		System.out.println("in2 변수 값 : " + in2);
		char ch1 = 65;  // A
		System.out.println("ch1 변수 값 : " + ch1);
		String str1 = ""+'A'+ '0'+1051479414; 
		System.out.println(str1);
		
		// 변수 사용 영역
		int var1 = 10;
		System.out.println(var1);  // 10 정상 출력
		{	// 새로운 블록
			int var2 = 20;
			System.out.println(var1);  // 10 정상 출력 
			System.out.println(var2);  // 20 정상 출력
		}
		//System.out.println(var2);  // 에러 발생
		
		// final 상수
		final int num100 = 101;
		System.out.println(num100);
		//num100 = 20;
		System.out.println(num100);
		final int num99;       // 이렇게 선언 후 초기화 시에는 한 번만 가능
		num99 = 102;
		System.out.println(num99);
		
		int number = 290;
		System.out.println((byte)number);
		
	}
}
