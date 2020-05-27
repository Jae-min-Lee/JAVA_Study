package MembershipProgram_200427;

import java.util.Scanner;

interface CustomerSample3 {

	int MaxPeople_count = 20;

	public abstract void title();

	public abstract void inwon();

	public abstract void join();

	public abstract void view();

	public abstract void update();

	public abstract void delete();

	public abstract void stop();

}

 class CustomerSample4 implements CustomerSample3 {

	String Output[] = new String[] { "이름 : ", "나이 : ", "E-mail : ", "전화번호 : ",
			"주소 : " };
	int cut;
	int number = 0;// 메뉴 선택
	int People_count = 0;
	Scanner sc = new Scanner(System.in);
	String PeopleInfo[][] = new String[MaxPeople_count][5];
	private int inwon = 0;

	@Override
	public void title() {

		System.out.println("<------- 다음의 메뉴 중 하나를 선택 하시오. -------->");
		System.out.println("<-------------- 1. 회원가입 --------------->");
		System.out.println("<-------------- 2. 회원목록 보기 ------------>");
		System.out.println("<-------------- 3. 회원정보 수정 ------------>");
		System.out.println("<-------------- 4. 회원정보 삭제 ------------>");
		System.out.println("<-------------- 2. 프로그램 종료 ------------>");
		System.out.println("<--------------------------------------->");
		number = sc.nextInt();

		inwon();

	}

	@Override
	public void inwon() {

		if (number == 1) {
			if (People_count <= MaxPeople_count) {
				join();
			} else
				System.out.println("<--------- 가입인원이 초과되었습니다. ---------->");
		} else if (number == 2) {
			view();
		} else if (number == 3) {
			update();
		} else if (number == 4) {
			delete();
		} else {
			stop();
		}

	}

	@Override
	public void join() {

		System.out.println("이름 : ");
		String name = sc.next();
		System.out.println("나이 : ");
		String age = sc.next();
		System.out.println("E-mail : ");
		String email = sc.next();
		System.out.println("전화번호 : ");
		String p_number = sc.next();
		System.out.println("주소 : ");
		String adress = sc.next();

		PeopleInfo[People_count][0] = name;
		PeopleInfo[People_count][1] = age;
		PeopleInfo[People_count][2] = email;
		PeopleInfo[People_count][3] = p_number;
		PeopleInfo[People_count][4] = adress;

		People_count++;
		System.out.println("<---------- 가입이 완료되었습니다.. ----------->");
		title();

	}

	@Override
	public void view() {

		if (People_count++ == 0) {
			System.out.println("<---------- 등록된 회원이 없습니다. ------------>");
		} else {
			System.out.println("<------- 검색하실 회원명을 입력 해주세요. --------->");
			String name = sc.next();
			String Output[] = new String[] { "이름 : ", "나이 : ", "E-mail : ",
					"전화번호 : ", "주소 : " };

			for (int i = 0; i < People_count - 1; i++) {
				if (PeopleInfo[i][0].equals(name)) {
					for (int j = 0; j < 5; j++) {
						System.out.println(Output[j] + PeopleInfo[i][j]);
					}
				} else {
					System.out
							.println("<------ 해당 이름의 회원이 존재하지 않습니다. ------->");
				}
			}
			title();
		}
	}

	@Override
	public void update() {

		if (People_count == 0) {
			System.out.println("<---------- 등록된 회원이 없습니다. ------------>");
		} else {
			System.out.println("<------- 수정하실 회원명을 입력 해주세요. --------->");
			String name = sc.next();

			for (int i = 0; i <= People_count - 1; i++) {

				if (PeopleInfo[i][0].equals(name)) {

					System.out.println("나이 : ");
					String age = sc.next();
					System.out.println("E-mail : ");
					String email = sc.next();
					System.out.println("전화번호 : ");
					String p_number = sc.next();
					System.out.println("주소 : ");
					String adress = sc.next();

					PeopleInfo[i][1] = age;
					PeopleInfo[i][2] = email;
					PeopleInfo[i][3] = p_number;
					PeopleInfo[i][4] = adress;

				} else {
					System.out
							.println("<--------- 입력하신 회원이 없습니다. ------------>");
				}
			}
			System.out.println();
		}
		title();
	}

	@Override
	public void delete() {
		System.out.println("<------- 삭제하실 회원명을 입력 해주세요. --------->");
		String name = sc.next();
		for (int i = 0; i <= People_count - 1; i++) {

			if (PeopleInfo[i][0].equals(name)) {

				for (int k = i; k <= People_count - 1; k++) {
					for (int j = 0; j <= 5; j++) {
						PeopleInfo[i][j] = PeopleInfo[i + 1][j];
					}
				}
				title();
			} else {
				System.out.println("<--------- 입력하신 회원이 없습니다. ------------>");
			}
		}
		if (cut == 1) {
			System.out.println("<---------- 회원이 삭제 되었습니다. ------------>");
			cut = 0;
			People_count--;
		}
		title();
	}

	@Override
	public void stop() {
		System.out.println("<---------- 정말 종료 하시겠습니까? ------------>");
		System.out.println("<------------ (  y  /  n  )-------------->");
		String YN = sc.next();

		if (YN.equals("Y") || YN.equals("y")) {
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		} else if (YN.equals("N") || YN.equals("n")) {
			title();
		} else {
			System.out.println("<----------- 잘못 입력 하셨습니다. ------------>");
			title();
		}
	}

}