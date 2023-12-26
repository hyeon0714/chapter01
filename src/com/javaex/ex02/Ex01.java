package com.javaex.ex02;

public class Ex01 {
	
	public static void main(String[] args) {
		
		int i=12345;
		double d=3.14;
		char r='한';
		
		String str = "안녕하세요";
		String hello="굿모닝";
		String name="현재";
		
		System.out.println(i);
		System.out.println("안녕하세요");
		System.out.println("여러분");
		System.out.println(str);
		System.out.println("-------");
		System.out.print("여러분 ");
		System.out.println(str);
		System.out.println("-------");
		System.out.println(str+" "+hello);
		System.out.println(hello+"\n"+str);
		System.out.println(name+"님 "+hello+" "+str);
		
		System.out.println(i+i);
		System.out.println(i+d);
		System.out.println(r+r);//char는 각각의 유니코드가 존재해서 사칙연산시 숫자로 계산한다
		System.out.println(r+" "+str);
		System.out.println(i+name);
		System.out.println(i+d+str);
		
		

	}
}

