import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		//2. �ϳ��� ������ �Է� �޾� �� ���� ¦��(even number)���� Ȧ��(odd number)������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		System.out.print("2�� ����");		
		
		int one;
		
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� : ");
		one = input.nextInt(); // Ű���忡�� ���� �Է�
		
		if(one % 2 == 1)	{
			System.out.print("Ȧ���Դϴ�. ");
		}
		else {
			System.out.print("¦���Դϴ�. ");
		}
	}

}
