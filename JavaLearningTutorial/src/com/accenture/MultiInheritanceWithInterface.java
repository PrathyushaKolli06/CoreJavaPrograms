package com.accenture;

interface Demo1{
	default void test() {
		System.out.println("Inside Demo1");
	}
}
interface Demo2{
	default void test() {
		System.out.println("Inside Demo2");
	}
}
class Print implements Demo1,Demo2{
	public void test() {
		Demo2.super.test();
		Demo1.super.test();
		System.out.println("Inside print class");
	}
}
public class MultiInheritanceWithInterface {
	public static void main(String args[]) {
		Demo1 d1=new Print();
		d1.test();
	}
}
