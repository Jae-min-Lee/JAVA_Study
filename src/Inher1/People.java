package Inher1;

public class People {
//이름, 주민번호, 학번
	static String name;//클래스변수
	static String jumin;
	static String stdNo;
	//getter & setter
	
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		People.name = name;//클래스명.클래스변수명 = 매개변수명
	}
	public static String getJumin() {
		return jumin;
	}
	public static void setJumin(String jumin) {
		People.jumin = jumin;//클래스명.클래스변수명 = 매개변수명
	}
	public static String getStdNo() {
		return stdNo;
	}
	public static void setStdNo(String stdNo) {
		People.stdNo = stdNo;//클래스명.클래스변수명 = 매개변수명
	}

}
