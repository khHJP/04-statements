package com.sh.test.random;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {

	public static void main(String[] args) {
		RandomTest rd = new RandomTest();
//		rd.test1();
//		rd.test2();
		
	}
	public void test1() {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("숫자를 선택하세요(1.가위/2.바위/3.보) :");
		int user = sc.nextInt();
		
		System.out.println("======== 결과 ========");
		
		System.out.print("당신은 ");
		
		if (user == 1) {
			System.out.print("가위");
		}
		else if (user == 2) {
			System.out.print("바위");
		}
		else {
			System.out.print("보");
		}
		System.out.println("를 냈습니다.");
		
		int com = (int) (Math.random() * 3 + 1);
		
		System.out.print("컴퓨터는 ");
		if (com == 1) {
			System.out.print("가위");
		}
		else if (com == 2) {
			System.out.print("바위");
		}
		else {
			System.out.print("보");
		}
		System.out.println("를 냈습니다.");
		
		System.out.println("====================");
		
		if (user == com) {
			System.out.println("비겼습니다.");
		}
		else if (( user == 2 && com == 1) || ( user == 3 && com == 2) || ( user == 1 && com == 3)) {
			System.out.println("당신이 이겼습니다. ㅠ.ㅠ");
		}
		else {
			System.out.println("당신이 졌습니다.");
					}				
		
	}

	public void test2() {
		Random rnd = new Random();

		// 0 ~ 9까지
		int n1 = rnd.nextInt(10);
		
		// 1 ~ 10까지
		int n2 = rnd.nextInt(10) + 1;
		
		// 20 ~ 35까지
		int n3 = rnd.nextInt(16) + 20;
		
		// 0 또는 1
		int n4 = rnd.nextInt(2);
		
		System.out.printf("%d, %d, %d, %d",n1,n2,n3,n4);
	}
	
}
