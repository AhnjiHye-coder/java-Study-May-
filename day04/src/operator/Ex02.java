package operator;

public class Ex02 {
	public static void main(String[] args) {
		// 논리 연산자의 특징
		
		// 1) A && B는 양쪽 모두 true이여야 전체 결과가 true이다
		// 만약, A가 false라면 B의 결과에 상관없이 전체 결과는 false이다
		// 따라서, A가 false라면 B의 내용은 체크하지 않는다
		// 하나라도 참이면 코드수행 X
		
		// 2) A || B는 양쪽모두 false이여야 전체 결과가 false이다
		// 만약 A가 true라면 B의 결과에 상관없이 전체 결과가 true이다
		// 따라서, A가 true라면 B의 내용은 체크하지 않는다
		// 한쪽이 거짓이면 전체 결과를 체크하지만 한쪽이 참이면 모두 참으로 인하여 코드수행 X
		
		int a = 2, b = 1, c = 0, d = -1;
		System.out.printf("%d, %d, %d, %d\n", a, b, c, d);
		System.out.println();
		
		boolean bo1 = (a++ + ++b < 0) && (c++ + b-- == 0);
		System.out.println("bo1 : " + bo1);
		System.out.printf("%d, %d, %d, %d\n", a, b, c, d);
		System.out.println();
		
		boolean bo2 = ((a *= 2) > b) || ((c *= b)!= 0);
		System.out.println("bo2 : " + bo2);
		System.out.printf("%d, %d, %d, %d\n", a, b, c, d);
		
		// 제어문의 조건으로 활용할때 !flag 형식으로 사용하거나
		// flag == false 형식으로 사용할 수 있다
		
		int age = 15;
		boolean isAdult = (age>= 20);
		
		// if 두 조건문 모두 같은 의미, 조건인데 같은 결과이지만 작성 스타일이 다르다
		// 가독성이 있게 작성하는가? 간결하게 깔끔한 코드로 작성하는가?로 나뉜다
		if(!isAdult) {	// 1, 간결하게 표현하고 싶을때
			System.out.println("성인이 아닙니다");
		}
		if(isAdult == false) {	// 명확하게 표현하고 싶을때(가족성 좋음)
			System.out.println("성인이 아닙니다");
		}	
	}
}
// for(int i = 0; cookies != null && i < cookies.length; i++)
// {...종속문장...}
// 위 코드는 쿠키라는 함수가 있다
// 쿠키가 있다면 쿠키 길이만큼 반복하고 없다면 실행하지 않는다는 조건문이다

















