package com.javaex.ex05;

public class Ex07 {
	
	public static void main(String[] args) {
		
		// A 배열선언 1,2,3
		int[] arrA = new int[3];

		// 값대입 4
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;

		// B 배열선언 5,6,7
		int[] arrB = new int[3];
		
		// 값복사 8
		for (int i = 0; i < arrA.length; i++) {
		    arrB[i] = arrA[i];
		} //arrB=arrA;와 값이 다름
		
		
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		for(int i=0; i<arrB.length; i++) {
			System.out.println(arrB[i]);
		}
		
		System.out.println("---------------");
		
		arrA[2]=1000;
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		for(int i=0; i<arrB.length; i++) {
			System.out.println(arrB[i]);
		}
	}

}
