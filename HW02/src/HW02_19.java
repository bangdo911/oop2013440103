import java.util.Scanner;

public class HW02_19 {

	public static void main(String[] args) {
		// 19. 사용자로부터 한 숫자를 입력받아, 입력받은 숫자가 소수인지 아닌지를 검사하는 프로그램을 작성하시오.
		System.out.println("19번 문제");
		
		int number;
		int i = 1;
		int count = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		number = input.nextInt(); 
		
		while(number >= i && count <= 2)
		{
			if(number % i == 0)
				count ++;
			
			i++;
		}
		
		if(count == 2)
			System.out.print("소수입니다.");
		else
			System.out.print("소수가 아닙니다.");

	}

}
