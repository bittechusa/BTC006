package com.bit.test;

import java.util.LinkedList;

import org.testng.annotations.Test;

public class LinkList {
	
	
	
	@Test
	public void testlinkList(){
		
		//LinkedList l = new LinkedList();
		LinkedList <Integer> l = new LinkedList();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);
		
		l.remove(1);
		l.get(4);
		l.size();
		for (Integer a : l){
			
			System.out.println(a);
			
		}
		System.out.println(l.size());
		System.out.println(l.get(4));
		System.out.println(l.get(2));
		
	}
	
	

}
