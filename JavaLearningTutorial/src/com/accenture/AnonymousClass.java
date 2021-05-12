package com.accenture;

class Anony{
	public void show() {
		System.out.println("Nothing will print");
	}
}
public class AnonymousClass {
	public static void main(String args[]) {
		Anony a=new Anony(){
			public void show() {
				//super.show();
				System.out.println("Something will print");
			}
		};
		a.show();
	}
}
