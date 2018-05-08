package lbd1;

public class Dog extends Animal{
	public String name;
	private String idn;
	String nickName; // package 접근지정 : 패키지 내에서만 public으로 사용된다.
	
	void print() {
		System.out.println(publicField);
		//System.out.println(privateField);
		System.out.println(packageField);
		System.out.println(protectedField);
	}
}
