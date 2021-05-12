package com.accenture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ArrayListEX {

	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		HashSet s=new HashSet<>();
		a.add(13059608);
		a.add("Prathyusha");
		a.add("Accenture");
		//a.remove(2);
		//Collections.sort(a);
		s.addAll(a);
		for(Object l:s) {
			System.out.println(l);
		}
		for(Object k:a) {
			System.out.println(k);
		}
		
	}

}