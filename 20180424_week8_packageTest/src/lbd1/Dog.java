package lbd1;

public class Dog extends Animal{
	public String name;
	private String idn;
	String nickName; // package �������� : ��Ű�� �������� public���� ���ȴ�.
	
	void print() {
		System.out.println(publicField);
		//System.out.println(privateField);
		System.out.println(packageField);
		System.out.println(protectedField);
	}
}
