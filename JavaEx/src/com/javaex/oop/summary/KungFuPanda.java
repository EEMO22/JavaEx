package com.javaex.oop.summary;

public class KungFuPanda extends Panda implements KungFuSkill {
								//	Animal 을 상속받은 Panda를 상속
	//	생성자
	public KungFuPanda(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void kungfu() {
		System.out.printf("%s: 아뵤~%n", name);
	}

}
