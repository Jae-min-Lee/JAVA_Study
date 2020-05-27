package Inher2_Teacher;

import java.util.Scanner;

public class Sw2 extends Sw1 {

	static Scanner sc = new Scanner(System.in);
	
	public Sw2() {
		//default constructor
	}
	
//	public void wannted() {	
//		
//		System.out.println("확인할 사람의 이름을 입력해 주세요.");
//		 name = sc.next();
				
//		for(int i=0; i <arr.length; i++) {
			
//			if(arr[i].equals(name)) {
//				System.out.println("이름" + arr[i][0] + "\t" + "부서명" 
//			+ arr[i][1] + "\t" + "연봉" + arr[i][2] + "\t" + "수당" + arr[i][3] + "\t");
//				
//			}
//		}
//	}
	
		public void DataSet() {
			
			for(int i=0; i < arr.length; i++) {
				arr[i][0] = "no";			
			
			for(int j=0; j < arr.length; j++) {
				if(arr[i][0].equals("no")) {
					System.out.println((i+1) + "번째 직원의 정보를 입력합니다.");
					System.out.println("이름을 입력 하세요.");
						String name = sc.next();
						arr[i][0] = name;
					System.out.println("부서이름을 입력해주세요.");
						String dept = sc.next();
						arr[i][1] = dept;
					System.out.println("연봉을 입력해주세요.");
						String  salary = sc.next();
						arr[i][2] = salary;
					System.out.println("수당을 입력해주세요.");
						String allowance = sc.next();
						arr[i][3] = allowance;						
			}			
		}				
	}
		}
		public void start() {
			do {
				System.out.println("알고 싶은 정보를 선택 하시오. ");
				System.out.println("1.전체정보  2: 인별 정보  3.종료");
				
				int input = sc.nextInt();
				
				switch(input) {
				case 1:
					table(); break;
				case 2:
					DataSet(); break;				
				case 3:
					System.out.println("프로그램을 종료합니다. 안녕히 계세요.");
					System.exit(0);				
				
				}
				
			}while(true);
			
		}
}