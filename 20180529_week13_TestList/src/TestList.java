import java.util.*;

public class TestList {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>(); 
		// List<String> list = new LinkedList<String>();
//		list�� refernce variable (�ּҸ� ����)
//		���������� Ÿ�� : List
//		List<String> list = new ArrayList<String>();
//		LinkedList<String> list = new LinkedList<String>();
		list.add(0,"zero");
		list.add("one");
		list.add("two");	
		list.add("three");
		
		list.add(1,"��");
		
		System.out.println(list);
	}

}

/*
  		Class
  		��ü ������ 3�� Ư¡ : ĸ��ȭ ��� ������
  		Encapsulation : ���õ� �����Ϳ� �˰����� �ϳ��� �������� �����Ǿ� �ִ� ��
  		Inheritance : �̹� �ۼ��� Ŭ������ �̾�޾Ƽ� ���ο� Ŭ������ �����ϴ� ���
  					  ������ �ڵ带 ��Ȼ���ϱ� ���� ���
  		Polymorphism : �ϳ��� �̸����� ���� ��Ȳ�� ��ó�ϴ� ���
  					  ���������� ������ �۾��� �ϴ� ��� �Լ��鿡 �Ȱ��� �̸��� �ο� �� �� �����Ƿ� �ڵ尡 �� ����������.
 
 
	 	Upcasting(����ȯ) : �θ�Ÿ��(�������̽�)�� ���������� �ڽ�Ÿ��(����Ŭ��)�� ��ü�� �����ϴ� ��
 
 
 
 */
 