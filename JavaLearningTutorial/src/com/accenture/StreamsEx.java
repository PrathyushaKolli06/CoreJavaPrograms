package com.accenture;

import java.awt.List;
import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsEx {

	
	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		a.add(1);
		a.add(4);
		a.add(7);
		a.add(2);
		a.add(6);
		a.forEach(x->System.out.print(x + "\t"));
		//a.forEach(System.out::print);
		//System.out.println(a.stream().map(i -> i%2).reduce(0,(c,e)->c+e));
		}

}
