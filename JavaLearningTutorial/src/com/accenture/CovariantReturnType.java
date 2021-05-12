package com.accenture;

class A{
	public A method1() {
		System.out.println("In Super class");
		return this;
	}
}
class B extends A{
	public B method1() {
		System.out.println("In sub class");
		return this;
	}
}
public class CovariantReturnType {
	public static void main(String[] args) {
		
		A a=new B();
		a.method1();
	}

}
