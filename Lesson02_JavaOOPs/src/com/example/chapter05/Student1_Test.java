package com.example.chapter05;

public class Student1_Test {

	public static void main(String[] args) {
		// Student1 Ŭ������ �̿��Ͽ� ��ü ����
		// ��ü ���� :
		// new Ŭ����������( );
		// student1 Ŭ������ ��ü�� �ϳ� �����϶�.
		// ��ü��������
		Student1 hong = new Student1(); // Ŭ���������� : Ŭ�����̸�()
		// System.out.println(hong);
		hong.setStudentName("ȫ�浿");
		hong.setGrade(1);
		hong.setAddress("û�ֽ� û����");
		hong.setStudentID(1001);
		
		System.out.println(hong.getStudentID());
		hong.showStudentInfo();
		
		
		System.out.println("================");
		Student1 park = new Student1(2021, "�ڹ���", 1, "û�ֽ� �����");
		park.showStudentInfo();
		
//		Student1 lim = new Student1();
//		lim.studentName = "�Ӽ���";
//		lim.address = "û�ֽ� �����";
//		lim.showStudentInfo();
		

	}

}
