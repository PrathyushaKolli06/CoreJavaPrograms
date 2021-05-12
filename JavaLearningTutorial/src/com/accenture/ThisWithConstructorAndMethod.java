package com.accenture;

public class ThisWithConstructorAndMethod {
	ThisWithConstructorAndMethod(){
		System.out.println("Constructor without arguments");
	}
	ThisWithConstructorAndMethod(String name){
		this();
		System.out.println("Constructor with arguments");
	}
	public void print() {
		System.out.println("method print called");
	}
	public ThisWithConstructorAndMethod show() {
		System.out.println("This with reference called");
		return this;
	}
	public void addition(int a, int b) {
		print(); // this.print();
		System.out.println("Sum =" + (a+b));
		
	}
	public static void main(String args[]) {
		ThisWithConstructorAndMethod n=new ThisWithConstructorAndMethod("Prathyusha");
		n.addition(1, 2);
	}
	
}
