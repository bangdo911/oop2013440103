
public class TestString {

	public static void main(String[] args) {
		int a = 10; // int형의 변수 a 생성 + 값 10을 a에 저장
					// int는 원시변수(primitive valuable)
		// TODO Auto-generated method stub
		// string 객체 생성
		String str; //클래스 스트링의 객체를 참조할 수 있는 참조 변수(레퍼런스 변수) 생성
					// String : 클래스 이름
					// str은 참조변수(reference valuable)
		str = new String("Hello darkness my old friend."); // 객체 생성
		int len = str.length();
		
		System.out.println("string length is : "+ len);
		System.out.println("string length is : "+ str.length());		
		System.out.println(str.substring(0,8));	
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
	}

}
