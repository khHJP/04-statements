package com.sh.test.condition;

import java.util.Scanner;

/**
 * 키cm 몸무게kg 입력
 * BMI계산 = 체중 / 신장 * 신장 (m)
 * 저체중 < 18.5
 * 정상체중 18.5 <= <23
 * 23 <= 과체중 < 25
 * 25 <= 비만 < 30
 * 30 <= 고도비만
 * 출력
 * @author cc894
 *
 */
public class Test5 {
	public static void main(String[] args) {
		Test5 te = new Test5();
		te.test();
	}
	public void test() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키(cm) : ");
		double cm = sc.nextDouble();

		System.out.println("몸무게(kg) : ");
		double kg = sc.nextDouble();
		
		// BMI 계산
		double bmi = kg / (cm*cm/10000);
		System.out.println(bmi);
		
		if (bmi <18.5) {
			System.out.println("저체중입니다.");
		}
		else if (bmi < 23) {
			System.out.println("정상체중입니다.");
		}
		else if (bmi <25) {
			System.out.println("과체중입니다.");
		}
		else if (bmi <30) {
			System.out.println("비만입니다.");
		}
		else {
			System.out.println("고도비만입니다.");
		}
		
		
/*		if (18.5 <= bmi && bmi < 23) {
			System.out.println("정상체중입니다.");
		}
		if (23 <= bmi && bmi <25) {
			System.out.println("과체중입니다.");
		}
		if (25 <= bmi && bmi <30) {
			System.out.println("비만입니다.");
		}
		if (bmi <18.5) {
			System.out.println("고도비만입니다.");
		}
*/		
		
	}
	
}

