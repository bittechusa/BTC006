package com.bit.test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class Arraylist {
	
	
	
	@Test
	public void test1(){
		ArrayList b = new ArrayList();
		b.add(5);
		b.add(6);
		
		
		ArrayList a = new ArrayList();
		
		a.add(7);
		a.add("hey");
		a.add(null);
		a.add(7);
		a.addAll(b);
		
		for (Object o :a){
			
			System.out.println(o);
		}
		System.out.println("2nd Test Start");
		a.get(2);
		a.set(1, "hey been swap");
		//a.lastIndexOf(a);
		a.remove(2);
		a.retainAll(a);
		//a.iterator();
		
		for (Object o2 :a){
			
			System.out.println(o2);
			
		}
		System.out.println("test2nd done!!");
		System.out.println(a.isEmpty());

		
	}

}
