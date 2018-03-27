import java.util.Scanner;

public class HW02_21 {

	public static void main(String[] args) {
		// 21. 사용자로부터 한 숫자를 입력받아, 입력받은 숫자 이하의 소수들의 합을 구하는 프로그램을 작성하시오.
		System.out.println("21번 문제");
				
			int number;
			int i = 1;
			int j;
			int count = 0;
			int sum = 0;
			
			Scanner input = new Scanner(System.in);
			System.out.print("정수를 입력하시오 : ");
			number = input.nextInt(); 
				
			while(number >= i){
				j = 1;
				count = 0;
				while(i >= j) {
					if(i % j == 0)
						count ++;
					j++;
				}
				if(count == 2)
					sum = sum + i;
				i++;
			}		
			System.out.println("소수의 합 : " + sum);
			System.out.println("=============프로그램 종료=============");
	}

}
