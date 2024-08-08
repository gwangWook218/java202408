package my.pkg;

public class PuppyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puppy myPuppy1 = new Puppy("초코", "포메라니안", "흰색");
		if(myPuppy1.name == "초코" || myPuppy1.name == "똘이") {
			System.out.println("예쁘게 키워주세요.");
		} else {
			System.out.println("다시 찾아볼까요?");
		}
		
		Puppy myPuppy2 = new Puppy("두부", "골든 리트리버", "노랑");
		if(myPuppy2.name == "초코" || myPuppy2.name == "똘이") {
			System.out.println("예쁘게 키워주세요.");
		} else {
			System.out.println("다시 찾아볼까요?");
		}
		
		Puppy myPuppy3 = new Puppy("똘이", "말티즈", "흰색");
		if(myPuppy3.name == "초코" || myPuppy3.name == "똘이") {
			System.out.println("예쁘게 키워주세요.");
		} else {
			System.out.println("다시 찾아볼까요?");
		}
		
		Puppy myPuppy4 = new Puppy("체리", "비숑", "흰색");
		if(myPuppy4.name == "초코" || myPuppy4.name == "똘이") {
			System.out.println("예쁘게 키워주세요.");
		} else {
			System.out.println("다시 찾아볼까요?");
		}
		
		Puppy myPuppy5 = new Puppy("심바", "요크셔테리어", "검정");
		if(myPuppy5.name == "초코" || myPuppy5.name == "똘이") {
			System.out.println("예쁘게 키워주세요.");
		} else {
			System.out.println("다시 찾아볼까요?");
		}
	}

}
