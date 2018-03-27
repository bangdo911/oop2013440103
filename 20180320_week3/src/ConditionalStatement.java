import java.util.Scanner; // import는 C에서의 include와 비슷.

public class ConditionalStatement {

	public static void main(String[] args) {
		int score;
		int good = 0; int bad = 0;
		char grade;
		
		System.out.print("성적을 입력하세요 : ");
		Scanner input = new Scanner(System.in);
		score = input.nextInt(); // 키보드에서 숫자 입력
		
		System.out.println("성적은 " + score + "점입니다.");
		// 성적이 60점 이상이면 "합격입니다.", 60점 미만이면 "불합격입니다"를 출력
		// 비교 >= : 관계연산자
		// if(조건식) {참일 경우 수행} else {거짓일 경우 수행}
		
		if(score >= 60) {
			System.out.println("합격입니다.");
			good++;
		}
		
		else {
			System.out.println("불합격입니다.");
			bad++;
		}
		
		//성적이 80점 이상이면 A, 60점 이상이면 B, 60점 미만이면 F 출력
		
		if(score >= 80)
			grade = 'A';
		else if(score >= 60)
			grade = 'B';
		else
			grade = 'F';
		
		System.out.println("학점은 " + grade + "입니다.");
		
		// Switch문 꼭 break 사용하도록.
		// 0 = 없음, 1 = 하나, 2 = 둘, 3이상 = 많음 출력
		switch(score) {
		case 0 :
			System.out.println("없음");
			break;
		case 1 :
			System.out.println("하나");
			break;
		case 2 :
			System.out.println("둘");
			break;
		default : 
			System.out.println("많음");
			break;
		}
		
		
		
		System.out.println("=============프로그램 종료=============");
	}
}










