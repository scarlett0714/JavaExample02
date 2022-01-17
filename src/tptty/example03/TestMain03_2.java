//비트연산자를 이용하여 두 변수의 값 swap
package tptty.example03;

public class TestMain03_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = -8;
		
		String temp = "00000000000000000000000000000000";
		String aStr = temp + Integer.toBinaryString(a); 
		String aBiStr = aStr.substring(aStr.length()-32);
		System.out.println("a: "+aBiStr);
		System.out.println("b: "+Integer.toBinaryString(b));
		System.out.println("===================================");
		
		a = a^b; //a와 b의 비트가 다른위치를 a에 저장한다 (^연산: a와 b의 비트가 같으면 0, 다르면 1)
		b = a^b; //b에 원래 a의 정보가 들어감 (원래 b의 정보를 다른 위치에서 빼면 a)
		a = a^b; //a에 원래 b의 정보가 들어감 (원래 a의 정보를 다른 위치에서 빼면 b)
		
		aStr = temp + Integer.toBinaryString(b);
		aBiStr = aStr.substring(aStr.length()-32);
		System.out.println("a: "+Integer.toBinaryString(a));
		System.out.println("b: "+aBiStr);
		
		
	}

}
