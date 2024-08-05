package ch02.sec05;

public class Boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		boolean result = (x == 20);
		boolean result1 = (x != 20);
		boolean result2 = (x > 20);
		boolean result3 = (0 < x && x < 20);
		boolean result4 = (x < 0 || x > 200);
		
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}

}
