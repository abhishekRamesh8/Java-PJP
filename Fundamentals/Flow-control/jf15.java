import java.util.*;

public class jf15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte num = sc.nextByte();
		int c = 1;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("Not Prime");
				break;
			}
			c = i;
		}
		if (c == num - 1) {
			System.out.println("Prime");
		}
		sc.close();
	}
}
