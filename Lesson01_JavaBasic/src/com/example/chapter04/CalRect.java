package com.example.chapter04;

import java.util.Scanner;

public class CalRect {

	public static void main(String[] args) {
		// 가로, 세로를 입력받아 사각형의 넓이 계산

		// PSEUDO Code 의사코드 : 
		// 문제 해결의 과정을 일상의 언어를 이용하여 기술한 것.

		// 입력을 받기위한 스캐너 변수 생성
		Scanner in = new Scanner(System.in);

		// 가로입력하라는 메시지 출력
		System.out.println("가로의 길이는? ");
		// 가로를 입력받는다
		int width = in.nextInt();

		// 세로입력하라는 메시지 출력
		System.out.println("세로의 높이는? ");
		// 세로를 입력받는다
		int height = in.nextInt();

		// 넓이 = 가로 * 세로
		int area = width * height;

		// 계산된 넓이를 출력
		System.out.println(area);

		
	}

}
