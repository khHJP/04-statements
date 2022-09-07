package com.sh.test.condition;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Test2 te = new Test2();
		te.test();
	}
	public void test() {
		
		// 정수형 입력받기
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("국어: ");
		int kr = sc.nextInt();
		System.out.println("영어: ");
		int eng = sc.nextInt();
		System.out.println("수학: ");
		int math = sc.nextInt();
		
		
		// 총점 계산
		int sum = kr + eng + math;
		System.out.println("총점: " + sum);
	
		// 평균 계산
		double average = sum/(double)3;
		System.out.println("평균: " + average);
		
		// 합격여부처리
		if ((kr >= 40 && eng >= 40 && math >= 40) 
								&& average >= 60 ) {
			System.out.println("합격입니다.");
		}
		else {
			System.out.println("불합격입니다.");
			
		}

	}
	
}
