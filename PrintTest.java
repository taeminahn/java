package kh.project1.test1;


public class PrintTest {

	public static void main(String[] args) {
		int num1 = 10;
		double num2 = 3.5;
		
		// print()
		System.out.print(10);
		System.out.print(3.5);
		System.out.print("안녕하세요\n");
		
		// println()
		System.out.println(10);
		System.out.println(3.5);
		System.out.println("안녕하세요");
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(10+20);
		System.out.println("안녕하세요" + "집가야지!!");
		
		// printf("출력할 서식" [, 인자값...])
		System.out.printf("안녕하세요\t프린트에프\n");
		System.out.printf("\\\\벌써	시간이.....\n");
		System.out.printf("\\, \', \"\n");
		System.out.printf("%f\n", num2);
		String name = "안태민";
		int age = 27;
		System.out.printf("제 이름은 %s이고 나이는 %d살 입니다.\n", name, age);
		System.out.printf("제 이름은 "+name+ "이고 나이는 " +age+ "살 입니다.\n");
		System.out.printf("%d / %o / %x / %c \n", 65,65,65,65);
		
		String name2 = "홍길동";
		int age2 = 20;
		String tel = "010-1234-1234";
		System.out.printf("이름\t: %s\n", name2);
		System.out.printf("나이\t: %s\n", age2);
		System.out.printf("전화번호\t: %s\n", tel);
		System.out.println("금액은 \\35,000원 입니다 ");
		System.out.println("이것은 큰따옴표 \" 입니다 ");
	}
}
