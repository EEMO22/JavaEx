package com.javaex.oop.point.v4;

//	상속: extends
public class ColorPoint extends Point {	
	//	생성자 선언 X -> 기본생성자 선택 => Point에는 기본생성자 X --- error
	//	부모생성자 명시 X -> 부모의 기본생성자 선택
	
	//	 추가 필드
	private String color;
	
	//	생성자
	public ColorPoint(int x, int y, String color) {
		//	명시적으로 부모 생성자 선택
		super(x, y);
		this.color = color;
	}
	
	//	getter/setter
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	//	메서드 오버라이드
	@Override
	public void draw() {	//	물려 받았으나 자신만의 새로운 기능 덮어쓰기
		//	방법 1. 부모의 getter, setter를 이용 (부모의 x, y가 private)
//		System.out.printf("색깔점[x=%d, y=%d, color=%s]을 그렸습니다. %n",
//				super.getX(), 
//				super.getY(), 
//				color);
		//	방법 2. 부모의 필드를 protected로 변경
		System.out.printf("색깔점[x=%d, y=%d, color=%s]을 그렸습니다.%n",
				x, y, color);
	}
	
	//	/Point 클래스의 draw(boolean) 메서드를 오버라이드
	@Override
	public void draw(boolean bShow) {
		String message = String.format("점[x = %d, y = %d, color=%s]을 ",
				x, y, color);
		message += bShow ? "그렸습니다." : "지웠습니다.";
		System.out.println(message);
		
	}
}
