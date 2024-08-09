package ch06.sec13.exam02.package2;

import ch06.sec13.exam02.package1.*;

public class C {
//	필드 선언
	A a1 = new A(true);
	A a2 = new A(1);	//default 생성자 접근 불가(같은 패키지 내에서만)
	A a3 = new A("문자열");	//private 생성자 접근 불가(같은 클래스 내에서만)
}
