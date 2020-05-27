public class JavaSample6_class {
	// field area
	private static String tullength; // class변수, 5cm
	private static String tulage; // 7살
	private static String tulkey; // 70cm

	public static void main(String[] args) {
		//

		JavaSample6_class prince = new JavaSample6_class();
		//객체명. 속성명(or class변수)

		prince.tullength = "5cm";
		prince.tulage = "7살";
		prince.tulkey = "70cm";

		System.out.println(prince.tullength);
		System.out.println(prince.tulage);
		System.out.println(prince.tulkey);
		System.out.println("-------------------------------");
		//class명.속성명(or class변수)
		System.out.println(JavaSample6_class.tullength);
		System.out.println(JavaSample6_class.tulage);
		System.out.println(JavaSample6_class.tulkey);

	}

}
