package com.javaex.ex04;

public class Ex07 {
	
	public static void main(String[] args) {
		
		/*
		for (int a=0; a<=5; a++) {
			for (int b=0; b<=5-a; b++) {
				System.out.print("*");
			}
				System.out.println();
		}
		*/
		
		
		for(int a=1; a<=5; a++) {// 세로
			
			for(int b=1; b<=5-a; b++) {
				
				System.out.print("*"); //가로(ln을 붙이지 않고 가로로 진행
				
			}System.out.println();// 줄바꿈을 통해 세로로 진행
		}
	
	
	
	
	
	}
}