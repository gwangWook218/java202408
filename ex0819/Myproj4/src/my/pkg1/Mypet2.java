package my.pkg1;

import my.pkg.Override;
import my.pkg.String;

public class Mypet2 implements SecondInter {
//	필드 선언
	private String name;
	private String kind;
	private boolean mine;
	
//	메소드 오버라이딩
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void setName(String name, String kind) {
		this.name = name;
		this.kind = kind;
		
		if(name == "초코" && kind == "개") {
			this.mine = true;
		} else {
			this.mine = false;
		}
	}
	
	@Override
	public boolean isMine() {
		return mine;
	}
	
	@Override
	public void setMine(boolean mine) {
		if(mine == true) {
			System.out.println("예쁘게 키워주세요.");
		} else {
			System.out.println("찾으시던 강아지가 아니군요.");
		}
	}
}
