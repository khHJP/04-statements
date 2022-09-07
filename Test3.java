package com.sh.test.condition;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Test3 te = new Test3();
		te.test();
	}
	public void test() {
		//정수 두개 입력, 연산자 입력 계산하ㅏ고 출력
		// 5, 6, +
		// 5+6=11
		Scanner sc = new Scanner(System.in);
		int n1 = inputNumber(1);
		int n2 = inputNumber(2);

		System.out.println("연산자> ");
		String cal = sc.next();
		int n3;
		
		
		if (n1>=0 && n2>=0) {
			if(cal.equals("+")) {
				n3 = n1 + n2;
				System.out.printf("%d%s%d = %d", n1, cal, n2, n3);
			}
			else if(cal.equals("-")) {
				n3 = n1 - n2;
				System.out.printf("%d%s%d = %d", n1, cal, n2, n3);
			}
			else if(cal.equals("/")) {
				n3 = n1 / n2;
				System.out.printf("%d%s%d = %d", n1, cal, n2, n3);
			}
			else if(cal.equals("*")) {
				n3 = n1 * n2;
				System.out.printf("%d%s%d = %d", n1, cal, n2, n3);
			}
			else {
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			}
		}
		else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
	}
					
	
	public int inputNumber(int n) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수%d> ", n);
		return sc.nextInt(); 
	}
	
}
