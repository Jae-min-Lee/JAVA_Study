package Inher1;

/*
 * 전달인자 값이 존재하고, 반환값은 있습니다.
 */
public class Adder extends Subtract{
	
	public static int adder(int x, int y){
		
		int sum = 0;
		
		sum = x + y;
		
		return sum;
		
	}

}
