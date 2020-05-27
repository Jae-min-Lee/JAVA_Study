package Inher2_Teacher;

import java.util.Scanner;

/* 이름과 부서와 연봉, 수당을 입력 받아서 연산하는 프로그램을 작성
 * 1.상속관계 이용
 * 2.setter/getter 이용
 * 3.데이터 저장(DTO) : Personal클래스 이용
 * 4.연산은 기존 클래스인 Oper를 사용하되, 상속받아서 사용합니다.
 * - final : 기존 데이터의 값을 변경 할 수 없다.
 * - static : 데이터 공유
 * - int OFFICER_COUNT  = 3; : 
 * 
 * 이건 1차원
 */

public class InherSample9_SalatyMain_T extends Information {

	public static void main(String[] args) {

		// 데이터 저장
		for (int i = 0; i < info.length; i++) {
			info[i] = new Information();
			info[i].inputInformation();
			info[i].printInformation();

		}

	}

}