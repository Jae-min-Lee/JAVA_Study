package Inher1;

public class People2 {
	
	private static String name;
	private static String jumin;
	private static String stdNo;
	//Constructor
	public People2(){
		//default 생성자 개념 : 아무 것도 없으니 동작하지 않습니다.
	}
	public People2(String name, String jumin, String stdNo){
		
		this.name = name;
		this.jumin = jumin;
		this.stdNo = stdNo;
	}
	public void DataList(){
		System.out.println(People2.name);//클래스명.클래스변수
		System.out.println(People2.jumin);//클래스명.클래스변수
		System.out.println(People2.stdNo);//클래스명.클래스변수
	}
}
