package com.javaex.ex05;

public class Ex09 {
	
	//String[] args=new String[3];
	//자바가 해결완료
	public static void main(String[] args) {
		
		

		for(int i=0; i<args.length; i++){
			System.out.println(i + "번째 값: " + args[i]);
		}
		
		
		//-h
		if(args[0].equals("-h")) {
			System.out.println("[-h] 도움말");
			System.out.println("[-v] 버전정보");
			System.out.println("[-m] 만든사람");
		}else if(args[0].equals("-v")) {
			System.out.println("version1.0");
		}else if(args[0].equals("-m")) {
			System.out.println("만든이: 현");
		
		}else {
			System.out.println("옵션확인");
		}
		}


}
