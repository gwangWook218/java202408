package ch03.sec07;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int charCode1 = 'A';
		int charCode2 = 'a';
		int charCode3 = '5';
		
		if((65 <= charCode1) & (charCode1 <= 90)) {
			System.out.println("대문자군요.");
		}
		
		if((97 <= charCode2) && (charCode2 <= 122)) {
			System.out.println("소문자군요.");
		}
		
		if((48 <= charCode3) && (charCode3 <= 57)) {
			System.out.println("0~9 숫자군요.");
		}
		
		System.out.println("------------------------");
		
		int value1 = 6;
		int value2 = 7;
		
		if((value1 % 2 == 0) | (value1 % 3 == 0)) {
			System.out.println("2 또는 3의 배수군요.");
		}
		
		boolean result = (value2 % 2 == 0) || (value2 % 3 == 0);
		if(!result) {
			System.out.println("2 또는 3의 배수가 아니군요.");
		}
	}

}
