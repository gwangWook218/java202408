package my.pkg.interf_multi;

public class MultiClass implements FirstInterf, SecondInterf {
	@Override
	public void method1() {
		System.out.println("첫 번째 인터페이스");
	}
	
	@Override
	public void method2() {
		System.out.println("두 번째 인터페이스22");
	}
	
	@Override
	public void method_basic() {
		System.out.println("기본 인터페이스00");
	}
}
