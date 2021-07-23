package com.javaex.oop.point.v4;

public class PointApp {

	public static void main(String[] args) {
		
//		Point p1 = new Point();
//		p1.setX(10);
//		p1.setY(10);
		Point p1 = new Point(10, 10);
		p1.draw();
		p1.draw(true);
		p1.draw(false);
		
//		Point p2 = new Point();
//		p2.setX(20);
//		p2.setY(30);
		Point p2 = new Point(20, 30);
		p2.draw();
		p2.draw(true);
		p2.draw(false);
		
		ColorPoint cp1 = new ColorPoint(10, 20, "red");
		ColorPoint cp2 = new ColorPoint(30, 40, "black");
		
		cp1.draw();
		cp1.draw(true);
		
		cp2.draw();
		cp2.draw(false);
	}
 
}
