package com.hdfc.loans.carloans;

public class FirstClass2 {
	int a=10,b=20,c;
	void add()
	{
		c=a+b;
		System.out.println("Addition of A & B is:"+c);
	}
	void sub()
	{
		c=a-b;
		System.out.println("sub of A & B is :"+c);
	}
	
	public static void main(String[] args) {
		FirstClass2 obj=new FirstClass2();
		obj.add();
		obj.sub();
		
	}

}
