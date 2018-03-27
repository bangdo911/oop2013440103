import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		// 3. 세 수(정수형)를 입력 받아 가장 큰 수를 출력하는 프로그램을 작성하시오.
		System.out.println("3번 문제");
		
		int one; int two; int three;
		
		Scanner input = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하시오 : ");
		one = input.nextInt(); // 키보드에서 숫자 입력
		System.out.print("두번째 정수를 입력하시오 : ");
		two = input.nextInt(); // 키보드에서 숫자 입력
		System.out.print("세번째 정수를 입력하시오 : ");
		three = input.nextInt(); // 키보드에서 숫자 입력
		
		if(one > two) {
			if(one > three)
				System.out.print(one);
			else
				System.out.print(three);
		}
		else {
			if(two > three)
				System.out.print(two);
			else
				System.out.print(three);
		}	
	}
}
