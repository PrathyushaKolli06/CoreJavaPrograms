package com.accenture;

public class StaticKeyword {
	int sno;
	String sname;
	static String college;
	public void print(int sno, String sname) {
		
		System.out.println(sno + sname + college);
	}
	public  static void main(String args[]) {
		StaticKeyword.college="KITS";
		StaticKeyword s=new StaticKeyword();
		StaticKeyword s1=new StaticKeyword();
		StaticKeyword.college="JNTUK";
		s1.print(13059608, "Kolli");
		s.print(501747, "Prathyusha");
	}

}
