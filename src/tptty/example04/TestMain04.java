package tptty.example04;

import java.util.Scanner;

public class TestMain04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("알파벳 대소문자 또는 숫자만 입력해 주세요: ");
		String str = scanner.next(); //scanner.next()는 '문자'가 아닌 "문자열"을 입력받음
		//charAt(index)함수: 문자열의 해당 index의 문자를 반환
		char a = str.charAt(0); //대소문자 구분을 위해선 '문자'를 입력받아야함
		
		if((a>='a')&&(a<='z')) 
			System.out.println("문자 "+a+"는 소문자입니다.");
		
		else if((a>='A')&&(a<='Z')) 
			System.out.println("문자 "+a+"는 대문자입니다.");
		
		else if((a>='0')&&(a<='9')) 
			System.out.println("문자 "+a+"는 숫자입니다.");
		
		else 
			System.out.println("알파벳 또는 숫자가 아닙니다.");
		
		
		scanner.close();
	}

}
