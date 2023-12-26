package com.javaex.ex01;

public class Ex11 {

	public static void main(String[] args) {
		
		int a = 9;
		System.out.println(++a);
		System.out.println(a);// 1증감된 상태 유지
		System.out.println(--a);
		System.out.println(a);// 1차감된 상태 유지
		System.out.println(a++);// 표시후 증감
		System.out.println(a--);// 표시후 차감
		System.out.println(a);
		
		//연습문제//
		System.out.println(3+a--);
		System.out.println(2*a++);
		System.out.println(1+(++a));
		System.out.println(13-(a--));
		System.out.println(a);
		System.out.println();
		int b=10;
		System.out.println(++b+3);
		System.out.println(++b*7);
		System.out.println(--b*7);
		System.out.println(b-- +3);
		System.out.println(b-- *2);
		System.out.println(b);
		
		++b;
		++b;
		System.out.println(b);
		
		b--;
		b--;
		System.out.println(b);
		
		int c = ++b;
		System.out.println(b);
		System.out.println(c);
		
		int d = b--;
		System.out.println(b);
		System.out.println(d);
		
		int e = b+1;
		System.out.println(b);
		System.out.println(e);
	}
}
