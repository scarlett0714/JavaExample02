//커피 주문하기
package tptty.example05;

import java.util.Scanner;

public class TestMain05_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int count_a=0, count_c=0;
		final int AMERICANO = 100; //상수설정 (c언어에서의 기호상수 기능)
		final int CAFFELATTE = 200;
		do {
			System.out.println("1)아메리카노(100원) 2)카페라떼(200원) 3)결제 4)종료");
			System.out.print("선택하세요:");
			int order = scan.nextInt();
			
			switch (order) {
			case 1:
				System.out.println("아메리카노를 주문하셨습니다.\n");
				count_a++;
				break;
			case 2:
				System.out.println("카페라떼를 주문하셨습니다.\n");
				count_c++;
				break;
			case 3:
				System.out.println("==================");
				System.out.println("     결제 금액");
				System.out.println("==================");
				System.out.println("아메리카노 "+count_a+"잔 "+(count_a*AMERICANO)+"원");
				System.out.println("카페라떼 "+count_c+"잔 "+(count_c*CAFFELATTE)+"원");
				System.out.println("==================");
				System.out.println("총 "+(count_a*AMERICANO+count_c*CAFFELATTE)+"원");
				//System.out.println("총 "+count_a*AMERICANO+count_c*CAFFELATTE+"원");
				//금액 계산 앞 뒤에 괄호를 치지 않으면, 문자열+문자열로 받아들여 정확한 계산 불가
				System.out.println("==================");
				System.out.println("\n결제가 완료 되었습니다.\n");
				count_a = 0;
				count_c = 0;
				break;
			case 4:
				System.out.println("시스템을 종료합니다.");
				scan.close(); //더 이상의 입력을 받지 않음
				System.exit(0); //System.exit()함수는 시스템 종료를 의미: ()안에는 정수값 0을 넣을 것
				break;
			default:
				System.out.println("메뉴를 다시 확인해 주세요.\n");
				break;
					
			}
		}while(true); //do while문 말고 while(true)도 가능
		
	}

}
