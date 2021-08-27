package com.example.chapter04;

import java.util.Scanner;

public class CF_Scoring {

	public static void main(String[] args) {
		// 성적을 입력받아
		// 90이상이면 A등급을
		// 80이상이면 B등급을
		// 70이상이면 C등급을
		// 60이상이면 D등급을
		// 그외... F등급을

	    /*
	     * if(조건1) { }
	     * else if(조건2) { }
	     * else if(조건n) { }
	     * else { } 
	     */

		Scanner input = new Scanner(System.in);
		System.out.println("점수는?");
		int score = input.nextInt();

		if(score >= 90) {
			System.out.println("등급 A!!");
		}else if(score >= 80) {
			System.out.println("등급 B!!");
		}else if(score >= 70) {
			System.out.println("등급 C!!");
		}else if(score >= 60) {
			System.out.println("등급 D!!");
		}else {
			System.out.println("등급 F!!");
		}

	}

}
