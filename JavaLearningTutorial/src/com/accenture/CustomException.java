package com.accenture;

public class CustomException {

	public static void main(String[] args) {
		
		VoterValidate v=new VoterValidate();
		try {
			v.valid(17);
		} catch (InvalidException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
