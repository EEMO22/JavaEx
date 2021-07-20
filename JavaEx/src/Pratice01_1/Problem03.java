package Pratice01_1;

public class Problem03 {

	public static void main(String[] args) {
//		arrayEx();
		forEx();
	}
		
		//	for문
	
		public static void forEx() {
			
			for (int i = 1; i < 10; i++) {
				for (int j = 2; j < 10; j++) {
					System.out.print(j + "*" + i + "=" + (i * j) + "\t");
				}
				System.out.println("");
			}
			
		}
		
		//	2차원 배열
		
		public static void arrayEx() {
			
		int arr[][] = new int [10][10];
		for (int j = 1; j < arr.length; j++) {
			for (int i = 2; i < arr.length; i++) {
				arr[i][j] = i * j;
				System.out.print(i + "*" + j + "=" + arr[i][j] + "\t");
				
			}
			System.out.print("\n");
		}
		}

	}