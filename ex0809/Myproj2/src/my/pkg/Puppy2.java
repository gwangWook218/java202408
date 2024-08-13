package my.pkg;

public class Puppy2 {
//	필드 선언
	private String name;
	private boolean mine;
	
//	name 필드의 Getter/Setter 선언
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		if (name == "초코" || name == "똘이") {
			this.mine = true;
		} else {
			this.mine = false;
		}
	}
	
	public boolean isMine() {
		return mine;
	}
	public void setMine(boolean mine) {
		if(mine == true) {
			System.out.println("예쁘게 키워주세요.");
		} else {
			System.out.println("찾으시던 강아지가 아니군요.");
		}
	}
}
