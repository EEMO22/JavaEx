package com.javaex.oop.goods.v4;

//	v4. this
//	객체 자신을 의미, this() 내부의 다른 생성자를 의미
public class Goods {
	//	필드 선언
	private String name;
	private int price;
	
	//	생성자
	public Goods(String name) {	//	name 필드만 초기화 하는 생성자
		this.name = name;
	}
	public Goods(String name, int price) {
		this(name);	//	내부의 다른 생성자를 호출
		this.price = price;
	}
	
	//	getters/setters
	public String getName() {
		return name;		//	외부에서 요청하면 name 반환해 줌
	}
	
	public void setName(String name) {
		this.name = name;	//	외부에서 받은 name을 여기 자신의 name에 전달
	}
	
	public int getPrice() {
		return price;
	}
	
	//	setter를 구현하지 않으면 필드는 Read Only
//	public void setPrice(int price) {
//		this.price = price;
	
	
	//	메서드
	public void showInfo() {
		System.out.println("상품이름: " + name);
		System.out.println("가격: " + price);
	}
}
