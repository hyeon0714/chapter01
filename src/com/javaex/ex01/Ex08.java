package com.javaex.ex01;

public class Ex08 {

	public static void main(String[] args) {
		
		double v01 = 5/4;  // 정수와 정수의 연산은 정수로 결과가 나온다//  결과 1
		System.out.println(v01);  //v01의 함수가 double 이기 1.0이란 결과가 나온다 
		
		double v02 = (double)5/4;  // 실수와 정수의 연산은 실수로 결과가 나온다// 결과 1.25
		System.out.println(v02);
		
		double v03 = 5/(double)4;  // 실수와 정수의 연산은 실수로 결과가 나온다// 결과 1.25
		System.out.println(v03);
		
		double v04 = (double)5/(double)4;  // 실수와 실수의 연산은 실수로 결과가 나온다//  결과 1.25
		System.out.println(v04);
		
		int v05 = (int)1.3+(int)1.8;   // 정수와 정수의 연산은 정수로 결과가 나온다// 결과 2
		System.out.println(v05);
		
		int v06 = 5/4;
		System.out.println(v06);
		
	}
}
