package GenericCollection_T;

import java.util.Scanner;

public class CollectionSample2_ArrayList_T <T>{


	T data;
	
	public void setData(T value) {
		data  = value;
	}
	
	public T getData() {
		return data;
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		CollectionSample2_ArrayList_T<Integer> csal1 = new CollectionSample2_ArrayList_T<Integer>();
		CollectionSample2_ArrayList_T<Integer> csal2 = new CollectionSample2_ArrayList_T<Integer>();
		CollectionSample2_ArrayList_T<Integer> csal3 = new CollectionSample2_ArrayList_T<Integer>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수 입력 : ");
		int kor = sc.nextInt();
		csal1.setData(kor);
		System.out.println("영어점수 입력 : ");
		int eng = sc.nextInt();
		csal2.setData(eng);
		System.out.println("수학점수 입력 : ");
		int mat = sc.nextInt();
		csal3.setData(mat);
		
		System.out.println(csal1.getData());//
		System.out.println(csal2.getData());//
		System.out.println(csal3.getData());//
		
		int k1 = csal1.getData();
		int e1 = csal2.getData();
		int m1 = csal3.getData();
		
		System.out.println("총점: " + (k1+e1+m1));//
	}

}