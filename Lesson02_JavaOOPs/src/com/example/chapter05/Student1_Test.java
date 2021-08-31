package com.example.chapter05;

public class Student1_Test {

	public static void main(String[] args) {
		// Student1 클래스를 이용하여 객체 생성
		// 객체 생성 :
		// new 클래스생성자( );
		// student1 클래스의 객체를 하나 생성하라.
		// 객체참조변수
		Student1 hong = new Student1(); // 클래스생성자 : 클래스이름()
		// System.out.println(hong);
		hong.setStudentName("홍길동");
		hong.setGrade(1);
		hong.setAddress("청주시 청원구");
		hong.setStudentID(1001);
		
		System.out.println(hong.getStudentID());
		hong.showStudentInfo();
		
		
		System.out.println("================");
		Student1 park = new Student1(2021, "박문수", 1, "청주시 흥덕구");
		park.showStudentInfo();
		
//		Student1 lim = new Student1();
//		lim.studentName = "임소희";
//		lim.address = "청주시 흥덕구";
//		lim.showStudentInfo();
		

	}

}
