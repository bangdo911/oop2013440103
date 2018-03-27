
public class HW02_03 {

	public static void main(String[] args) {
		int i;
		int sum = 0;
		
		i = 1;
		while(i <= 10) {
			sum = sum + i;
			i++;
		}
		System.out.println("1부터 10까지의 합(while문) : " + sum);
	}

}
