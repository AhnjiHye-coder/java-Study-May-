package output;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		// 생년월일을 8자리 정수로 입력 받아서
		// 올해연도를 이용하여 나이를 계산하여 출력하기
		// 출생 : yyyy - mm - dd
		// 나이 : x살
		
		int currentYear = 2023;
		int birthYear;
		int month;
		int data;
		int age;
		
		// 올해에서 내 년도 빼기하고  + 1 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("생년월일 입력 (8자리) : ");
		birthYear = sc.nextInt();
		
		
		
		data = birthYear % 100;
		birthYear = birthYear / 100;
//		birthYear /= 100;
		month = birthYear % 100;
		birthYear = birthYear / 100;
//		birthYear /= 100;
		
		
		age = currentYear - birthYear + 1;
		
//		System.out.println(data); //18
//		System.out.println(month); // 12
//		System.out.println(birthYear); // 98
		
		System.out.println("출생 : " + birthYear + "-" + month + "-" + data);
		System.out.println("나이 : " + age);
		
		
		
	}
}
