package com.accenture;

public class VoterValidate {
	
	public void valid(int age) throws InvalidException{
		if(age<18) {
			throw new InvalidException("Age should be greater than 18");
		}
		else
		{
			System.out.println("Voter valid");
		}
	}

}
