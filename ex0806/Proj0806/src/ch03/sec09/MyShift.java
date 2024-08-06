package ch03.sec09;

public class MyShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		String num2 = Integer.toBinaryString(num);
		String num8 = Integer.toOctalString(num);
		String num16 = Integer.toHexString(num);
		System.out.println(num2);
		System.out.println(num8);
		System.out.println(num16);
	}

}
