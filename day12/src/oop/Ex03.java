package oop;

class Test1{
	// 멤버 필드 : 변수, 객체가 소멸하기 전까지 유지되는변수
	
	int n1 = 10;	// 초기값을 지정할 수 있다
	int n2 = 20;	// 초기값을 지정하지 않으면, 자료형에 맞게 0에서
	//				      해당하는 값으로 초기화 된다
	
	
	// 멤버 메서드 : 함수, 클래스에 의해 생성된 객체는 메서드를 호출할 수 있다
	//			메서드 내부에서는 멤버필드를 참조할 수 있다
	void showAdd() {
		System.out.printf("%d + %d = %d\n", n1, n2, n1+n2);
	}
	
	// 매개변수는 함수 지역 안에서만 유효한 지역변수이다
	void showMultiple(int m) {
		System.out.printf("%d * %d = %d\n", n1, m, n1*m);
	}
	
	
	// 생성자 : 객체를 생성할때 초기값을 지정하거나, 초기작동을 지정하는 특수한
	// 함수이며, 생성자는 클래스의 이름과 동일한 이름을 사용해야 하는 함수이다
	// 생성자는 반환현을 작성하지 않는다
	Test1(){
		System.out.println("객체를 생성하면 생성자가 호출된다");
	}
	
	// 접근 제어자: 내부 멤버요소(필드,메서드,생성자)에 대한 외부로부터의 접근을 제한한다
	
}


public class Ex03 {
	public static void main(String[] args) {
		// 생성자를 호출하면 객체를 생성하고
		// 객체를 참조변수가 가리키도록 처리한다
		// 새로운 객체를 만들고 그 객체를 ob1이 가리키라는 의미로 새로 만들어지기 때문에 new라고 한다
		// new로 객체가 Test1클래스가 호출되면
		// 클래스에 있는 필드를 만들고 메서드가 실행되어 출력한다
		//(할당 값 -> 생성자 안에 추가 코드 작업
		
		Test1 ob1 = new Test1();
		
		// 하나의 클래스로 서로 다른 객체를 생성할 수 있다
		Test1 ob2 = new Test1();
		
		ob1.showAdd();
		ob2.showMultiple(2);
		
		
		
		
		
		
		
		
	}
}






