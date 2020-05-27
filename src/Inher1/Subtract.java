package Inher1;
/*
 * 전달인자 값이 존재하고, 반환값은 없습니다.
 */
public class Subtract extends Multiply {
	
	public static void subtract(int x2, int y2){
		
		int sub = 0;
		
		sub = x2 - y2;
		System.out.println("감산 : " + sub);//
	}
}
