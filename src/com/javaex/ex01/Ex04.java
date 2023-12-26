package com.javaex.ex01;

public class Ex04 {

	public static void main(String[] agrs) {
		
		boolean a = true;
		boolean b = false;
		System.out.println(a);
		System.out.println(b);
		System.out.println(a&&b);
		System.out.println(a||b);
		
		// blooean 함수는 보통 수식으로 사용한다
		int no = 3;
		int num = 5;
		
		boolean result = no>num;
		System.out.println(result);
		System.out.println(no<num);
		
		char c = '한';
		String d = "한";
		
		System.out.println(c);
		System.out.println(d);
	}
}
