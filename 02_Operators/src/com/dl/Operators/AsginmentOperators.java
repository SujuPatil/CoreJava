package com.dl.Operators;

public class AsginmentOperators {

	public static void main(String[] args) {

		//Asignment Operators += -= /= *= %=
		int a = 10;
		int b = 20;
		
		System.out.println(a+=b);  // a = a + b  // 30
		
		//Dynamically values are changing
		//a = 30
		System.out.println(a-=b); // a = a - b // 10
		
		//a = 10
		System.out.println(a*=b); // a = a * b // 200
		
		//a = 200
		System.out.println(a/=b); // a = a / b // 10
		
		//a = 10
		System.out.println(a%=b); // a= a % b  // 10
		
	}

}
