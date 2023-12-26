package com.javaex.ex01;

public class Ex13 {
	
	public static void main(String[] args) {
		
		char a = '가';
		char b = '나';
		int c = 1;
		int d = 3;
		int e = c+2;
		int f = 3-2;
		
		System.out.println(c==d&&a==b);
		System.out.println(c==f&&d==e);
		System.out.println(a==b||c==f);
		System.out.println(!(a==b));
		
		System.out.println("----");
		System.out.println(c<d&&f<e);
		System.out.println(c>d&&f<e);
		System.out.println(c<=d||f>=e);
		
		System.out.println("-----");
		System.out.println(c<d&&c>d||c>d);
		System.out.println(c<d||c>d||c>e);
		
	}

}
