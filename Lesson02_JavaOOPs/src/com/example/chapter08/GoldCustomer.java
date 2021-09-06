package com.example.chapter08;

public class GoldCustomer extends Customer {
	// Customer 속성을 상속하고 추가적인 속성을 추가 선언
	double saleRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "Gold";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}

}
