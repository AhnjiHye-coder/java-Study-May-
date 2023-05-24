package operator;

public class Ex01 {
	// 논리 연산자 : &&, ||, !
	// boolean 타입의 값을 연산한다
	// && (and) : 서로 다른 두 조건이 무두 true이면 true를 나타낸다
	// || (or)  : 서로 다른 두 조건 중 하나라도 true이면 true를 나타낸다
	// !  (not) : 단항 연산자이며 true는 false로 바꾸고, false는 true로 바꾼다
	public static void main(String[] args) {
		boolean bo1 = true;
		boolean bo2 = false;
		
		System.out.println("bo1 && bo2 : " + (bo1 && bo2));
		System.out.println("bo1 && bo2 : " + (bo1 && true));
		System.out.println("bo1 || bo2 : " + (bo1 || bo2));
		System.out.println("false || bo2 :" + (false || bo2));
		
		// and 연산자
		// 서로 다른 두 조건을 동시에 만족하면서 true
		// 성별이 남성이고, 나이가 20세이면 경우에만 true
		String gender = "남성";
		int age = 25;
		
		boolean flag1 = gender.equals("남성") && age >= 20;
		
		System.out.println("flag1 : " + flag1);
		
		// or 연산자
		// 서로 다른 두 조건 중 하나라도 만족하면 true
		// 현금이 5천원 이상이었거나, 카드를 가지고 있다면 true
		int cash = 10000;
		boolean hasCard = false;
		
		boolean flag2 = cash >= 5000 || hasCard == true;
		System.out.println("flag2 : " + flag2);
		
		// not 연산자
		// 기초 조건의 반대경우를 나타내고 싶을때 !를 붙여준다
		// 단항 연산이 위보다 우선순위가 높다
		System.out.println("!flag1 : " + !flag1);
		
		boolean tvPower = false;
		
		System.out.println("tyPower : " + tvPower);
		tvPower = !tvPower;
		
		System.out.println("tyPower : " + tvPower);
		tvPower = !tvPower;
		
		System.out.println("tyPower : " + tvPower);
		tvPower = !tvPower;
		
		System.out.println("tvPower : " + tvPower);
		
		
		
		
		 
		
		
		
		
	}
}
















