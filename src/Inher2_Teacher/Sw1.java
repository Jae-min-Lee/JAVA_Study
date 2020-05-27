package Inher2_Teacher;

public class Sw1 {
	String arr[][] = new String[3][4];
	String name;
	String dept;
	String salary;
	String allowance;
	
	Sw1() {
		//default constructor
	}
	
	public void table() {
		System.out.println("이름\t부서명\t연봉\t수당");
		System.out.println("-------------------------------------------------------");
		
		for(int i=0; i <arr.length; i++) {
			System.out.println(arr[i][0] + "\t" + arr[i][1] + "\t" +arr[i][2] + "\t" + arr[i][3]);
			
		}
	}	
}
