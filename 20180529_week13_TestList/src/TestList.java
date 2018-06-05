import java.util.*;

public class TestList {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>(); 
		// List<String> list = new LinkedList<String>();
//		list는 refernce variable (주소를 가짐)
//		참조변수의 타입 : List
//		List<String> list = new ArrayList<String>();
//		LinkedList<String> list = new LinkedList<String>();
		list.add(0,"zero");
		list.add("one");
		list.add("two");	
		list.add("three");
		
		list.add(1,"돌");
		
		System.out.println(list);
	}

}

/*
  		Class
  		객체 지향의 3대 특징 : 캡슐화 상속 다형성
  		Encapsulation : 관련된 데이터와 알고리즘이 하나의 묶음으로 정리되어 있는 것
  		Inheritance : 이미 작성된 클래스를 이어받아서 새로운 클래스를 생성하는 기법
  					  기존의 코드를 재횔용하기 위한 기법
  		Polymorphism : 하나의 이름으로 많은 상황에 대처하는 기법
  					  개념적으로 동일한 작업을 하는 멤버 함수들에 똑같은 이름을 부여 할 수 있으므로 코드가 더 간단해진다.
 
 
	 	Upcasting(형변환) : 부모타입(인터페이스)의 참조변수로 자식타입(구현클라스)의 객체를 참조하는 것
 
 
 
 */
 