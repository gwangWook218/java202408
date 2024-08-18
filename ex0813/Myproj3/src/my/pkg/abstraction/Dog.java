package my.pkg.abstraction;

public class Dog extends Pet {
	public String sound;
	
	public Dog(String name, String kind, String color) {
		super(name, kind, color);
		this.sound = "멍멍";
	}

	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
