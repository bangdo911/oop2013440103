
public class HW02_25 {

	public static void main(String[] args) {
		System.out.println("25번 문제");
		/*
		  25.다음과 같은 출력이 나오도록 프로그램을 작성하시오.
		    *********** 54321012345
			********* 432101234
			******* 3210123
			***** 21012
			*** 101
			* 0
			*** 101 
			***** 21012 
			******* 3210123 
			********* 432101234 
			*********** 54321012345
		*/
		
		int first = 11;
		int second = 5;
		int i = 1;
		int k = 1;
		
		while(k <= 6)
		{
			i = 1;
			while(first >= i) {
				System.out.print("*");
				i = i + 1;
			}
			System.out.print(" ");
			
			i = 0;
			while(second >= i) {
				System.out.print((second-i));
				i = i + 1;
			}
			i = 1;
			while(second >= i) {
				System.out.print(i);
				i = i + 1;
			}
			System.out.println(" ");
			
			first = first - 2;
			second = second - 1;
			
			k++;
		}
		
		first = 3;
		second = 2;
		k = 1;
		while(k <= 5) {
			i = 1;
			while(first >= i) {
				System.out.print("*");
				i = i + 1;
			}
			System.out.print(" ");
			//
			i = 1;
			while(second >= i) {
				System.out.print((second-i));
				i = i + 1;
			}
			i = 1;
			while(second > i) {
				System.out.print(i);
				i = i + 1;
			}	
			//
			System.out.println(" ");
			first = first + 2;
			second = second + 1;
			k++;
		}
		
	}

}
