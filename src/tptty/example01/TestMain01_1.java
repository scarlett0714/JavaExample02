package tptty.example01;

import java.io.IOException;

public class TestMain01_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int code;
		//System.in.read()함수는 -1의 값을 만나면 입력스트림으로부터 더 이상 읽기작업을 실행하지 않음
		while((code = System.in.read())!=-1) {
			//System.out.println작성하는 방법
			//1. 직접입력
			//2. sysout -> ctrl+space키
			System.out.println("code = "+code);
		}
		//반복출력 시, 커서가 제자리에 위치하지 않을 경우: ctrl+end키
		//프로그램이 계속 진행중인 경우: Console창에 빨간색 정지버튼
		//더 이상 입력을 받고싶지 않은 경우: ctrl+Z키 -> Console창에 회색 정지버튼
		
		code = System.in.read();
		System.out.println("code = "+code);
		code = System.in.read();
		System.out.println("code = "+code);
		code = System.in.read();
		System.out.println("code = "+code);
		//ctrl+Z로 입력받는 것을 그만뒀는데 계속 입력받는 명령이 남아있다면, 자동으로 -1출력(입력되지x)
	}

}
