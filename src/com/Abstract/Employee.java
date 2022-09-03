package com.Abstract;

public class Employee {
	public static int c;
	int b;
	public  void empId() {
		int a=10;
		System.out.println("1221");
		System.out.println("local variable "+a);
b=2;
c=12;
	}
	private void empName() {
int a=20;
System.out.println(a);
b=3;
c=13;
	}
public static void main(String[] args) {
	
	Employee e=new Employee();
	System.out.println("B.static variable "+c);
	System.out.println("before instance"+ e.b);
	System.out.println();
	e.empId();
	System.out.println("e.instance "+e.b);
	System.out.println("e.static variable "+c);
	System.out.println();
	e.empName();
	System.out.println("after instance "+e.b);
	System.out.println("after static "+c);
	System.out.println();
	
Employee e1=new Employee();
	
	System.out.println("after new object "+e1.b);
	System.out.println();
	e.empId();
	System.out.println("e.instance "+e1.b);
	System.out.println();
	e.empName();
	System.out.println("after new objects id"+e1.b);
	
}
}
