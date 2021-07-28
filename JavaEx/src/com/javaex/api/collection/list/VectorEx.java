package com.javaex.api.collection.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		//	벡터 생성
		//		버퍼 기반
		Vector<Integer> v = new Vector<>();	//	기본 버퍼 10
		//	new Vector<>(용량)
		System.out.printf("Size: %d, Capacity: %d%n", v.size(), v.capacity());
		
		for (int i = 1; i <= 10; i++) {
			v.addElement(i);	//	항목 추가 -> v.addElement(Integer.ValueOf(i)); (오토박싱)
		}
		System.out.printf("Size: %d, Capacity: %d%n", v.size(), v.capacity());
		v.addElement(11);	//	허용량 초과 -> 버퍼 자동 증가
		System.out.printf("Size: %d, Capacity: %d%n", v.size(), v.capacity());
		
		System.out.println("v: " + v);
		
		//	중간에 값을 넣기
		v.insertElementAt(100, 7);
		System.out.println("v: "	 + v);
		
		//	객체 조회: 찾는 객체의 인덱스 반환
		int value = v.elementAt(7);
		System.out.println("인덱스 7의 객체: " + value);
		
		//	객체 인덱스 조회:
		System.out.println("7의 인덱스: " + v.indexOf(7));
		System.out.println("0의 인덱스: " + v.indexOf(0));	//	없는 객체의 인덱스: -1

		//	객체 포함 여부
		System.out.println("100을 포함? " + v.contains(100));
		
		//	객체 삭제
		v.removeElement(100);	//	해당 값 객체 삭제
		System.out.println("v: " + v);
		
		v.removeElementAt(7);	//	인덱스 7의 요소 삭제
		System.out.println("v: " + v);
		
		v.setElementAt(100, 4);	//	인덱스 4의 요소 변경(Update)
		System.out.println("v " + v);
		
		for (int i = 0; i < v.size(); i++) {
			Integer item = v.elementAt(i);
			System.out.print(item + " ");
		}
		System.out.println();
		
		for (Integer item: v) {	//	향상된 for문 -> 배열 등 순차 요소에 적용 가능
			System.out.print(item + " ");
		}
		System.out.println();
		
		//	Enumeration: 반복자
		//	순서대로 요소를 받아올 때는 반복자가 더 효율적
		Enumeration<Integer> e = v.elements();	//	반복자 획득
		while(e.hasMoreElements()) {	//	뒤에 요소가 남아있나 확인
			Integer item = e.nextElement();	//	요소를 추출 후 다음 요소로 이동
			System.out.print(item + " ");
		}
		System.out.println();
		
		//	버퍼 비우기
		v.clear();
		System.out.printf("Size: %d, Capacity: %d%n", v.size(), v.capacity());

	}

}
