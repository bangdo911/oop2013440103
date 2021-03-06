import java.util.Scanner;

public class HW02_13 {

	public static void main(String[] args) {
		// 13. month와 day를 입력 받아, 1월 1일부터의 총 day수를 출력하는 프로그램을 작성하시오. 
		// (switch문 사용) 
		//1월 20일은 20일 출력, 2월 5일은 36일 출력. 단 2월은 28일로 계산.
		System.out.println("13번 문제");
		
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
			System.out.println("날짜를 잘못 입력하셨습니다.");
			break;
		}
		
		if(numberOfDays <= 365) {
			System.out.println("총 day수 : " + (numberOfDays+day));
		}
		System.out.println("=============프로그램 종료=============");
	}

}
