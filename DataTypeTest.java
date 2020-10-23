package kh.project1.test1;

public class DataTypeTest {

	public static void main(String[] args) {
		// 01000001
		System.out.println(0b01000001);
		System.out.println((double)0b01000001);
		System.out.println((char)0b01000001);
		
		// 정수
		System.out.println(100);    //데이터 형태를 보고 정수로 판단
		System.out.println(3.5);    //데이터 형태를 보고 정수로 판단
		System.out.println((int)3.5); //실수를 정수로 바꿔서 표현
		System.out.println('A');      //데이터 형태를 보고 단일문자로 판단
		System.out.println((int)'A'); //단일문자를 정수로 바꿔서 표현
		System.out.println();
		//실수
		System.out.println(5.6);    //데이터 형태를 보고 실수로 판단
		System.out.println(20);    //데이터 형태를 보고 정수로 판단
		System.out.println((double)20); //정수를 실수로 바꿔서 표현
		System.out.println('C');      //데이터 형태를 보고 단일문자로 판단
		System.out.println((double)'C'); // 단일문자를 실수로 바꿔서 표현
		System.out.println();
		//단일문자
		System.out.println('J');    //데이터 형태를 보고 단일문자로 판단
		System.out.println(100);    //데이터 형태를 보고 정수로 판단
		System.out.println((char)100); //정수를 단일문자로 바꿔서 표현
		System.out.println(65.6);    // 데이터 형태를 보고 실수로 판단
		System.out.println((char)65.6);
		System.out.println();
		// 실수를 단일문자로 바꿔서 표현(소수점 뒤자리 버림)
		System.out.println((char)0xC548); //안
		System.out.println((char)0xD0DC); //태
		System.out.println((char)0xBBFC); //민
		System.out.println();
		//문자열
		System.out.println("Hello"); //데이터 형태를 보고 문자열로 판단
		System.out.println();
		//논리형(Boolean)
		System.out.println(true);	 //데이터 형태를 보고 Boolean형으로 판단
		System.out.println(false);	 //데이터 형태를 보고 Boolean형으로 판단
		System.out.println();
		//자료형 크기 알아보기(bit단위)
		//자료형.SIZE
		//String, Boolean은 안됨
		//int = Integer , char = Character , 나머지는 자료형 첫 글자만 대문자로
		System.out.println(Byte.SIZE);
		System.out.println(Short.SIZE);
		System.out.println(Integer.SIZE);
		System.out.println(Long.SIZE);
		System.out.println(Float.SIZE);
		System.out.println(Double.SIZE);
		System.out.println(Character.SIZE);
		char ch = '{';
		System.out.println(ch);
	}

}
