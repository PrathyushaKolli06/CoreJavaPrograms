package com.accenture;

public class ToString {
	int sno;
	String sname;
	
	ToString(int sno, String sname){
		this.sno=sno;
		this.sname=sname;
	}
	@Override
	public String toString() {
		return "sno=" + sno + ", sname=" + sname;
	}
	public static void main(String args[]) {
		ToString s=new ToString(13059608, "Prathyusha");
		System.out.println(s);
		
	}

}
