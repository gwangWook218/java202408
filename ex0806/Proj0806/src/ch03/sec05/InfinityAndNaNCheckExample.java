package ch03.sec05;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		double y = 0.0;
		double z1 = x / y;
		double z2 = x % y;
		
//		잘못된 코드
		System.out.println(z1 + " 또는 " + z2);
		
//		알맞은 코드
		double z = x / y;
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		} else {
			System.out.println(z + 2);
		}
	}
}
