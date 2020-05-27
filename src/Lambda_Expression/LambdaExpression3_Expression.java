package Lambda_Expression;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * 
 */

class Student {

	private String name;
	private int score;

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
}

public class LambdaExpression3_Expression {

	public static void main(String[] args) {
		// 2의 배수를 구하세요.
//		long count = Arrays.stream(new int[] { 10, 20, 30, 40, 50 })
//
//		.filter(n -> n % 2 == 0).count();
//		System.out.println("갯수 : " + count);
//
//		// 2의 배수의 합계를 구하세요.
//		Double aver = Arrays.stream(new int[] { 10, 20, 30, 40, 50 })
//
//		.average().getAsDouble();
//		System.out.println("평균 : " + aver);
//
//		// 이 데이터 중에서 가장 큰 값을 구하세요.
//		int max = Arrays.stream(new int[] { 10, 20, 30, 40, 50 })
//
//		.filter(n -> n % 2 == 0).max().getAsInt();
//		System.out.println("가장 큰 값 : " + max);
//
//		// 이 데이터 중에서 가장 작은 값을 구하세요.
//		int min = Arrays.stream(new int[] { 10, 20, 30, 40, 50 })
//				.filter(n -> n % 2 == 0).min().getAsInt();
//		System.out.println("가장 작은 값 : " + min);
//
//		// 3의 배수이면서 첫번째 데이터가 누구일까요?
//		int first = Arrays.stream(new int[] { 10, 20, 30, 40, 50 })
//				.filter(n -> n % 3 == 0).findFirst().getAsInt();
//		System.out.println("3의 배수이면서 첫번째 데이터 : " + first);

		// 문제 > Student 클래스에서 다음과 같은 데이터를 입력 받아서
		// 람다식으로 처리하여 결과를 구해주세요.
		// 총점, 평균, 최고점수, 최저점수를 구하여 출력합니다.
		// sample 데이터> 홍길동, 100

		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하여 주십시오");
		String name = sc.next();
		System.out.println("점수를 입력하여 주십시오.");
		int score = sc.nextInt();
		List<Student> stdlist = Arrays.asList(new Student(name, score),
				new Student(name, score), new Student(name, score));

		int sum = stdlist.stream().mapToInt(Student::getScore).sum();

		double aver = stdlist.stream().mapToDouble(Student::getScore).average()
				.getAsDouble();
		
		System.out.println("총점 : " + sum + "   " + "평균 : " + aver);
		
		int max = stdlist.stream().mapToInt(Student::getScore).max().getAsInt();
		
		int min = stdlist.stream().mapToInt(Student::getScore).min().getAsInt();

		System.out.println("최고점 : " + max + "   " + "최저점 : " + min);
	}
}