//예제. Scanner를 이용한 키 입력 연습
package tptty.example02;

import java.util.Scanner; 
//Scanner를 사용하기 위해서는 패키지를 import 시켜주기 (java.lang에 있는 것만 제외)
//C언어에서 #include에서 헤더파일 불러오는 것과 같은 기능

public class TestMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
		
		Scanner scanner = new Scanner(System.in);
		//Scanner에 마우스 대고 ctrl+shift+O키 -> Scanner가 정의되어 있는 장소가 뜸
		String name = scanner.next();
		System.out.println("당신의 이름은 "+name+"입니다.");
		String city = scanner.next();
		System.out.println("당신이 사는 도시는 "+city+"입니다.");
		int age = scanner.nextInt();
		System.out.println("당신의 나이는 "+age+"입니다.");
		double weight = scanner.nextDouble();
		System.out.println("당신의 체중은 "+weight+"kg입니다.");
		boolean single = scanner.nextBoolean();
		System.out.println("당신의 독신 여부는 "+single+"입니다.");
		
		scanner.close();
		//Scanner를 사용했을 경우, 반드시 마지막엔 close로 입력을 멈춰야함
		//close사용 시, 정말 입력이 모두 끝났는지 확인하고 사용
		
		
	}

}
