package com.example.chapter06;

public class School {
	// 2. 클래스 내부에서 static으로 유일한 인스턴스를 생성
	private static School instance = new School();
	// 1. 생성자는 access modifier를 private으로 한다.
	private School() {
		// none operation
	}
	
	// 3. 외부에서 참조할 수 있도록 public 메서드를 만든다.
	public static School getInatence() {
		if(instance == null) {
			instance = new School();
		}
		return instance;
	}

}
