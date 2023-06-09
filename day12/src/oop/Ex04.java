package oop;


class Test2{
	int n1;
	
	void up(int n3) {
		int n2 = 0;
		
		// n1 : 객체 소속(클래스 소속)
		n1 += 1;
		// n2 : up의 변수로 지역변수
		n2 += 1;
		// n3 : 매개변수
		n3 += 1;
		
		// 멤버필드 : 객체 소멸전까지 유지됨
		System.out.println("n1 : " + n1);
		
		// 지역변수 : 함수 실행시 생성되고 종료되면 소멸
		System.out.println("n2 : " + n2);
		
		// 매개변수 : 함수 실행시 값이 지정되고 종료되면 소멸(지역변수의 일종)
		System.out.println("n3 : " + n3);
		System.out.println();
		
		// 지역변수,매개변수는  함수가 종료되면 소멸되며,
		// 다시 실행하면 새로 시작하기 때문에 n2의 결과는 당연하다
		// n2가 0으로 시작하여 1이 증가했지만 소멸되면서 사라지고
		// 다음 호출로 n2는 다시 0이 도고 1로 증가한 후 소멸한 것이기 때문이다
		
	}
}
public class Ex04 {
	public static void main(String[] args) {
		Test2 ob = new Test2();
		
		ob.up(10);
		ob.up(20);
		ob.up(25);
		
		System.out.println("ob.n1 : " + ob.n1);
		// .은 연산자이며 객체 내부 멤버 요소에 접근하는 연산자이다(필드,메서드)
		// ~의 소유격 조사에 해당하는 기호
		// o1.name : o1객체 내부의 필드 name
		// o2.name : o2객체 내부의 필드 name
	}
}
