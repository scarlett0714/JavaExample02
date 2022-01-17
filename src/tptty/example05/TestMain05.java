//글자 수 출력하기
package tptty.example05;

import java.util.Scanner;

public class TestMain05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("한 줄의 문장을 입력하세요:");
		String input = scan.nextLine();
		
		int count = 0;
		for(int i=0;i<input.length();i++) {
			char ch = input.charAt(i);
			
			//글자인 경우를 조건문에 작성할 것인가, 글자가 아닌 경우를 조건문에 작성할 것인가
			if((ch!=' ') && (ch!='\t'))
				count++;
		}
		System.out.print("글자들의 수 = "+count);
		scan.close();
	}

}
