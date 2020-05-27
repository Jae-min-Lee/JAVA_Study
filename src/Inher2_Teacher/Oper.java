package Inher2_Teacher;

import java.text.DecimalFormat;

public class Oper extends Personal {

	public Oper() {
		super();// Sales에 있는 값들
	}

	
	public void Operation() {
		
		super.name = getName();
		super.dept = getDept();
		super.salary = getSalary();
		super.commition = getCommition();
		DecimalFormat formatter = new DecimalFormat("###,###");
		salary = salary + commition;
		System.out.println("연봉은  " + formatter.format(salary) + "원 입니다.");
		
	}


	private int getCommition() {
		// TODO Auto-generated method stub
		return 0;
	}

}
