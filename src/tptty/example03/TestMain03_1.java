//시프트 연산자
package tptty.example03;

public class TestMain03_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = -8;
		
		String temp = "00000000000000000000000000000000";
		String aStr = temp + Integer.toBinaryString(a>>2); //1010 -> 0010
		String aBiStr = aStr.substring(aStr.length()-32);
		
		String aStr1 = temp + Integer.toBinaryString(a<<2); //001010 -> 101000
		String aBiStr1 = aStr1.substring(aStr1.length()-32);
		
		String bStr = temp + Integer.toBinaryString(b>>>2); //뒤에 00이 빠지고 앞쪽을 00으로 채움 (산술연산x, 논리연산o)
		String bBiStr = bStr.substring(bStr.length()-32);
		
		
		System.out.println("a: "+aBiStr);
		System.out.println("a: "+aBiStr1);
		System.out.println("b: "+bBiStr);
	}

}
