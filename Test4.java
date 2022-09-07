package com.sh.test.condition;

import java.util.Scanner;

/**
 * 1~10사이 정수 한개 입력
 * 홀/짝 확인 -> "홀수다", "짝수다"
 * "반드시 1~10사이의 정수를 입력해야 합니다."
 * @author cc894
 *
 */
public class Test4 {
	public static void main(String[] args) {
		Test4 te = new Test4();
		te.test();
	}
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 10 사이의 정수를 입력해주세요> ");
		int num = sc.nextInt();
		
		// 홀짝확인
		if (1 <= num && num <= 10) {
			if (num%2 == 0) {
				System.out.println("짝수입니다.");
			}
			else {
				System.out.println("홀수입니다."); 
			}
		}
				
		else {System.out.println("반드시 1~10사이의 정수를 입력해야 합니다.");			}
		}
	}


