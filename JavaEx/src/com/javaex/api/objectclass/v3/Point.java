package com.javaex.api.objectclass.v3;

//	v3. 객체 복제 clone 기능을 이용하려면
//		Cloneable 인터페이스를 구현 해야한다
public class Point implements Cloneable {
	int x;
	int y;
	
	public Point (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		//	객체 출력 포맷을 리턴
		return String.format("Point(%d, %d)", x, y);
	}

	@Override
	public boolean equals(Object obj) {
		//	전달받은 obj가 Point 클래스의 객체?
		if (obj instanceof Point) {
			//	캐스팅 가능
			Point other = (Point)obj;
			return x == other.x && y == other.y;
		}
		return super.equals(obj);
	}
	
	
	
}
