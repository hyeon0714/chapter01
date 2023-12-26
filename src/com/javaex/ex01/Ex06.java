package com.javaex.ex01;

public class Ex06 {

	public static void main(String[] args) {
		
		double pi = 3.14;
		double result = pi*5*5;
		
		System.out.println(pi);
		
		System.out.println(result);
		
		pi = 3.141519;
		double circle = pi*5*5;
		System.out.println(circle);
		
		// 상수로 정의할때 대문자로 정의
		final double PI = 3.14;
		double result2 = PI*5*5;
		System.out.println(result2);
		
		//PI = 3.141519;   //오류확인
		
		double circle2 = PI*5*5;
		System.out.println(circle2);
		
	}
	
	
}
