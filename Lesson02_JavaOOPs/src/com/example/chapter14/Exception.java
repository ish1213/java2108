package com.example.chapter14;

public class Exception {

	public static void main(String[] args) {
		int[] arr = new int[5];

		try {
			for(int i=0;i<=5;i++) {
				arr[i]=i+1;
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("^^...");
			System.out.println("예외처리를 했어요...");
			e.printStackTrace();
		}

		System.out.println("프로그램 종료");

	}

}
