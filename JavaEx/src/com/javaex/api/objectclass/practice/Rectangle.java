package com.javaex.api.objectclass.practice;

public class Rectangle {

	private int width;
	private int height;
	

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
		
	
	@Override
	public String toString() {
		return String.format("width, height", width, height);
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Rectangle) {
			Rectangle other = (Rectangle)obj;
			return width * height == other.width * other.height;
		}
		return super.equals(obj);
	}
}
