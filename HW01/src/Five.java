import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		// 5. 메뉴를 출력하고, 사용자로부터 입력을 받아 선택된 메뉴를 출력하는 프로그램을 작성하시오.
		String fruit;
		
		System.out.println("5번 문제");
		System.out.println("apple");
		System.out.println("orange");
		System.out.println("banana");
		System.out.println("peach");
		System.out.println(" ");
		
		Scanner input = new Scanner(System.in);
		System.out.print("enter your choice here : (사용자 입력) ");
		fruit = input.nextLine(); // 키보드에서 숫자 입력
		
		if(fruit != "apple" || fruit == "banana" || fruit != "orange" || fruit != "peach")
			System.out.println("Your choice is "+ fruit);
		else	
			System.out.println("입력한 값이 메뉴에 없습니다.");


		System.out.println("=============프로그램 종료=============");
	}

}

