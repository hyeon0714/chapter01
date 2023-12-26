package com.javaex.ex03;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("숫자 ");
		
		int a = sc.nextInt();
		
		if (a>0) {
			System.out.println("양수");
		}else if(a<0) {
			System.out.println("음수");
		}else {
			System.out.println("0");
		}
		
		sc.close();
		
	}

}
