package my.pkg.inner3;

public class MyClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass3 myOuter = new OuterClass3();
		OuterClass3.InnerClass3 myInner = myOuter.new InnerClass3();
		System.out.println(myInner.InnerMethod());
	}

}
