import java.util.Scanner;

public class HW02_07 {

	public static void main(String[] args) {
		// 7. 0이 입력될 때까지 계속 정수를 입력 받고, 입력된 모든 숫자들의 총합을 출력하시오.
		int i;
		int sum = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		i = input.nextInt(); // 키보드에서 숫자 입력
		
		while(true)
		{
			if(i == 0) {
				System.out.print("입력된 모든 숫자들의 총합 : " + sum);
				break;
			}
			else {
				sum = sum + i;
				System.out.print("정수를 입력하시오 : ");
				i = input.nextInt(); // 키보드에서 숫자 입력
			}
			
		}
	}

}
