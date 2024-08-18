package my.pkg.inheritance;

public class PetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet pet = new Dog("초코", "개", "노랑");
		pet.sound();
		
		if(pet.name=="초코" && pet.kind=="개") {
			System.out.println("예쁘게 키워주세요.");
		} else {
			System.out.println("다시 찾아볼까요?");
		}
		
		Pet pet1 = new Cat("초코", "고양이", "노랑");
		pet1.sound();
		
		if(pet1.name=="초코" && pet1.kind=="개") {
			System.out.println("예쁘게 키워주세요.");
		} else {
			System.out.println("다시 찾아볼까요?");
		}
	}

}
