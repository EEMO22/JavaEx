package practice01_2;

import java.util.Scanner;

public class Problem08 {

	public static void main(String[] args) {

		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		get:while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
			System.out.println("-----------------------------");
			System.out.print("선택> ");
			
			int code = 0;
			code = scanner.nextInt();
			
			if(code == 1) {
				System.out.print("예금액> ");
				int in = scanner.nextInt();
				balance += in;
			} else if (code == 2) {
				System.out.print("출금액> ");
				int out = scanner.nextInt();
				balance -= out;
			} else if (code == 3) {
				System.out.print("잔고액> " + balance);
				System.out.println();
			} else if (!(code == 1 || code == 2 || code == 3 || code == 4)) {
				System.out.print("다시입력해주세요");
				System.out.println();
			} else if (code == 4) {
				break get;
			}
			}
		System.out.println("프로그램 종료");	
	}

}
