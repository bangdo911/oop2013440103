import java.util.Scanner;

public class HW02_09 {

	public static void main(String[] args) {
		// 9. 위의 문제에서 1부터 9사이 이외의 숫자를 사용자가 잘못 입력할 수도 있으니, 
		// 이 경우에 잘못된 숫자라는 것을 알려주는 에러 메시지를 출력하고 다시 숫자를 입력 받도록 처리하시오.(입력의 유효성 검사)

		int i;
		int j = 1;
		
		Scanner input = new Scanner(System.in);
		System.out.print("1부터 9 사이의 정수를 입력하시오 : ");
		i = input.nextInt(); // 키보드에서 숫자 입력
		
		while(true)
		{
			if(i > 0 && i <= 9)
				break;
			else
				System.out.print("1부터 9 사이의 정수를 다시11 입력하시오 : ");
				i = input.nextInt(); // 키보드에서 숫자 입력
		}
		
		while(j <= 9)
		{
			System.out.println(i + " * " + j + " = " + i*j);
			j++;
		}

	}

}
