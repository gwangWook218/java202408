package my.pkg.abstraction;

public class PetExample {
	public static void main(String[] args) {
		Dog dog = new Dog("초코", "개", "노랑");
		dog.sound();
		
		if(dog.name=="초코" && dog.sound=="멍멍") {
			System.out.println("예쁘게 키워주세요.");
		} else {
			System.out.println("다시 찾아볼까요?");
		}
		
		Bird bird = new Bird("초코", "새", "노랑");
		bird.sound();
		
		if(bird.name=="초코" && bird.sound=="멍멍") {
			System.out.println("예쁘게 키워주세요.");
		} else {
			System.out.println("다시 찾아볼까요?");
		}
	}
}
