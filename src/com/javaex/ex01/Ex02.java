package com.javaex.ex01;

public class Ex02 {

	public static void main(String[] args) {
		
		byte no = -128;
		
		System.out.println(no);

		int num;
		
		num = 50000;
		
		System.out.println(num);
		
		// long형은 맨뒤에 L or ㅣ 을 붙여야한다(int 범위 이상일때)
		long no2;
		
		no2 = 900000000000000l;
		
		System.out.println(no2);
		
		//// 변수선언, 초기화
		/*
		//변수선언
		int var01;
		int var02;
		int var03;
		//초기화 대입
		var01 = 10;
		var02 = 20;
		var03 = 30;
		*/
		int var01, var02, var03;
		
		var01 = 10;
		var02 = 20;
		var03 = 30;
				
		System.out.println(var01);
		System.out.println(var02);
		System.out.println(var03);
		
		/*
		int var04, var05, var06;
		var04 = 100;
		var05 = 200;
		var06 = 300;
		*/
		int var04 = 100, var05 = 200, var06 = 300;
		
		System.out.println(var04);
		System.out.println(var05);
		System.out.println(var06);
		
		System.out.println(var04 + var05);
		
		// sysout + ctrl+ space   =    System.out.println();
		
		// char 함수는 ''로 문자 감싸기
		// String 함수는 첫글자 대문자 + 문자열 + (=) 뒤에 new String("") 필수
		
		String str1=new String("a");
		System.out.println(str1);
		String str2=new String("love");
		System.out.println(str2);
		
		String sup = new String("사랑");
		System.out.println(sup);
		
		String sun = new String("태양");
		System.out.println(sun);
		char a = 'ㄱ';
		System.out.println(a);
		
		String moon = new String("달");
		System.out.println(moon);
		
		
		}
		
		
		
		
	}

