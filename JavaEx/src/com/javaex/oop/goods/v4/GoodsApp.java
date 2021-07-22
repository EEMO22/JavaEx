package com.javaex.oop.goods.v4;

public class GoodsApp {

	public static void main(String[] args) {
//		Goods notebook = new Goods();	//	Goods에 생성자 입력 후 error -> 기본생성자 없음
		Goods notebook = new Goods("LG Gram", 1700000);
		
		//	setter를 이용한 우회 접근
//		notebook.setName("LG Gram");
//		notebook.setPrice(1700000);
		
		Goods smartphone = new Goods("iphone 12", 800000);
//		smartphone.setName("iphone 12");
//		smartphone.setPrice(800000);
		
		//	출력
//		System.out.printf("%s, %d원%n",
//				notebook.getName(),
//				notebook.getPrice());
//		System.out.printf("%s, %d원%n",
//				smartphone.getName(),
//				smartphone.getPrice());
		
		notebook.showInfo();
		smartphone.showInfo();
		
//		notebook.setPrice(170);	//	price 필드는 Read Only
//		notebook.showInfo();
	}

}
