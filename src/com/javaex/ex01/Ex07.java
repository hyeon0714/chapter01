package com.javaex.ex01;

public class Ex07 {

	public static void main(String[] args) {
		
		int var00 = 3+5;
		System.out.println(var00);
		
		float var01 = 3+3.5f;
		System.out.println(var01);
		
		float var02 = var00+(int)var01;
		System.out.println(var02);
		
		int a = 3;   // 3.0으로 자동 형변환됨
		float b = 1.5f;
		float var03 = a+b;
		System.out.println(var03);
		
		//// 강제형변환
		
		int var1 = (int)12.5;   // 강제 형변환 시 ()필요함
		System.out.println(var1);
		
		float var04 = 1111.6345f;
		int var05 = (int)var04;
		System.out.println(var04);
		System.out.println(var05);
		
		int no = 1;
		int num = 3;
		float number = no+num;
		System.out.println(number);
		
		//축소형변환(int -> byte)
		int v01 = 10;
		byte v02 = (byte)v01;
		System.out.println(v02); // 정상 축소형변환
		
		v01 = 58889;
		v02 = (byte)v01;
		System.out.println(v02); // 비정상 축소형변환
		
		//확대형변환(byte -> int)
		byte v03 = 127;
		int v04 = (int)v03;
		System.out.println(v04); 
		
		//실수 -> 정수
		double v05 = 7.7612;
		int v06 = (int)v05;
		System.out.println(v06);
		
		//정수 -> 실수
		int v07 = 5;
		double v08 = (double)v07;
		System.out.println(v08);
		
		
		
		
	}
}
