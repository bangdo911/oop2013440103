import java.util.Scanner;

public class HW02_19 {

	public static void main(String[] args) {
		// 19. ����ڷκ��� �� ���ڸ� �Է¹޾�, �Է¹��� ���ڰ� �Ҽ����� �ƴ����� �˻��ϴ� ���α׷��� �ۼ��Ͻÿ�.
		System.out.println("19�� ����");
		
		int number;
		int i = 1;
		int count = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� : ");
		number = input.nextInt(); 
		
		while(number >= i && count <= 2)
		{
			if(number % i == 0)
				count ++;
			
			i++;
		}
		
		if(count == 2)
			System.out.print("�Ҽ��Դϴ�.");
		else
			System.out.print("�Ҽ��� �ƴմϴ�.");

	}

}