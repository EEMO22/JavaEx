package Pratice01_1;

import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		
		int num = 0;
		int max = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("숫자: ");
			num = scanner.nextInt();	
			
			if (num >= max) {
				max = num;
			}
		
		}
		System.out.println("최대값은 " + max + "입니다.");
		scanner.close();

	}

}
