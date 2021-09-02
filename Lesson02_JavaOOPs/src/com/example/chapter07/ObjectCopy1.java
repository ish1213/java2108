package com.example.chapter07;

public class ObjectCopy1 {

	public static void main(String[] args) {
		// 참조변수객체 배열의 복사
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		// 원본 bookArray1 초기화
		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("데미안", "헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
		
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		//System.arraycopy(bookArray1, 0 ,bookArray2, 0, 3);
		
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
		// 사본 bookArray2의 내용 확인
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showInfo();
		}
		
		// 원본 bookArray1 내용 갱신
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		System.out.println("=====================");
		// 사본 bookArray2의 내용 확인
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showInfo();
		}
		
		System.out.println("두 배열 확인");
		for(int i=0; i<bookArray1.length; i++) {
			System.out.println(bookArray1[i] + " : " + bookArray2[i]);
		}

	}

}
