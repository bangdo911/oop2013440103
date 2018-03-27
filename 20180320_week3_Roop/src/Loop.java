
public class Loop {

	public static void main(String[] args) {
		// 1 ~ 10 정수를 화면에 출력.
		int i; // i는 루프변수
		i = 1; // 1. 루프변수 초기화
		
		while(i <= 10) // 2. 루프 조건식
		{
			System.out.println("정수 : " + i); // 3. 루프문
			i++; // 4. 루프변수 변화
		}
		
		int sum = 0;
		
		i = 1;
		while(i <= 10) {
			sum = sum + i;
			i++;
		}
		System.out.println("1부터 10까지의 합(while문) : " + sum);
		
		sum = 0;
		for(i = 1; i <= 10; i++) {
			sum = sum + i;
			//if(i == 5) break;
		}
		System.out.println("1부터 10까지의 합(for문) : " + sum);
		
		// do-while 따로 강의 안함.
		
		// continue문 예제
		String s = "n1n2n3n4n5n6n7n8n9n0";
		int n = 0;
		
		for(i = 0; i < s.length(); i++)
		{
			// n이 나오는 횟수를 센다.
			if(s.charAt(i) != 'n') // s에 들어있는 i번째 문자가 'n'이 아니면
				continue;		   // 반복을 다시 시작한다.
			// n의 갯수를 1 증가시킨다.
			n++;
		}
		System.out.println("문장에서 발견된 n의 개수 : " + n);
		
		
		System.out.println("=============프로그램 종료=============");
	}
}



	// 숙제 1 : C 프로그래밍 예제 : 조건문 6개 반복문 25개
	// 다음주 수업까지 반복문 25개 draw.io에 있는 플로우차트 OR 손으로 그려서 사진 올리기


