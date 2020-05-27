package condition;

public class Exercise1_10 {
	public static void main(String[] args) {
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				if (i == j) {
					continue;
				}
				System.out.println(" i ==" + i + " j==" + j);

			}

		}
	}
}