package com.accenture;

public class SwitchCase {
	public static void main(String args[]) {
		int a=9;
		switch(a%2) {
		case 0: System.out.println("Even number");break;
		case 1: System.out.println("Odd number");break;
		default: System.out.println("zero");
		}
		System.out.println(a>2?"true":"false");
	}

}
