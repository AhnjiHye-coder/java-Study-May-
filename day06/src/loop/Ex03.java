package loop;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {
	// 횟수가 일정하지 않거나, 횟수를가늠하기 어려운 반복
	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int num = ran.nextInt(6) + 1;
		int answer;
		int cnt = 0;
		
		System.out.print("1에서 6사이의 랜덤값 : ");
		answer = sc.nextInt();
		cnt++;
		
		while(answer != num) {
			System.out.println("틀렸습니다. 다시시도 : ");
			answer = sc.nextInt();
			cnt++;
		}
		System.out.println(cnt + "번 만에 정답을 맞췄습니다");
		
		sc.close();
		
	}
}
