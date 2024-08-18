package my.pkg.inheritance;

public class Snake extends Pet {
	public String sound;
	
	public Snake(String name, String kind, String color) {
		super(name, kind, color);
		this.sound = "키야아악";
	}

	@Override
	public void sound() {
		System.out.println("키야아악");
	}
}
