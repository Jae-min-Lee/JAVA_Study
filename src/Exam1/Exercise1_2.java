package Exam1;

public class Exercise1_2 {
	//field area : class variable(클래스 변수), class method(클래스 메소드), constructor

	public  int sum(int n, int m) {//클래스 메소드
		return n + m;
	}

	public static void main(String[] args) {
		           //new : 메모리 할당 키워드
		Exercise1_2 ec = new Exercise1_2(); //ec = pointer = object, 참조변수, 객체의 instance
		
		int i = 20;
		int s;
		char a;
		s = ec.sum(i, 10);// sum 메소드 호출 / 객체명.메소드명();
		
		a = '?';
		System.out.println(a); //?
		System.out.println("Hello "); //Hello
		System.out.println(s); //30
	}
}
		