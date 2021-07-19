package com.javaex.quiz02;

public class Quiz02_5 {
	public static void main(String[] args) {
		int num1 = 13579;
		int num2 = 13579;
		
		System.out.println(++num1 + 1);
		System.out.println(num2++ + 1);
		
		int num3 = (++num1 + 1);
		int num4 = (num2++ + 1);
		
		System.out.println(num3);
		System.out.println(num4);
		
		String result;
		result = (++num1 + 1 == num2++ +1) ? "같음" : "다름";
		
		System.out.print("++num + 1 = " + num3 + "이고, " + "num2++ +1 = " + num4 + "이므로, " + result);
	}

}