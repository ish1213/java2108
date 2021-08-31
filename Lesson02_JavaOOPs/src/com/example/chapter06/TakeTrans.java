package com.example.chapter06;

public class TakeTrans {

	public static void main(String[] args) {
		// 학생이 버스를 타는 실 세계를 표현

//		Student.classmoney = 100000;

		// 길동, 춘향 객체 생성
//		Student hong = new Student("홍길동", 10000);
//		Student chun = new Student("성춘향", 50000);
		School mySchool = School.getInatence();
		School yourSchool = School.getInatence();
		School hisSchool = School.getInatence();


		System.out.println(mySchool);
		System.out.println(yourSchool);
		System.out.println(hisSchool);


//		
//		//길동의 개인돈, 학급비 확인
//		hong.showInfo();
//		hong.showClassMoney();
//		
//		//길동 학급비 내고
//		hong.donate(1000);
//		
//		//길동의 개인돈, 학급비 확인
//		hong.showInfo();
//		hong.showClassMoney();
//		chun.showClassMoney();


		//길동 학급비 내고
//		chun.donate(20000);
//				
//		//길동의 개인돈, 학급비 확인
//		hong.showInfo();
//		hong.showClassMoney();
//		chun.showClassMoney();






//		//길동, 춘향 정보 확인
//		hong.showInfo();
//		chun.showInfo();
//		//700번 버스 객체 생성
//		Bus bus700 = new Bus(700);
//		//700번 버스 정보 확인
//		bus700.showInfo();
//		//길동, 춘향이 버스를 탄다
//		hong.takeBus(bus700);
//		chun.takeBus(bus700);
//	    // 길동, 춘향, 버스의 정보를 확인한다.
//		hong.showInfo();
//		chun.showInfo();
//		bus700.showInfo();
//		
//		// 길동이가 버스에서 내리고,
//		hong.takeOffBus(bus700);
//		// 길동, 버스의 정보를 확인한다.
//		hong.showInfo();
//		bus700.showInfo();
	}

}