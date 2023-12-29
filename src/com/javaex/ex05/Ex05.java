package com.javaex.ex05;

public class Ex05 {
	
	public static void main(String[] args) {
		
		int[] b=new int[6];
		/*
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
		
		for(int c=0; c<b.length; c++) {
			b[c] =(int)(Math.random()*45)+1;
		}
		
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}

	}
	

}
