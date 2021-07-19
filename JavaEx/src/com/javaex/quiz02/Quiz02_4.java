package com.javaex.quiz02;

public class Quiz02_4 {
	public static void main(String[] args) {
		char ch = 'A';
		
		//	알파벳을 소문자로 변환해 봅시다.
		//	'A': 65, 'a': 97
		
		char chSmall = (char)(ch + 32);
		System.out.println(chSmall);
	}

}
