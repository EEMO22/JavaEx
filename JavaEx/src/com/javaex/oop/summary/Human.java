package com.javaex.oop.summary;

public class Human extends Animal {
				// 	-> 생성자를 지정 안 해 줘서 기본 생성자 만들어 주려고 함
				//	-> 부모의 기본 생성자를 가져 오려는데 부모의 생성자는 그게 아님
				// - > 에러
	public Human(String name, int age) {
		//	명시적으로 부모 생성자 호출
		super(name, age);
	}

	@Override
	public void say() {
		//	Animal 클래스의 추상 메서드 -> 반드시 Override(덮어쓰기)
		System.out.printf("안녕 나는 %s입니다.%n", name);
	}

}
