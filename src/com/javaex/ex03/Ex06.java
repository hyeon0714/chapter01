package com.javaex.ex03;

import java.util.Scanner;

public class Ex06 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		
		int a=sc.nextInt();
		
		if (a>=90) {
			System.out.println("A등급");
		}else if(a>=80) {//90>a>=80  =>90>a && a>=80
			System.out.println("B등급");
		}else if(a>=70) {//80>a>=70  =>80>a && a>=70
			System.out.println("C등급");
		}else if(a>=60) {//70>a>=60  =>70>a && a>=60
			System.out.println("D등급");
		}else {
			System.out.println("F등급");
		}
	sc.close();
	}

}
