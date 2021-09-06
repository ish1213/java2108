package com.example.chapter08;

public class KoreaMart {

	public static void main(String[] args) {
		// 코리아마트
		Customer customerLee = new Customer();
		customerLee.setCustomerID(1001);
		customerLee.setCustomerName("이성종");
		customerLee.setBonusPoint(1000);
		System.out.println(customerLee.showCustomerInfo());
		
		Customer customerPark = new VIPCustomer();
		customerPark.setCustomerID(2001);
		customerPark.setCustomerName("박문수");
		customerPark.setBonusPoint(1000);
		System.out.println(customerPark.showCustomerInfo());
		
		Customer customerHong = new GoldCustomer(3001, "홍길동");
		customerHong.setBonusPoint(1000);
		System.out.println(customerHong.showCustomerInfo());
		
		System.out.println("정산액은 " + customerLee.calcPrice(10000));
		System.out.println("정산액은 " + customerPark.calcPrice(10000));
		System.out.println("정산액은 " + customerHong.calcPrice(10000));
		
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerPark.showCustomerInfo());
		System.out.println(customerHong.showCustomerInfo());
		

	}

}
