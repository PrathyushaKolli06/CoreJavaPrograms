package com.accenture;

public class VarrayAddition {
	int sum=0;
		public int add(int ...n) {
			for(int i:n) {
				sum= sum+i;
			}
			return sum;
		}
public static void main(String args[]) {
	VarrayAddition v=new VarrayAddition();
	System.out.println(v.add(1,2,3,4));
}
}
