package ch06.sec11.exam01;

public class KoreanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		객체 생성 시 주민등록번호와 이름 전달
		Korean k1 = new Korean("123456-1234567", "김자바");
		
//		필드값 찾기
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		k1.name = "감자바";
	}

}
