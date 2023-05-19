package operator;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// Ex04의 Scanner 형식을 참조하여 다음 조건을 만족하는 코드를 작성하세요
		// 정수를 하나 입력 받아서, 홀수와 짝소를 문자열로 출력하는 코드를 작성합니다
		// 단, 0은 짝수로 취급합니다
		
		Integer n1 = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		n1 = Integer.parseInt(sc.nextLine());
		
		// 1방법
		System.out.println(n1 % 2 == 0 ? "짝수" : "홀수");
		
		// 2방법
		if(n1 % 2 == 0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		
		// 선생님 방법
		int num;
		
		System.out.println("정수 하나 입력 : ");
		num = Integer.parseInt(sc.nextLine());
		
		String result = num % 2 == 0 ? "짝수" : "홀수";
		System.out.println(num + "은 : " + result + "입니다");
		
		sc.close();
	}
}
