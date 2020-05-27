package Inher2_Teacher;

public class Sales {
	//데이터 저장(DTO = VO)
	protected static String name;//class 변수 , 자동초기화, 초기화 값을 따로 줘버리면 (초기값) 저장할때 초기값으로 저장됨.
	protected static String dept;//class 변수, 자동초기화
	protected static int salary;//class 변수, 자동초기화
	protected static int commition;//class 변수, 자동초기화

	//매개변수형태로 데이터가 전달되어 들어옵니다.
	public Sales(String name, String dept, int salary, int commition){
		
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.commition = commition;
		
	}

}
