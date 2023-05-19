package operator;

public class Ex03 {
	public static void main(String[] args) {
		// 삼항 연산자
		// A ? B : C
		// A 조건이 참이면 B값으로 결정하고, 아니면 C 값으로 결정한다
		// 조건에 따라 서로 다른 값 중 하나를 결정짓는 연산자
		
		// if는 조건에 따라서 서로 다른 코드를 수행하는 것이 목적(행위)
		// 삼항 연산자는 두개의 값 중 하나를 결정하는 것이 목적(값)
		
		int age = 25;
		boolean isAdult = age >= 20;
		
		System.out.println(isAdult ?  "성인" : "미성년자");
		
		String adult = isAdult ? "성인" : "미성년자";
		System.out.println("adult : " + adult);
		
		// 연산자 중첩 (선호하지는 않는다)
		// 연산자 중첩을 한 극단적인 예시
		int num = 0;
		String oddEven = num == 0 //num이 0이면
							? "Zero"	// Zero를 대입
							: num % 2 == 0	// 0이 아니고 num이 2로 나누어 떨어지면
								? "짝수"	// 짝수를 대입
								: "홀수";	// 아니면 홀수를 대입
		System.out.println("oddEven : " + oddEven);
		
		// 잘못된 예시 
		// 왜 ? : 바로 출력을 원하지 말고 값을 대입해서 결과를 얻어야 한다
//		num % 2 == 0 ? System.out.println("짝수") : System.out.println("홀수");;
		
		String test = "123411";
		int test2 = isDigit(test) ? Integer.parseInt(test) : 0;
		System.out.println("test2 : " + test2);
		
	}
	
	// 문자열의 글자들이 모두 숫자로만 구성되었는지 검사하여 결과를 boolean으로 반환하는 함수
	static boolean isDigit(String s) {	// 문자열 s를 전달 받아서
		boolean answer = true;
		for(int i = 0; i<s.length(); i++) {	// 처음부터 끝까지 글자 하나씩 꺼내서
			if(s.charAt(i) < '0' || '9' < s.charAt(i)) {	// 0보다 작거나 9보다 크다면
				return false;	// false를 반환(함수 중단)
			}
		}
		return answer;	// 문제없이 통과하면 true를 반환
		
	}
}
