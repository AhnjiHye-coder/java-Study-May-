package control;

import java.util.Scanner;

public class Quiz6 {
	public static void main(String[] args) {
		
		/*
		 놀이기구 이용시간에 따른 요금을 계산하여 출력하세요
		 
		 기본 요금은 3천원이며, 10분달 500원의 요듬이 추가로 발생합니다
		 기본 요금이 적용되는 구간은 0 ~ 30분 입니다
		 
		 	시간			금액
		   0 ~ 30	   3.000원	
		  31 ~ 40	   3.500원	
		  41 ~ 50	   4.000원	
		  51 ~ 60	   4.500원
		   ...	
		   
		   이후 시간대에서도 동일한 규칙으로 적용되어야 합니다
		 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int time, cost; // 이용시간, 요금
		System.out.print("이용시간 : ");
		time = sc.nextInt();
		
		
		if(time <= 30) { // 기본시간 30분은 기본요금 3000원
			cost = 3000;
		}
		else {
			 // 10분당 500원 증가로 10으로 나눴을때 0으로 떨어지면 증가
			if(time % 10 == 0) {
				cost = 3000 + (500 * (((time - 30) / 10) + 0));
				// 기존 3000에서 10분 증가로 500원 추가/ 타임에서 30을 뺀(기본시간)을 뺀
				// 값에서 10을 나누면 40분일때 10분이 되므로 10분 초과했다는 것을 의미한다
				// 10으로 떨어지는 것만 증가시킨다
			}
			else {
				cost = 3000 + (500 * (((time - 30) / 10) + 1));
				// 마찬가지로 3000원에서 10분 단위로 500원씩 추가될때
				// 이용시간에서 30을 빼고 10을 나눴을때 만약 43이라면 3의 대한 부분에서도 금액이 추가될 수
				// 있도록 코드를 구현해보았다
				// 이용시간에서 30분을 빼고 10으로 떨어질때, 10으로 떨어지는 그 단위의
				// 1 ~ 9까지의 금액도 500원으로 변동없게 한다는 코드
				// 즉 10분단위로 500원씩 증가되며 45,46 등 10으로 떨어지지 않아도
				// 40분에서 50넘어가기 전까지는 동일한 금액이다
				
				// 어차피 이용시간은 한번 들어오기 떄문에 이용시간 제외 10분 이용했다면
				// 그의 대한 10분의 식만 적용이 되고, 기본시간 빼기 13분 등 10으로 딱 떨어지지 않아도
				// (time - 30) / 10)의 식에 의해 그 시간대에 이용시간으로 계산되고  + 1)식으로
				// 10  == 0떨어지지 않아도 들어온 값에 대한 분의 요금으로 계산될 수 있는 것이다
				// 만약 50분 이라면 time에서 30빼면 20분되고 따라서 자동으로 10을 나누는데 2로 떨어지면서
				// 500 * 2가 되는 것이다
				
				
			}
			
		}
		
		
		
	}// end of main
	
}// end of class
