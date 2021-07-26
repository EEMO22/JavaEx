package com.javaex.oop.summary;

public abstract class Animal {
	//	필드
	protected String name;
	protected int age;
	
	
	//	생성자
	public Animal(String name) {
		super();
		this.name = name;
	}
	
	public Animal(String name, int age) {
		//	자신의 다른 생성자 호출
		this(name);	//	바로 위의 생성자를 부른 것
		this.age = age;
	}
	
	//	메서드
	public void eat() {
		System.out.printf(
				"%s is eating...%n", name);
	}
	
	//	추상 메서드 (추상클래스는 1개 이상의 추상메서드 필요): 선언만 한다
	//	자식 클래스에서 OVerride 해야 한다
	public abstract void say();
}
