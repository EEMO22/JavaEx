package com.javaex.api.arrays;

import java.util.Arrays;

public class ArraysEx {

	public static void main(String[] args) {
		arrayCopyEx();
	}
	
	//	복사
	private static void arrayCopyEx(){
		char[] src = "Java Programming"
				.toUpperCase().toCharArray();
		System.out.println(Arrays.toString(src));
		
		//	방법 1. 루프 돌며 복사
		char[] target = new char[src.length];
		for (int i = 0; i < src.length; i++) {
			target[i] = src[i];
		}
		System.out.println("루프복사: " + Arrays.toString(target));
		
		//	방법 2. System.arrayCopy
		target = new char[src.length];
		System.arraycopy(src,	//	원본 배열
				0, 	//	복사 시작 위치(원본 배열의)
				target,	//	복사 대상 배열
				0,	//	복사 시작 위치(대상 배열의)
				src.length);	//	복사 길이
		System.out.println("시스템 복사: " + Arrays.toString(target));
		
		//	방법 3. Arrays.copyOf
		target = Arrays.copyOf(src,	//	원본 배열
				src.length);	//	복사할 길이
		System.out.println("copyOf 복사: " + Arrays.toString(target));
		
		//	방법 4. Arrays.copyOfRange
		target = Arrays.copyOfRange(src,	//	원본 배열
				5, 	//	복사 시작 인덱스
				src.length);
		System.out.println("copyOfRange 복사: " + Arrays.toString(target));
	}

}
