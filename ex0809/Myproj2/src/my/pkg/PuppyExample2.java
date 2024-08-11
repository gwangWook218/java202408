package my.pkg;

public class PuppyExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puppy2 myPuppy = new Puppy2();
		
		myPuppy.setName("똘이");
		System.out.println("강아지 확인: " + myPuppy.getName());
		myPuppy.setMine(myPuppy.isMine());
	}

}
