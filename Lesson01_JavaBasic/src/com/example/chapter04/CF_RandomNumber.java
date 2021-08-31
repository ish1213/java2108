package com.example.chapter04;

public class CF_RandomNumber {

	public static void main(String[] args) {
		// random number 생성하기
		// Math 클래스의 random() 함수를 사용한다.
		// random()함수는 0 ~ 1미만의 실수형태로 난수를 발생시킨다.
//		double rnumber = Math.random() * 10;
		// 0 ~ 9까지의 임의의 정수형 숫자를 생성한다.
//		int rnumber = (int)(Math.random() * 10);
		int rnumber = (int)(Math.random() * 1000) % 45 + 1;
		System.out.println(rnumber);

	}

}