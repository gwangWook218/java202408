package my.pkg.abstraction;

public abstract class Pet {
//	필드 선언
	public String name;
	public String kind;
	public String color;
	
	public Pet(String name, String kind, String color) {
		this.name = name;
		this.kind = kind;
		this.color = color;
	}
	
	public abstract void sound();
}
