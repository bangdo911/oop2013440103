import java.util.Scanner;

public class HW02_13 {

	public static void main(String[] args) {
		// 13. month�� day�� �Է� �޾�, 1�� 1�Ϻ����� �� day���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
		// (switch�� ���) 
		//1�� 20���� 20�� ���, 2�� 5���� 36�� ���. �� 2���� 28�Ϸ� ���.
		System.out.println("13�� ����");
		
		int day;
		int month;
		int numberOfDays;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Month : ");
		month = input.nextInt(); 
		System.out.print("Day : ");
		day = input.nextInt();
		
		switch(month) {
		case 1 : 
			numberOfDays = 0;
			break;
		case 2 : 
			numberOfDays = 31;
			break;
		case 3 : 
			numberOfDays = 31+28;
			break;
		case 4 : 
			numberOfDays = 31+28+31;
			break;
		case 5 : 
			numberOfDays = 31+28+31+30;
			break;
		case 6 : 
			numberOfDays = 31+28+31+30+31;
			break;
		case 7 : 
			numberOfDays = 31+28+31+30+31+30;
			break;	
		case 8 : 
			numberOfDays = 31+28+31+30+31+30+31;			
			break;
		case 9 : 
			numberOfDays = 31+28+31+30+31+30+31+31;			
			break;
		case 10 : 
			numberOfDays = 31+28+31+30+31+30+31+31+30;			
			break;
		case 11 : 
			numberOfDays = 31+28+31+30+31+30+31+31+30+31;			
			break;
		case 12 : 
			numberOfDays = 31+28+31+30+31+30+31+31+30+31+30;			
			break;
		default :
			numberOfDays = 366;
			System.out.println("��¥�� �߸� �Է��ϼ̽��ϴ�.");
			break;
		}
		
		if(numberOfDays <= 365) {
			System.out.println("�� day�� : " + (numberOfDays+day));
		}
		System.out.println("=============���α׷� ����=============");
	}

}