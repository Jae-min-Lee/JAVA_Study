package Inher2_Teacher;

import java.util.Scanner;

public class Information extends  Personal {
	protected final static int OFFICER_COUNT  = 3;
	protected static int sum[] = new int[3];
	protected static Information info[] = new Information[OFFICER_COUNT];
	
	public void inputInformation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해주세요.");
		setName(sc.next());			
		System.out.println("부서를 입력해주세요.");
		setDept(sc.next());		
		System.out.println("연봉을 입력해주세요.");
		setSalary(sc.nextInt());		
		System.out.println("수당을 입력해주세요.");
		setAllowance(sc.nextInt());		
		}
	
	public void printInformation() {

			int sum = Personal.getSalary() + Personal.getAllowance();
			
			System.out.println("------" + Personal.name + "---------");
			System.out.println("이름: " + Personal.getName());
			System.out.println("부서: " + Personal.getDept());
			System.out.println("연봉: " + Personal.getSalary());
			System.out.println("수당: " + Personal.getAllowance());
			System.out.println("합계: " + sum);
			System.out.println("------------------------------------");				
	}
}
