package com.dl.Operators;

public class UnaryOperators {

	public static void main(String[] args) {

		// Unary Operators ++ -- 
		// Post++ and ++Pre increment
		int a = 10;
		System.out.println(a++); // 10
		System.out.println(a); // 11
		System.out.println(++a); // 10
		
		int b = 20;
		System.out.println(++b); 
		System.out.println(b); 
		System.out.println(b++); 
		System.out.println(b);
	}

}
