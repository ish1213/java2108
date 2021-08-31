package com.example.chapter04;

import java.util.Scanner;

public class CF_SwitchCase {

	public static void main(String[] args) {
		// 성적을 입력받아
				// 90이상이면 A등급을
				// 80이상이면 B등급을
				// 70이상이면 C등급을
				// 60이상이면 D등급을
				// 그외... F등급을
				
			    /*
			     * switch( 식 ) {
			     *   case 90~100:
			     *        등급 A
			     *        break; 
			     *   case 80 ~ 89:
			     *   ... 
			     *   default:
			     *      F
			     * } 
			     */
				
				Scanner input = new Scanner(System.in);
				System.out.println("점수는? ");
				int score = input.nextInt();
				
				switch (score / 10) {
				case 10:
				case 9: 
					System.out.println("등급 A!!");
					break;
				case 8:
					System.out.println("등급 B!!");
					break;
				case 7:
					System.out.println("등급 C!!");
					break;
				case 6:
					System.out.println("등급 D!!");
					break;
				default :
					System.out.println("등급 F!!");
					break;
				} // end of switch
				
			    System.out.println("프로그램 종료");

	} //end of main

} //end of class