package ch09.sec07.exam03;

public class ButtonExample {

	public static void main(String[] args) {
		// Ok 버튼 객체 생성
		Button btnOk = new Button();
				
//		Ok 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스(로컬 클래스)
		btnOk.setClickListener(new Button.ClickListener() {
			@Override
			public void onClick() {
				System.out.println("Ok 버튼을 클릭했습니다.");
			}
		});
				
//		Ok 버튼 클릭하기
		btnOk.click();
				
//		--------------------------------------------------------------
				
//		Cancel 버튼 객체 생성
		Button btnCancel = new Button();
				
//		Cancel 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스(로컬 클래스)
		btnCancel.setClickListener(new Button.ClickListener() {
			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭했습니다.");
			}
		});
				
//		Cancel 버튼 클릭하기
		btnCancel.click();
	}

}
