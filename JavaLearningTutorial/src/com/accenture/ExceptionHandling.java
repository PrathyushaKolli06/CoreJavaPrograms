package com.accenture;


public class ExceptionHandling {

	public static void main(String[] args) {
		int a=0,b=18;
		int c[]= {1,2,3,4}; 
		try {
		System.out.println(c[4]);
		System.out.println(b/a);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("execution continues");
	}

}
