package com.javaex.ex05;

public class Ex03 {
	
	public static void main(String[] args) {
		
		int[] a=new int[5];
		
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		
		/*
		System.out.println(a[2]);
		System.out.println(a[4]);
		*/
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("-----------------");
		
		int[] b=new int[6];
		
		b[0]=(int)(Math.random()*45)+1;
		b[1]=(int)(Math.random()*45)+1;
		b[2]=(int)(Math.random()*45)+1;
		b[3]=(int)(Math.random()*45)+1;
		b[4]=(int)(Math.random()*45)+1;
		b[5]=(int)(Math.random()*45)+1;
		/*
		System.out.println(b[2]);
		System.out.println(b[4]);
		*/
		
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
	}

}
