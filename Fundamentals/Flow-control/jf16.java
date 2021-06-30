
public class jf16 {
	public static void main(String[] args) {
		for (short i = 10; i <= 99; i++) {
			if (i % 2 != 0) {
				if (i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
					System.out.println(i);
				}
			}
		}
	}
}