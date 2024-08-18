package my.pkg.inheritance;

public class Bird extends Pet {
	public String sound;
	
	public Bird(String name, String kind, String color) {
		super(name, kind, color);
		this.sound = "짹짹";
	}

	@Override
	public void sound() {
		System.out.println("짹짹");
	}
}
