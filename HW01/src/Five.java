import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		// 5. �޴��� ����ϰ�, ����ڷκ��� �Է��� �޾� ���õ� �޴��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		String fruit;
		
		System.out.println("5�� ����");
		System.out.println("apple");
		System.out.println("orange");
		System.out.println("banana");
		System.out.println("peach");
		System.out.println(" ");
		
		Scanner input = new Scanner(System.in);
		System.out.print("enter your choice here : (����� �Է�) ");
		fruit = input.nextLine(); // Ű���忡�� ���� �Է�
		
		if(fruit != "apple" || fruit == "banana" || fruit != "orange" || fruit != "peach")
			System.out.println("Your choice is "+ fruit);
		else	
			System.out.println("�Է��� ���� �޴��� �����ϴ�.");


		System.out.println("=============���α׷� ����=============");
	}

}
