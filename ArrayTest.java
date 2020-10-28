package kh.project1.test1;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 배열1
//		int[] arr = new int[5];
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		// 초기값 : boolean - false, char : \u0000
		// 정수형 : 0, 실수형 : 0.0, 참조형 : null
		
		
		// 배열2(for문으로 배열안에 값 넣기)
//		int[] arr = new int[5];
//		for(int i = 0; i < 5; i++) {
//			arr[i] = (i+1)*10;
//		}
//		for(int i = 0; i < 5; i++){
//			System.out.println(arr[i]);
//		}
		
		// 배열3(for문으로 배열안의 공간 개수를 이용(length)하여 값 넣기)
//		int[] arr = new int[100];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = (i+1)*10;
//		}
//		for(int i = 0; i < arr.length; i++){
//			System.out.println(arr[i]);
//		}
		
		// 배열4(C강의장의 학생들 이름 입력하기)
//		String[] cClass = new String[5];
//		for(int i = 0; i < cClass.length; i++) {
//			cClass[i] = scan.next();
//		}
//		System.out.println("## C강의장 학생 목록 ##");
//		for(int i = 0; i < cClass.length; i++) {
//			System.out.println("이름 : "+cClass[i]);
//		}
		
		// 배열 예제
//		int[] arr = new int[5];
//		int sum = 0;
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print((i+1)+"번째 수 입력 : ");
//			arr[i] = scan.nextInt();
//		}
//		for(int i = 0; i < arr.length; i++) {
//			if(arr.length-1 == i) {
//				System.out.print(arr[i]+" = ");
//			}
//			else {
//				System.out.print(arr[i]+" + ");
//			}
//			sum += arr[i];
//		}
//		System.out.print(sum);
		

		// 로또(중복o, 정렬x)
//		실수형태의 랜덤값 추출(0.0 <= 랜덤값 < 1.0)
//		(형변환)(Math.random()*개수+시작수)
//		System.out.println(Math.random());
//		System.out.println((int)(Math.random()*45+1));
//		int[] lotto = new int[7];
//		System.out.println("### 로또 번호 생성기 ###");
//		System.out.print("생성할 번호 개수 : ");
//		int num = scan.nextInt();
//		for(int j = 1; j <= num; j++) {
//			System.out.print(j+"번째 생성 번호 : ");
//			for(int i = 0; i < 7; i++) {
//				lotto[i] = (int)(Math.random()*45+1);
//			}
//			for(int k = 0; k < 7; k++) {
//				System.out.printf("%02d ",lotto[k]);
//			}
//			System.out.println();
//		}
		
		
		// 로또(중복x, 정렬x)
//		int[] lotto = new int[7];
//		System.out.println("### 로또 번호 생성기 ###");
//		System.out.print("생성할 번호 개수 : ");
//		int num = scan.nextInt();
//		for(int j = 1; j <= num; j++) {
//			System.out.print(j+"번째 생성 번호 : ");
//			for(int i = 0; i < 7; i++) {
//				lotto[i] = (int)(Math.random()*7+1);
//				if(i == 0) {
//					continue;
//				}
//				else {
//					for(int m = 0; m < i; m++ ) {
//						if(lotto[i] == lotto[m]) {
//							i--;
//							continue;
//						}
//					}
//				}
//			}
//			for(int k = 0; k < 7; k++) {
//				System.out.printf("%02d ",lotto[k]);
//			}
//			System.out.println();
//		}
		
		// 로또(중복x, 정렬o)
		int tmp = 0;
		int[] lotto = new int[7];
		System.out.println("### 로또 번호 생성기 ###");
		System.out.print("생성할 번호 개수 : ");
		int num = scan.nextInt();
		for(int j = 1; j <= num; j++) {
			System.out.print(j+"번째 생성 번호 : ");
			for(int i = 0; i < 7; i++) {
				lotto[i] = (int)(Math.random()*45+1);
				if(i == 0) {
					continue;
				}
				else {
					for(int m = 0; m < i; m++ ) {
						if(lotto[i] == lotto[m]) {
							i--;
							continue;
						}
					}
				}
			}
			for(int i = 0; i < 7; i++) {
				for(int m = 1+i; m < 7; m++) {
					if(lotto[i] > lotto[m]) {
						tmp = lotto[i];
						lotto[i] = lotto[m];
						lotto[m] = tmp;
						continue;
					}
				}
			}
			for(int k = 0; k < 7; k++) {
				System.out.printf("%02d ",lotto[k]);
			}
			System.out.println();
		}
		
//		if( arr[0]) > arr[1]) {
//		   tmp = arr[o];
//		   arr[1] = tmp;
	
	}
}
