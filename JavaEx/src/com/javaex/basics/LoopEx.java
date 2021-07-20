package com.javaex.basics;

import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
//		whileEx();
//		whileGugu();
		doWhileEx();
		System.out.println("End of Code");
	}
	
		private static void doWhileEx() {
			//	적어도 한 번은 수행되어야 하는 반복,
			//	반복 조건이 반복문 내부에서 할당되는 경우
			int total = 0, value = 0;
			
			Scanner scanner = new Scanner(System.in);
			
			do {
				System.out.println("숫자를 입력하세요.[0이면 종료] ");
				value = scanner.nextInt();
				total += value;	//	total = total + value
			} while(value !=0);
			
			System.out.println("합계: " + total);
			scanner.close();
		}
		private static void whileGugu() {
			Scanner scanner = new Scanner(System.in);
			int dan, i = 1;	//	반복 제어 변수
			
			System.out.println("단을 입력하세요.");
			System.out.println("단: ");
			dan = scanner.nextInt();
			
			while(i <= 9) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
				//	중요: 제어 변수 변경
				i++;
			}
		}
		private static void whileEx() {
			int num = 0;	//	반복 조건 제어 변수
			
			while (num <= 9) {
				System.out.println("I Like Java" + num);
				num++;	//	주의: 무한 반복에 빠지지 않도록 적절히 제어
			}
		}

	}
