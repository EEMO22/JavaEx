package com.javaex.quiz02;

public class Quiz02_2 {
	public static void main(String[] args) {
		int balls = 136;
		int cap = 10;
		
		//	balls: 보유한 공의 갯수
		//	cap: 하나의 상자당 담을 수 있는 공의 개수
		//	balls를 상자에 나눠 담으려면 최소 몇 개의 상자가 필요한가?
		
		//	각 상자당 10개의 공이 들어가므로,
		
		int count = balls / cap;
		
		count += (balls % cap > 0? 1 : 0);
		System.out.println("필요한 상자: " + count);
		
		int boxes = 14;
		
		String message = boxes >=14 ? "충분합니다" : "상자가 더 필요합니다";
		System.out.println("상자가 " + boxes + "개 이므로," + message);
		
		
		
	}
}
