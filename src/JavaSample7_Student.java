import java.util.*;

public class JavaSample7_Student {

	private static String haircolor;
	private static String gender;
	private static String tall;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력해주세요 : ");
		
		String 서준 = sc.next();
		
		System.out.println(haircolor);
		
		JavaSample7_Student eunju = new JavaSample7_Student();
		JavaSample7_Student jieun = new JavaSample7_Student();
		JavaSample7_Student seojun = new JavaSample7_Student();

		System.out.println("Seojun : ");

		seojun.haircolor = "black";
		seojun.gender = "man";
		seojun.tall = "172cm";

		System.out.println(seojun.haircolor);
		System.out.println(seojun.gender);
		System.out.println(seojun.tall);

		System.out.println(" ");

		System.out.println(JavaSample7_Student.haircolor);
		System.out.println(JavaSample7_Student.gender);
		System.out.println(JavaSample7_Student.tall);

		System.out.println("---------------------");

		System.out.println("Jieun : ");

		jieun.haircolor = "brown";
		jieun.gender = "women";
		jieun.tall = "167cm";

		System.out.println(jieun.haircolor);
		System.out.println(jieun.gender);
		System.out.println(jieun.tall);

		System.out.println(" ");

		System.out.println(JavaSample7_Student.haircolor);
		System.out.println(JavaSample7_Student.gender);
		System.out.println(JavaSample7_Student.tall);

		System.out.println("---------------------");

		System.out.println("Eunju : ");

		eunju.haircolor = "Yellow";
		eunju.gender = "women";
		eunju.tall = "175cm";

		System.out.println(eunju.haircolor);
		System.out.println(eunju.gender);
		System.out.println(eunju.tall);

		System.out.println(" ");

		System.out.println(JavaSample7_Student.haircolor);
		System.out.println(JavaSample7_Student.gender);
		System.out.println(JavaSample7_Student.tall);

	}

}
