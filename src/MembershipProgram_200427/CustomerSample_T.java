package MembershipProgram_200427;

import java.util.Scanner;

/* 회원관리 프로그램 작성
 * 1.회원가입: 이름, 나이, 이메일, 전화번호, 주소  *저장공간(인원)이 초과되었는지 체크.
 * 2.회원목록 보기: 등록이 안된 회원이면 볼수없음. 회원별 검색 가능 하도록.
 * 3.회원삭제: 삭제대상회원 이름
 * 4.회원정보 수정: 수정 할 나이, 이메일, 전화번호 등
 * 5.프로그램 종료: 계속할것인지 아닌지 체크.
 * 인터페이스 이용.
 */
interface Cus_Interface {
	int MaxPeople_Count = 20;
	public abstract void title();
	public abstract void Inwon();
	public abstract void join();
	public abstract void view();
	public abstract void update();
	public abstract void delete();
	public abstract void stop();
	void inwon();
	
}


class Customer implements Cus_Interface {
	int number = 0;//menu choose
	int People_Count;
	int cut = 0;
	
	Scanner sc = new Scanner(System.in);
	String Output[] = new String[] {"이름:", "나이:", "전자우편:", "전화번호:", "주소:"};
	String PeopleInfo[][] = new String[MaxPeople_Count][5];
	private int inwon = 0; 
		
	@Override
	public void title() {	//제목
		System.out.println("----- 다음 메뉴중 하나를 선택하시오. -----");
		System.out.println("1.회원가입");
		System.out.println("2.회원목록보기");
		System.out.println("3.회원정보수정");
		System.out.println("4.회원정보삭제");
		System.out.println("5.프로그램종료");
		System.out.println("----------------------------------");
		System.out.println("번호를 선택하세요.");
			number = sc.nextInt();
			
			Inwon();
	}

	@Override
	public void Inwon() {  //가입
		if(number == 1) {
			if(People_Count <= MaxPeople_Count) {
				join();
			}else {
				System.out.println("가입인원이 초과되었습니다.");
			}
		}else if(number == 2) {
			view();
		}else if(number == 3) {
			update();
		}else if(number == 4) {
			delete();
		}else {
			stop();
		}
		
	}

	@Override
	public void join() {
		System.out.println("이름:");
		String name = sc.next();
		System.out.println("나이:");
		String age = sc.next();
		System.out.println("전자우편:");
		String email = sc.next();
		System.out.println("전화번호:");
		String p_number = sc.next();
		System.out.println("주소:");
		String address = sc.next();
		
		PeopleInfo[People_Count][0] = name;
		PeopleInfo[People_Count][1] = age;		
		PeopleInfo[People_Count][2] = email;		
		PeopleInfo[People_Count][3] = p_number;
		PeopleInfo[People_Count][4] = address;
		
		People_Count++;
		
		title();
		
	}

	@Override
	public void view() { //목록보기
		if(People_Count == 0) {
			System.out.println("등록된 회원이 없습니다.");
		}else {
			System.out.println("검색하실 회원명을 입력해주세요.");
			String name = sc.next();
			
			
			
			for(int i=0; i <= People_Count - 1;i++) 
				if(PeopleInfo[i][0].equals(name)) {
					for(int j=0; j<5; j++) {
						System.out.println(Output[j] + PeopleInfo[i][j]); 
					}
						}else {
						System.out.println("해당 이름의 회원이 존재하지 않습니다.");
					}
				}
				title();	
	}

	@Override
	public void update() {
		if(People_Count == 0) {
			System.out.println("등록된 회원이 없습니다.");
		}else {
			System.out.println("수정하실 회원명을 입력해주세요.");
			String name = sc.next();
				
		for(int i=0; i<= People_Count - 1; i++)
			
			if(PeopleInfo[i][0].equals(name)) {
				System.out.println("나이:");
				String age = sc.next();
				System.out.println("전자우편:");
				String email = sc.next();
				System.out.println("전화번호:");
				String p_number = sc.next();
				System.out.println("주소:");
				String address = sc.next();
				
				PeopleInfo[i][1] = age;
				PeopleInfo[i][2] = email;
				PeopleInfo[i][3] = p_number;
				PeopleInfo[i][4] = address;				
			}else {
				System.out.println("입력하신 회원이 없습니다.");
			}
			System.out.println();
			title();		
		}
	}
	
	@Override
	public void delete() {
		if(People_Count == 0) {
			System.out.println("등록된 회원이 없습니다.");
		}else {
			System.out.println("삭제하실 회원명을 입력해주세요.");
			String name = sc.next();
		
		for(int i=0; i <=People_Count - 1; i++) {
			
			if(PeopleInfo[i][0].equals(name)) {
				for(int k=i; k<=People_Count - 1; k++) {
					for(int j=0; j<5; j++) {
						PeopleInfo[i][j] = PeopleInfo[i+1][j];
						cut=1;
					}
				}
			}else {
				System.out.println("입력하신 회원이 없습니다.");
			}
		}
		if(cut == 1) {
			System.out.println("회원이 삭제되었습니다.");
			cut = 0;
			People_Count--;
			}
			title();
		}
	}
	
	@Override
	public void stop() {
		System.out.println("정말 종료하시겠습니까? (Y/N)");
		String YN = sc.next();
		
		if(YN.equals("Y")||YN.equals("y")) {
			System.out.println("프로그램을 종료합니다.");
		}else if(YN.equals("N")||YN.equals("n")) {
			title();
		}else {
			System.out.println("잘못입력하셨습니다. 다시 입력해 주세요.");
			title();
		}
		
	}

	@Override
	public void inwon() {
		// TODO Auto-generated method stub
		
	}	
}

public class CustomerSample_T {

	public static void main(String[] args) {
		Customer cus = new Customer();
		cus.title();

		
		
	}

}
