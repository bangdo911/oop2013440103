import java.util.Scanner;

public class HW02_21 {

	public static void main(String[] args) {
		// 21. ����ڷκ��� �� ���ڸ� �Է¹޾�, �Է¹��� ���� ������ �Ҽ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		System.out.println("21�� ����");
				
			int number;
			int i = 1;
			int j;
			int count = 0;
			int sum = 0;
			
			Scanner input = new Scanner(System.in);
			System.out.print("������ �Է��Ͻÿ� : ");
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
			System.out.println("�Ҽ��� �� : " + sum);
			System.out.println("=============���α׷� ����=============");
	}

}
