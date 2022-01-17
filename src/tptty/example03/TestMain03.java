//비트 연산자
package tptty.example03;

public class TestMain03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = -8;
		int c = a & b;
		int d = a | b;
		
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("c: "+c);
		System.out.println("d: "+d+"\n");
		
		//Integer.toBinaryString()함수: Integer를 BinaryString으로 변환
		System.out.println("a: "+Integer.toBinaryString(a)); //int형 32비트, +는 이진수에서 앞부분이 모두 0로 채워짐(0은 출력x)
		System.out.println("b: "+Integer.toBinaryString(b)); //int형 32비트, -는 이진수에서 앞부분이 모두 1로 채워짐
		System.out.println("c: "+Integer.toBinaryString(c));
		System.out.println("d: "+Integer.toBinaryString(d)+"\n");
		
		//a와 c값도 32비트로 출력하기
		String temp = "00000000000000000000000000000000";
		String aStr = temp + Integer.toBinaryString(a); //이진수 연산x: 문자열+문자열=000000000000000000000000000000001010 (36자리)
		String cStr = temp + Integer.toBinaryString(c); //이진수 연산x: 문자열+문자열=000000000000000000000000000000001000 (36자리)
		
		//36자리 문자열에서 32자리만 가져오기
		String aBiStr = aStr.substring(aStr.length()-32); //36자리 문자열에서 32자리를 뺀 앞에서 5번째 0부터 문자열 끝까지 출력
		String cBiStr = cStr.substring(cStr.length()-32); //36자리 문자열에서 32자리를 뺀 앞에서 5번째 0부터 문자열 끝까지 출력
		//substring()함수: 문자열 중 일부만 가져오기, 괄호안에는 문자열을 가져올 시작점(=커서의 위치)을 넣기
		//length()함수: 문자열의 길이 측정
		
		System.out.println("a: "+aBiStr);
		System.out.println("c: "+cBiStr+"\n");

	}

}
