package com.nt.basics;

import org.joda.time.LocalDateTime;
import com.nt.basics.WishMessageGenerator;

public class MathOperations {
	
	public int sum(int  x ,int y ) {
		return x+y;
	}
	
	public static void main(String[] args) {
		MathOperations operations=null;
		operations=new MathOperations();
		System.out.println("result is "+operations.sum(1000, 2000));
		
		LocalDateTime date=new org.joda.time.LocalDateTime();
		System.out.println(date);
		
		WishMessageGenerator generator=new WishMessageGenerator();
		System.out.println(generator.sayHello("Raja"));
		
		
	}

}
