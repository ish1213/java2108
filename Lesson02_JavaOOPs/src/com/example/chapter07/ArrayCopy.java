package com.example.chapter07;

public class ArrayCopy {

	public static void main(String[] args) {
		// 배열의 복사
		int[] array1 = {10, 20, 30, 40, 50};
		int[] array2 = {1, 2, 3, 4, 5};
		
		System.arraycopy(array1, 2, array2, 0, 3);
		for(int i = 0; i < array1.length; i++) {
			System.out.println(array2[i]);
		}

	}

}
