import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		// 6. � �� �ڸ� ���� �ڸ����� ������ ���� �ٲٴ� ���α׷��� �ۼ��Ͻÿ�.
		// ����� �Է� : �� ���� �� �ڸ� ����
		// ��� : �ڸ����� ������ �ݴ�� �� ����
		System.out.println("5�� ����");
		
		int one;
		
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� : ");
		one = input.nextInt(); // Ű���忡�� ���� �Է�
		
		if(one >= 10 && one < 100)
		{
			one = (one % 10) * 10 + (one / 10);
			System.out.print(one);
		}
		else
			System.out.print("�� �ڸ����� ������ �Է��Ͻÿ�.");
	}

}
