package com.example.chapter04;

import java.util.Scanner;

public class CF_OddEven {

	public static void main(String[] args) {
		// 입력받은 숫자를 홀수인지 짝수인지 판단 출력
		
		// 스캐너 입력변수 준비
		Scanner input = new Scanner(System.in);
		// 입력 메시지 출력
		System.out.println("임의 숫자를 입력하세요. ");
		// 숫자 입력
		int number = input.nextInt();
		// 입력된 숫자가 짝수이면 짝수라고 출력
		if(number % 2 == 0 ) {
			System.out.println("짝수");
		}else { // 아니면 홀수라고 출력
			System.out.println("홀수");
		}

		input.close();  // 스캐너 자원 반납

		System.out.println("프로그램 종료");

		
	} // end of main

} // end of class
