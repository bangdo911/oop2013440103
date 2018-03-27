import java.util.Scanner;

public class HW02_11 {

	public static void main(String[] args) {
		// 10. 소수(prime-number) 검사와 흡사하게 사용자가 입력한 수의 인수들을 모두 출력하는 프로그램을 작성하시오.
		// 8 => 2 4 
		// 12 => 2 3 4 6
		
		// 11. 위의 문제를 0을 입력하기 전까지는 계속 수행(인수 출력)하도록 수정하시오.
		
		int i;
		int j;
		
		Scanner input = new Scanner(System.in);
		System.out.print("2 이상의 정수를 입력하시오 : ");
		i = input.nextInt(); // 키보드에서 숫자 입력
		
		while(true)
		{
			if(i == 0) {
				System.out.println("=============프로그램 종료=============");
				break;
			}
			else{
				j = 1;
				System.out.print(i + " => ");
				while(i >= j){
					if(i % j == 0)
						System.out.print(j + " ");
					j++;
				}
				System.out.println(" ");
				System.out.print("2 이상의 정수를 입력하시오 : ");
				i = input.nextInt(); // 키보드에서 숫자 입력
			}
		}
		

	}

}
