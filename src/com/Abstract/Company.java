package com.Abstract;

public class Company {
	int b=100;
	private void companyId() {
		int a=0;
		System.out.println("companyId is 1234");
		System.out.println("local variable companyId"+a);
		b=200;
}
	private void companyName() {
    int a=50;
    System.out.println("local variable of companyName"+a);
    b=100;
	}
	public static void main(String[] args) {
		Company c=new Company();
		System.out.println("before companyId instance variable"+c.b);
		System.out.println();
		c.companyId();
		System.out.println("after companyId instance variable"+c.b);
		System.out.println();
		c.companyName();
		System.out.println("after companyName instance variable"+c.b);
		System.out.println();
	
	  Company company1=new Company();
	  System.out.println("after new object"+company1.b);
	  System.out.println();
	  company1.companyId();
	  System.out.println("after new object companyId"+company1.b);
	
	
	}
}