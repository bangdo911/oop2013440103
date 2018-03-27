import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		//2. 하나의 정수를 입력 받아 이 수가 짝수(even number)인지 홀수(odd number)인지를 출력하는 프로그램을 작성하시오.
		System.out.print("2번 문제");		
		
		int one;
		
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		one = input.nextInt(); // 키보드에서 숫자 입력
		
		if(one % 2 == 1)	{
			System.out.print("홀수입니다. ");
		}
		else {
			System.out.print("짝수입니다. ");
		}
	}

}
