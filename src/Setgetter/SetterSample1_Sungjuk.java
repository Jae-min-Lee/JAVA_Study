package Setgetter;

import java.util.Scanner;

/*
 * 국어(kor), 영어(eng), 수학(mat)점수 가 존재합니다.
 * 총점(total), 평균(aver)을 구하고 출력합니다.
 * setter 이용하여 데이터를 저장하고,
 * getter 이용하여 데이터를 출력하세요.
 */
class Program {

	private int kor;
	private int eng;
	private int mat;

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int opration1() {

		int total = kor + eng + mat;
		return total;
	}

	public int opration2() {

		int total = kor + eng + mat;
		int aver = total / 3;
		return aver;
	}
}

public class SetterSample1_Sungjuk {

	public static void main(String[] args) {

		int kor, eng, mat;

		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요.");
		kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		mat = sc.nextInt();

		Program p = new Program();

		p.setKor(kor);
		p.setEng(eng);
		p.setMat(mat);

		System.out.println("총점은 " + p.opration1() + "점 이며, 평균은 "
				+ p.opration2() + "점 입니다.");
	}
}