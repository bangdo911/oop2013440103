
public class TestString {

	public static void main(String[] args) {

		String str1 = new String("Hello");
		String str2 = new String("Hello");
		
		// str1�� str2�� �ּҰ��� ���ϱ� ������ false�� ����
		
		
		System.out.println(str1==str2);
		// ������ Ȯ���ϴ� ��
		System.out.println(str1.equals(str2));
		
		// str1�� �ּҸ� �ٲٴ� ��
		str1 = str2;
		System.out.println(str1==str2);
		
	}

}
