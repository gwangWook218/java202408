package my.pkg.inner1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass myOuter = new OuterClass();
		OuterClass.InnerClass myInner = myOuter.new InnerClass();
		System.out.println(myInner.y + myOuter.x);
	}

}
