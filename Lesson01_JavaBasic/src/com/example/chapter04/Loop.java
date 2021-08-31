package com.example.chapter04;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		// Iterative / Loop 반복문
		
		// for 문을 이용한 반복구문
//		for(int cnt = 1; cnt <= 10; cnt=cnt+3) {
//			System.out.println("안녕하세요");
//		}
		/*
		for(제어변수초기식;반복종료 조건식;제어변수증감식){
		    반복할 코드블록;
		}
		*/
		// 1부터 10까지의 숫자를 출력하는 프로그램
//		for(int number = 1; number <= 10; number++) {
//			System.out.println(number);
//		}
		
		// 1부터 10까지의 합계를 구하세요.
//		int sum = 0;
//		for(int number=1; number <= 10; number++) {
//			sum += number;  // sum = sum + number
//		}
//		System.out.println("1부터 10까지의 합 :" + sum);
		
		// while 루프 제어
//		int sum = 0;
//		int number = 1;
//		while(number <= 10) {
//			sum += number;
//			number++;
//		}
//		System.out.println("1부터 10까지의 합 : " + sum);
		
		// while 루프 variation 변형
	    // do{   }while();
		Scanner input = new Scanner(System.in);
		int jobNumber = 999;
		do {
			System.out.println("1.자료삽입");
			System.out.println("2.자료조회");
			System.out.println("3.자료수정");
			System.out.println("4.자료삭제");
			System.out.println("0.프로그램종료");
			
			System.out.println("작업을 선택하세요.");
			jobNumber = input.nextInt();
			System.out.println("작업번호 : " + jobNumber);
			
		}while(jobNumber != 0);
		
		System.out.println("프로그램 종료...");

	} // end of main

} // end of class