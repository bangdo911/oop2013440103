import java.util.Scanner;

public class HW02_09 {

	public static void main(String[] args) {
		// 9. ���� �������� 1���� 9���� �̿��� ���ڸ� ����ڰ� �߸� �Է��� ���� ������, 
		// �� ��쿡 �߸��� ���ڶ�� ���� �˷��ִ� ���� �޽����� ����ϰ� �ٽ� ���ڸ� �Է� �޵��� ó���Ͻÿ�.(�Է��� ��ȿ�� �˻�)

		int i;
		int j = 1;
		
		Scanner input = new Scanner(System.in);
		System.out.print("1���� 9 ������ ������ �Է��Ͻÿ� : ");
		i = input.nextInt(); // Ű���忡�� ���� �Է�
		
		while(true)
		{
			if(i > 0 && i <= 9)
				break;
			else
				System.out.print("1���� 9 ������ ������ �ٽ�11 �Է��Ͻÿ� : ");
				i = input.nextInt(); // Ű���忡�� ���� �Է�
		}
		
		while(j <= 9)
		{
			System.out.println(i + " * " + j + " = " + i*j);
			j++;
		}

	}

}