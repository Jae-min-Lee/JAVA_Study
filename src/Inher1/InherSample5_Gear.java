package Inher1;


public class InherSample5_Gear extends GrandFather implements Me{
	
	@Override
	public void me() {
		String msg3 = "자동기어";
		String msg4 = "수동기어";
		System.out.println("나는 " + msg3 + "와 " + msg4 + " 모두 사용합니다.");
		
	}
	
	public static void main(String[] args) {
		
		auto();
		gear();
		InherSample5_Gear is5 = new InherSample5_Gear();
		is5.me();
	}
}