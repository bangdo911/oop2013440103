public class RememberC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.print("Hello World!");
		System.out.println("Hello World!");
		//주석 : println 은 개행이 있다. print는 개행이 없다.

		/*
		 Todays' Topic
		 변수(Variable)
		 자료형(Data Structure)
		 변수선언(Variable Declaration)
		*/
		
		// 변수 : 메모리 저장공간의 이름
		// 자료형 : 
		// 1. 변수가 가질 수 있는 값의 범위를 정한다.
		// 2. 변수를 피연산자로 사용할 경우, 사용할 수 있는 연산자를 정한다.
		// 3. 값을 메모리에 저장하기 위해 필요한 정보(저장공간의 수, 저장 포맷)을 정한다
		// 변수 선언문
		// 변수를 사용하기 위해 필요한 아래의 정보를 표현한다.
		// 1. 사용할 변수의 이름을 지정한다
		// 2. 사용할 변수의 자료형을 선언한다.
		// Java에서 변수를 사용하기 전에 반드시 변수선언을 해야한다.
		
		int a, b; // 1. a는 변수이름이다. 2. 변수 a의 자료형은 int이다.
		
		// 리터럴(literal) : 소스코드에서 값을 표현하는 방법.
		// 대입연산자(=) : 우변의 값을 좌변의 저장소로 이동한다. AND 우변의 값을 반환한다.
		// 수식(Expression) : 
		// 연산자와 피연산자(리터럴, 변수, 수식)들의 조합.모든 수식은 값을 반환(리턴)한다.
		// 부수효과 : 수식이 값을 봔환하는 것 이외 수행하는 모든 작업을 부수효과라 한다.
		a = 10;
		
		//post increment(a++) : 반환값은 a, 부수효과는 a = a + 1; 
		b = a++;
		System.out.println("a = "+ a + " b = "+ b); // "a = "는 문자열, +는 연산자
		
		// pre increment(++a) : 반환값은 a + 1, 부수효과는 a = a + 1; 
		b = ++a;
		System.out.println("a = "+ a + " b = "+ b); // "a = "는 문자열, +는 연산자
		
		// Java는 부울 자료형과 true/false 리터럴을 사용한다.
		// 논리연산자의 피연산자는 부울 변수 또는 리터럴을 사용해야 한다.
		// 관계연산자(>, <, <=, >=, ==, !=)는 부울 값을 반환한다.
		boolean bb;
		bb = true || false;
		//bb = false;
		System.out.println("bb = " + bb);
		System.out.println((1>0));
		System.out.println((1<0));
		
		// Java에서 상수를 선언하려면 final 키워드를 사용해야 한다. 
		// final 변수는 못바꾼다.
		final int c = 100;
		// C = 1000; // error
		int d;
		d = a + c;
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
		// 소숫점 자료형 (float, double)
		float ff;
		double gg;
		ff = 3.14f;
		gg = 3.14; // 리터럴 "3.14"의 자료형은 double이다.
		System.out.println("ff = "+ ff + " gg = "+ gg);
		
		// 형변환(casting) : 유사한 자료형으로 변환한다. 중요!
		int x = 10;
		double y = 100.34;
		x = (int) y; // explicit cast
		// y = (double) x; // implicit cast
		System.out.println("x = " + x + " y = "+ y);
		
		System.out.println("Helloooo " + "Worldddd ");

		
	}

}
