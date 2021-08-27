package com.example.chapter04;

import java.util.Scanner;

public class CalcCircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner 입력변수 선언
		final double PI = 3.141592; // constant상수선언
		Scanner read = new Scanner(System.in);

		// 반지름 입력하라는 메시지 출력
		System.out.println("반지름은? ");
		// 반지름 입력받고
		int r = read.nextInt();

		// 원의 면적 계산 : 반지름 * 반지름 * 3.14
		double area = r * r * PI;

		// 계산된 원의 면적 출력
		System.out.printf("%10.4f",area);

	}

}
