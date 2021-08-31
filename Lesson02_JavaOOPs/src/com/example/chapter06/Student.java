package com.example.chapter06;

public class Student {
	public String studentName;
	public int grade;
	public int money;
	static int classmoney=0;
	
	// constructor
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	// 버스 탑승
	public void takeBus(Bus bus) {
		bus.take(1500);
		this.money -= 1500;
	}
	
	public void takeOffBus(Bus bus) {
		bus.takeOff();
	}
	
	public void donate(int money) {
		classmoney += money;
		this.money -= money;
	}
	
	// 학생의 현재 지갑상태 확인
	public void showInfo() {
		System.out.println(studentName + "님의 현재 잔액 : " + money);
	}
	
	public void showClassmoney() {
		System.out.println(studentName + "님 학급의 학급비 현재 잔액 : " + classmoney);
	}
	


}
