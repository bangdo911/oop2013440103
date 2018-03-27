import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		// 6. 어떤 두 자리 수의 자릿수의 순서를 서로 바꾸는 프로그램을 작성하시오.
		// 사용자 입력 : 한 개의 두 자리 정수
		// 출력 : 자릿수의 순서가 반대로 된 정수
		System.out.println("5번 문제");
		
		int one;
		
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		one = input.nextInt(); // 키보드에서 숫자 입력
		
		if(one >= 10 && one < 100)
		{
			one = (one % 10) * 10 + (one / 10);
			System.out.print(one);
		}
		else
			System.out.print("두 자릿수의 정수를 입력하시오.");
	}

}
