package my.pkg.inheritance;

public class Cat extends Pet {
	public String sound;
	
	public Cat(String name, String kind, String color) {
		super(name, kind, color);
		this.sound = "야옹";
	}

	@Override
	public void sound() {
		System.out.println("야옹");
	}
}
