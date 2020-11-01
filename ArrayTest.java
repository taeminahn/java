package kh.project1.test1;

import java.util.Arrays;
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
//			for(int i = 0; i < lotto.length; i++) {
//				lotto[i] = (int)(Math.random()*45+1);
//			}
//			for(int k = 0; k < lotto.length; k++) {
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
//			for(int i = 0; i < lotto.length; i++) {
//				lotto[i] = (int)(Math.random()*45+1);
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
//			for(int k = 0; k < lotto.length; k++) {
//				System.out.printf("%02d ",lotto[k]);
//			}
//			System.out.println();
//		}
		
		// 로또(중복x, 정렬o)
//		int tmp = 0;
//		int[] lotto = new int[7];
//		System.out.println("### 로또 번호 생성기 ###");
//		System.out.print("생성할 번호 개수 : ");
//		int num = scan.nextInt();
//		for(int j = 1; j <= num; j++) {
//			System.out.print(j+"번째 생성 번호 : ");
//			for(int i = 0; i < lotto.length; i++) {
//				lotto[i] = (int)(Math.random()*45+1);
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
//			for(int i = 0; i < lotto.length; i++) {
//				for(int m = 1+i; m < 7; m++) {
//					if(lotto[i] > lotto[m]) {
//						tmp = lotto[i];
//						lotto[i] = lotto[m];
//						lotto[m] = tmp;
//						continue;
//					}
//				}
//			}
//			for(int k = 0; k < lotto.length; k++) {
//				System.out.printf("%02d ",lotto[k]);
//			}
//			System.out.println();
//		}
		
		// 배열 선언
//		String[] studentName; // 메모리의 주소를 저정하는 참조변수 생성(Stack 영역)
//		// 배열 할당 - 데이터 저장공간 생성
////	studentName = new String[10]; 
////	// 실제 데이터를 저장하는 변 수공간 생성 후 주소를 참조변수에 저장(Heap 영역)
		
//		System.out.print("학생이 몇명입니까? ");
//		int count = scan.nextInt();
//		studentName = new String[count];
//		
//		for(int i = 0; i < studentName.length; i++) {
//			System.out.print(i+1+"번째 학생 이름 : ");
//			studentName[i] = scan.next();
//		}
//		System.out.println("## 학생 목룍 ##");
//		for(int j = 0; j < studentName.length; j++) {
//			System.out.println(j+1+"번째 학생 이름 : "+studentName[j]);
//		}
		
		// 배열 얕은 복사
//		int[] arr1 = new int[] {10,20,30,40,50};
//		int[] arr2 = arr1;
//		
//		arr1[0] = 100;
//		
//		System.out.println("arr1 주소 : "+arr1);
//		for(int i = 0; i < arr1.length; i++) {
//			System.out.println(arr1[i]+" ");
//		}
//		System.out.println();
//		System.out.println("arr2 주소 : "+arr2);
//		for(int i = 0; i < arr2.length; i++) {
//			System.out.println(arr2[i]+" ");
//		}
		
		// 배열 깊은 복사
//		int[] arr1 = new int[] {10,20,30,40,50};
//		int[] arr2 = new int[5];
		
		// 방법 1
//		for(int i = 2; i < arr1.length; i++) {
//			arr2[i] = arr1[i];
//		}
		
		// 방법 2
		//System.arraycopy(원본배열, 원본 시작위치, 목적지 배열, 목적지 시작위치, 복사할 길이);
//		// 전체 데이터 복사
//		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
//		// 특정 데이터 복사
//		System.arraycopy(arr1, 3, arr2, 0, arr1.length-3);
		
		// 방법 3
		//Arrays.copyOf(원본배열, 복사할 길이);
//		// 전체 데이터 복사
//		arr2 = Arrays.copyOf(arr1, arr1.length);
//		// 특정 데이터 복사
//		arr2 = Arrays.copyOf(arr1, 3);
		//Arrays.copyOf(원본배열, 시작위치, 끝위치+1);
//		// 특정 데이터 복사
//		arr2 = Arrays.copyOfRange(arr1, 3, arr1.length);
		
		// 방법 4
//		arr2 = arr1.clone();
		
		// 방법 확인 프로그램
//		System.out.println("arr1 주소 : "+arr1);
//		for(int i = 0; i < arr1.length; i++) {
//			System.out.println(arr1[i]+" ");
//		}
//		System.out.println();
//		System.out.println("arr2 주소 : "+arr2);
//		for(int i = 0; i < arr2.length; i++) {
//			System.out.println(arr2[i]+" ");
//		}
		
		// 2차원 배열 선언 방법
//		int[][] arr1;
//		int arr2[][];
//		int[] arr3[];
//		
//		// 2차원 배열 할당
//		arr1 = new int[3][5];
//		arr2 = new int[3][]; // 1차원 배열 먼저 확인하기때문에 1차원 배열만 할당 가능
////		arr2 = new int[][3]; // 이건 오류뜸
//		
//		// 각각의 1차원 배열의 길이가 같지 않아도 됨
//		arr2[0] = new int[5];
//		arr2[1] = new int[3];
//		arr2[2] = new int[10];
//		
//		// 1차원 배열 = 3개 생성
//		//1차원 배열의 0 번째 = 5개, 1차원 배열의 2번째 = 3개, 1차원 배열의 3번째 = 4개
//		arr3 = new int[][] {{10,20,30,40,50}, {10,20,30}, {10,20,30,40}};
		
		// 2차원 배열
		int[][] arr = new int[2][4];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (j+1)*10;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		
		
	}
}
