package com.accenture;

abstract class Human {
	public void heart() {
	System.out.println("Mandatory");
	}
	public abstract void job();
}
class Man extends Human{
	public void job() {
		System.out.println("For man not mandatory");
	}
}
class Woman extends Human{
	public void job() {
		System.out.println("For Woman mandatory");
	}
}
public class AbstractClass {
	public static void main(String args[]) {
		Human h=new Man();
		h.job();
		h.heart();
		h=new Woman();
		h.job();
	}

}
