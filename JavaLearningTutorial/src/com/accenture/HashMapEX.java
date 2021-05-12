package com.accenture;

import java.util.HashMap;
import java.util.Set;

public class HashMapEX {

	public static void main(String[] args) {
		HashMap<Integer,String> h=new HashMap<>();
		h.put(501747, "Prathyusha");
		h.put(13059608,"Kolli");
		h.put(501665, "Mahesh");
		System.out.println(h);
		Set<Integer> s=h.keySet();
		for(Integer n:s) {
			System.out.println(h.get(n));
		}
		
	}

}
