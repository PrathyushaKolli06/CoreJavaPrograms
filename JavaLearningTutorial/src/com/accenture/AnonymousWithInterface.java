package com.accenture;

interface A1{
	default void test() {
		System.out.println("Inside default");
	}
	public void add();
}
public class AnonymousWithInterface {

	public static void main(String[] args) {
		A1 a=new A1() {
			public void add() {
				System.out.println("Interface without extra class");
			}
		};
		A1 a1=()-> System.out.println("Interface Lamda expression"); 
			a.add();
			a1.add();
			a.test();
	}

}
