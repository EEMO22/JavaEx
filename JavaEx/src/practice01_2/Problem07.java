package practice01_2;

import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		//	참조: https://itstudy-mary.tistory.com/58
		
		while(true) {
		
		int rnd = (int)(Math.random() * 100 + 1);
		int num = 0;
		int i = 1;
		int q = rnd;
		
		System.out.println("========================");
		System.out.println("   [ 숫자맞추기게임 시작]    ");
		System.out.println("========================");
		
		while(true) {
		
			System.out.print(">>");
			num = scanner.nextInt();
			
			if(num > q) {
				System.out.println("더 낮게");
				
				
			} else if(num < q) {
				System.out.println("더 높게");
				
				
			} else {
				System.out.println("맞았습니다.");
				break;
			}
			i++;
			continue;
		}
			System.out.print("게임을 종료하시겠습니까? (y/n) >>");
			String ans = scanner.next();
					if(ans.equals ("y")) {
						break;
					}
		}
		System.out.println("========================");
		System.out.println("   [ 숫자맞추기게임 종료]    ");
		System.out.println("========================");
		scanner.close();		
		}
		
	}

