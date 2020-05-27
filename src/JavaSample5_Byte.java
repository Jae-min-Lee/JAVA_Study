
public class JavaSample5_Byte {

	public static void main(String[] args) {
		// Byte : 영문자 한자를 의미합니다. (Java의 가장 최저 단위)
		
		byte name = 'h';
		byte name2 = 'y';
		byte name3 = 'u';
		byte name4 = 'n';
		
		System.out.println((char)name);//h
		System.out.println((char)name2);//y
		System.out.println((char)name3);//u
		System.out.println((char)name4);//n

		String name5 = "hyun";
		
		System.out.println(name5);
		
		//unicode
		
		char value = '\uac00';//가
		char value2 = '\uac10';//감
		System.out.println("유니코드는 = " + value);//가
		System.out.println("유니코드는 = " + value2);//감
		
		
	}

}
