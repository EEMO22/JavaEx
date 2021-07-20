package Pratice01_1;

public class Problem04 {

	public static void main(String[] args) {
		
		
		int i;
		int j;
		int x = 10;	//	트리 형식을 피하기 위해 새 함수 추가. 제거시 모양 구겨짐.
		
		for (i = 1; i < 11; i++) {
			for (j = i; j <= x; j++) {
				System.out.print(j + "\t");
			}
			System.out.println("");
			x+=1;	//	강제로 늘린다.
		}
	}

}