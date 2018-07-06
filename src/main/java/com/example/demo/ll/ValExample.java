package com.example.demo.ll;

import java.util.ArrayList;
import java.util.HashMap;

import lombok.val;

public class ValExample {

		public String example() {
			val example=new ArrayList<>();
			example.add("hello world");
			val foo=example.get(0);
			return foo.toString().toLowerCase();
		}
		
		public void example2() {
			val map=new HashMap<Integer,String>();
			map.put(0, "zero");
			map.put(5,"five");
			
			for (val entry:map.entrySet()) {
				System.out.printf("%d:%s\n",entry.getKey(),entry.getValue());
				
			}
		}
	
		
		
		
}
