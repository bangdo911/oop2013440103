import java.util.Scanner;

public class HW02_11 {

	public static void main(String[] args) {
		// 10. �Ҽ�(prime-number) �˻�� �����ϰ� ����ڰ� �Է��� ���� �μ����� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// 8 => 2 4 
		// 12 => 2 3 4 6
		
		// 11. ���� ������ 0�� �Է��ϱ� �������� ��� ����(�μ� ���)�ϵ��� �����Ͻÿ�.
		
		int i;
		int j;
		
		Scanner input = new Scanner(System.in);
		System.out.print("2 �̻��� ������ �Է��Ͻÿ� : ");
		i = input.nextInt(); // Ű���忡�� ���� �Է�
		
		while(true)
		{
			if(i == 0) {
				System.out.println("=============���α׷� ����=============");
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
				System.out.print("2 �̻��� ������ �Է��Ͻÿ� : ");
				i = input.nextInt(); // Ű���忡�� ���� �Է�
			}
		}
		

	}

}