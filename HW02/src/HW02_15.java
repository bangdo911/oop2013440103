import java.util.Scanner;

public class HW02_15 {

	public static void main(String[] args) {
		// 15. 1~100 ������ ���� �ϳ��� ���� ��(�������� �����ص� ��), 
		// 10�� �̳��� �� ���ڸ� ���ߴ� ������ �ۼ��Ͻÿ�.(10�� �̳��� �� ���߾��� ���� 
		// �ణ �Ӹ��� ������ ����̹Ƿ�  Game Over ó���� �Ŷ��ϰ� �� �ֱ� �ٶ�)
		System.out.println("15�� ����");
		
		int i = 49;
		int j = 1;
		int k;
		
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� : ");
		k = input.nextInt(); 
		
		while(j <= 10)
		{
			
			if(k == i) {
				System.out.println("�����Դϴ�!");
				System.out.println("=============���α׷� ����=============");
				break;
			}
			else {
				if(k > i)
					System.out.println("�Է��Ͻ� ���ں��� �۽��ϴ�.");
				else
					System.out.println("�Է��Ͻ� ���ں��� Ů�ϴ�.");
			}
			
			System.out.print("������ �Է��Ͻÿ� : ");
			k = input.nextInt(); 
			
			j++;
		}
		
		if(j > 10) {
			System.out.println("Game Over!! �Ӹ��� �����ô±���");
			System.out.println("=============���α׷� ����=============");
		}
			
		
	}

}