
public class TestString {

	public static void main(String[] args) {
		int a = 10; // int���� ���� a ���� + �� 10�� a�� ����
					// int�� ���ú���(primitive valuable)
		// TODO Auto-generated method stub
		// string ��ü ����
		String str; //Ŭ���� ��Ʈ���� ��ü�� ������ �� �ִ� ���� ����(���۷��� ����) ����
					// String : Ŭ���� �̸�
					// str�� ��������(reference valuable)
		str = new String("Hello darkness my old friend."); // ��ü ����
		int len = str.length();
		
		System.out.println("string length is : "+ len);
		System.out.println("string length is : "+ str.length());		
		System.out.println(str.substring(0,8));	
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
	}

}
