
public class TestString {

	public static void main(String[] args) {

		String str1 = new String("Hello");
		String str2 = new String("Hello");
		
		// str1과 str2의 주소값을 비교하기 때문에 false가 나옴
		
		
		System.out.println(str1==str2);
		// 내용을 확인하는 식
		System.out.println(str1.equals(str2));
		
		// str1의 주소를 바꾸는 식
		str1 = str2;
		System.out.println(str1==str2);
		
	}

}
