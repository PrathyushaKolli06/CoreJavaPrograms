package com.accenture;

public class InnerClass {
	private class Other{
		public void show() {
			System.out.println("Inside inner class");
		}
	}
	static class Other2{
		 static void show1() {
			System.out.println("Inside Static class");
		}
	}
	public static void main(String args[]) {
		InnerClass i=new InnerClass();
		InnerClass.Other o=i.new Other();
		o.show();
		InnerClass.Other2.show1();
	}
}
