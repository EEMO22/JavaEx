package com.javaex.oop.goods.v1;

public class GoodsApp {

	public static void main(String[] args) {
		Goods notebook = new Goods();
		//	필드에 접근
		notebook.name = "LG Gram";
		notebook.price = 1700000;
		
		Goods smartphone = new Goods();
		smartphone.name = "iphone 12";
		smartphone.price = 800000;
		
		//	출력
		System.out.printf("%s, %d원%n",
				notebook.name,
				notebook.price);
		System.out.printf("%s, %d원%n",
				smartphone.name,
				smartphone.price);
	}

}
