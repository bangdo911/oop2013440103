
public class HW02_23 {

	public static void main(String[] args) {
		System.out.println("23�� ����");
		int first = 5;
		int second = 1;
		int i = 1;
		int k = 1;
		
		while(k <= 3)
		{
			i = 1;
			while(first >= i) {
				System.out.print("*");
				i = i + 1;
			}
			System.out.print(" ");
			
			i = 1;
			while(second >= i) {
				System.out.print("*");
				i = i + 1;
			}
			System.out.println(" ");
			
			first = first - 2;
			second = second + 2;
			k++;
		}
		
	}

}
