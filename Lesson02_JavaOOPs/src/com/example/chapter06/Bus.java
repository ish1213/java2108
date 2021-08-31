package com.example.chapter06;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void takeOff() {
		passengerCount--;
	}
	
	public void showInfo() {
		System.out.println(busNumber + "번 버스 현재 승객: " 
	           + passengerCount + ", 현재 잔액 : " + money);
	}

}
