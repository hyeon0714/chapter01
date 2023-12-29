package com.javaex.ex05;

public class Ex04 {
	
	public static void main(String[] args) {
		
		double[] a=new double[3];
		
		a[0]=3.5;
		a[1]=19.12;
		a[2]=22.556;
		
		//한개만 사용
		System.out.println(a[2]);
		
		System.out.println("=========");
		
		//모두 사용
		for(int b=0; b<a.length; b++) {
			System.out.println(a[b]);
		}
	}

}
