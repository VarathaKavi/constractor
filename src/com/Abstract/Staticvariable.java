package com.Abstract;


public class Staticvariable {
  public  int b=0;
public void savings() {
	int  a=800;
	System.out.println(a);
	b=900;
}
public static void main(String[] args) {
	Staticvariable s=new Staticvariable();
	System.out.println("before Initialization:"+s.b);
	s.savings();
	System.out.println("After Initialization:"+s.b);
	System.out.println();
	
	Staticvariable s1=new Staticvariable();
	System.out.println("before Initialization2:"+s1.b);
	s.savings();
	System.out.println("After Initialization2:"+s1.b);
	System.out.println();
}
}