package com.javaex.oop;

public class MethodEx {

	public static void main(String[] args) {
//		printMessage();
//		printMessage("Hello, Method");	//	"Hello, Method" <- parameter
//		printDivide(10, 0);	//	10, 0 <- parameter
		System.out.println(divide(10, 3));	//	int 값인 10 과3 은 casting 되어 double
	}
	//	입력 O, 출력 O
	private static double divide(double num1, double num2) {
		return num1 / num2;	//	double을 받겠다 했으니(double divide) 반드시 리턴 해야 함
	}
	
	//	입력 O, 출력 X
	private static void printDivide(int num1, int num2) {
		if (num2 == 0) {
			System.out.println("0으로 나눌 수 없어요!");
			return;	//	돌아가세요! : printDivide(10, 0); 로 돌아감
					//	리턴 타입이 없더라도 return을 만나면 메서드 중단하고 돌아감
		}
		System.out.println(num1 / num2);
		
	}
	
	
	//	입력 O, 출력 X
	private static void printMessage(String message) {
		System.out.println(message);
	}
	
	//	입력 X, 출력 X
	private static void printMessage() {
		System.out.println("Hello, OOP");
	}
}
