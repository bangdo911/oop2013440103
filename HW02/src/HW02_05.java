
public class HW02_05 {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		
		while(i <= 100)
		{
			if(i % 3 == 0)
				sum = sum + i;
			i++;
		}
		System.out.println("1부터 100까지의 3의 공배수의 총합 : " + sum);
	}

}
