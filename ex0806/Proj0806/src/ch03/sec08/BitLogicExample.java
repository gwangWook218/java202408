package ch03.sec08;

public class BitLogicExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		45 = 32     + 8 + 4 + 1 = 00101101
//		25 =     16 + 8     + 1 = 00011001
		
//		Bit AND Operator:         00001001
//		Bit OR Operator:          00111101
//		Bit XOR Operator:         00110100
//		Bit NOT Operator:         11010010
		
		System.out.println("45 & 25 = " + (45 & 25));
		System.out.println("45 | 25 = " + (45 | 25));
		System.out.println("45 ^ 25 = " + (45 ^ 25));
		System.out.println("~45 = " + (~45));
		System.out.println("-----------------------------");
		
		byte receiveData = -120;
		
		int unsignedInt1 = receiveData & 255;
		System.out.println(unsignedInt1);
		
		int unsignedInt2 = Byte.toUnsignedInt(receiveData);
		System.out.println(unsignedInt2);
		
		int test = 136;
		byte btest = (byte) test;
		System.out.println(btest);
	}

}
