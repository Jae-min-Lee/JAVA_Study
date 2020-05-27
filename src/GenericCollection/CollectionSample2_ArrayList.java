package GenericCollection;
/*
 * 국,영,수 점수를 입력 받아서 저장합니다.
 * 총점을 구하세요.
 * 저장 : setter, <T> 이용
 */

import java.util.Scanner;

public class CollectionSample2_ArrayList <T>{

	T value;
	
	public void setData(T value){
		this.value = value;
	}
	
	public T getData(){
		return value;
	}
	
	public static void main(String[] args) {
		
		CollectionSample2_ArrayList<Integer> csal = new CollectionSample2_ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수 입력 : ");
		int kor = sc.nextInt();
		csal.setData(kor);
		System.out.println("영어 점수 입력 : ");
		int eng = sc.nextInt();
		csal.setData(eng);
		System.out.println("수학 점수 입력 : ");
		int mat = sc.nextInt();
		csal.setData(mat);
		
		System.out.println(kor + eng + mat);
	}
}
