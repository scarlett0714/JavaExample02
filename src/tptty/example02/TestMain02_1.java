package tptty.example02;

import java.util.Scanner; 

public class TestMain02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("주소를 입력하세요");
		
		Scanner scanner = new Scanner(System.in);
		String addr = scanner.nextLine(); //nextLine: 공백을 포함한 문자열을 입력받고 싶은 경우
		System.out.println("당신의 주소는 "+addr+"입니다.");
		//nextLine은 _____서울특별시 -> 출력: _____서울특별시 (앞공백도 출력)
		//next는 ______황윤선 -> 출력: 황윤선 (앞공백은 무시) ** _는 공백을 표현
		
		//next만 작성되어있는 경우, 스페이스로 구분하는게 아니라 enter를 쳐도 정상적으로 작동되는 이유
		// 1. 이름을 입력+enter==이름\r\n -> 입력버퍼에서 \r까지 읽어내고 다음문장으로 넘어감
		// 2. \n을 next는 공백문자로 받아들이기 때문에 _서울로 입력한것으로 판단
		// 3. nextLine과 다르게 next는 서울앞의 공백을 무시 -> 정상적으로 출력		
		
		
		
		//nextLine이 next사이에 있거나 맨 마지막에 위치할 경우, 오류발생 (맨 앞에 위치할 경우는 정상작동)
//		String name = scanner.next();
//		System.out.println("당신의 이름은 "+name+"입니다.");
//		String addr = scanner.nextLine();
//		System.out.println("당신의 주소는 "+addr+"입니다.");
//		String city = scanner.next();
//		System.out.println("당신이 사는 도시는 "+city+"입니다.");
		//오류사항: 이름 입력 후, enter를 누르면 주소를 입력하는 창이 뜨지 않고 당신의 주소는 입니다.라고 출력해버림 (nextLine이 맨 처음오는 경우엔 문제x)
		//오류원인: enter은 \r\n으로 이루어짐. 
		// 1. 이름을 입력한 후 \r을 입력버퍼에서 읽어내서 다음 문장으로 넘어감
		// 2. 입력버퍼에 남아있던 \n때문에 nextLine은 enter키를 끝으로 문장입력이 끝났다고 파악
		// 3. 주소를 입력받지 않고 출력한 후, 도시입력으로 넘어감
		//해결방법: next에서 nextLine으로 넘어갈 때 scanner.nextLine();으로 입력버퍼에 남은 \n을 읽어주기
		
		String name = scanner.next();
		System.out.println("당신의 이름은 "+name+"입니다.");
		scanner.nextLine();
		addr = scanner.nextLine();
		System.out.println("당신의 주소는 "+addr+"입니다.");
		String city = scanner.next();
		System.out.println("당신이 사는 도시는 "+city+"입니다.");
		
		
//		String name = scanner.next();
//		System.out.println("당신의 이름은 "+name+"입니다.");
//		String city = scanner.next();
//		System.out.println("당신이 사는 도시는 "+city+"입니다.");
//		scanner.nextLine();
//		addr = scanner.nextLine();
//		System.out.println("당신의 주소는 "+addr+"입니다.");
		//오류사항: 입력 시, 황윤선 서울 서울특별시 송파구 enter를 입력한다면 서울특별시 송파구는 출력되지 않음
		//오류원인: 입력방법
		// 1. scanner.nextLine();까지 실행되어 황윤선 ~ 송파구까지 모두 입력버퍼에 존재
		// 2. next로 한 토큰씩 읽어 황윤선 서울까지만 읽어냄
		// 3. 입력버퍼에 있던 서울특별시 송파구는 버려지고 다시 새로 주소입력을 받음
		// 4. 한번 더 주소를 입력해야 정상작동
		
		
		scanner.close();
		
	}

}
