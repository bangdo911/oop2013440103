import java.util.Scanner;

public class HW02_15 {

	public static void main(String[] args) {
		// 15. 1~100 사이의 숫자 하나를 정한 뒤(랜덤으로 생성해도 됨), 
		// 10번 이내로 그 숫자를 맞추는 게임을 작성하시오.(10번 이내로 못 맞추었을 경우는 
		// 약간 머리가 딸리는 사람이므로  Game Over 처리를 신랄하게 해 주기 바람)
		System.out.println("15번 문제");
		
		int i = 49;
		int j = 1;
		int k;
		
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		k = input.nextInt(); 
		
		while(j <= 10)
		{
			
			if(k == i) {
				System.out.println("정답입니다!");
				System.out.println("=============프로그램 종료=============");
				break;
			}
			else {
				if(k > i)
					System.out.println("입력하신 숫자보다 작습니다.");
				else
					System.out.println("입력하신 숫자보다 큽니다.");
			}
			
			System.out.print("정수를 입력하시오 : ");
			k = input.nextInt(); 
			
			j++;
		}
		
		if(j > 10) {
			System.out.println("Game Over!! 머리가 딸리시는군요");
			System.out.println("=============프로그램 종료=============");
		}
			
		
	}

}
