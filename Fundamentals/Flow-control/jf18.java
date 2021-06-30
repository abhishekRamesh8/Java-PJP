
import java.util.Scanner;

public class jf18 {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		char[] num = sc.next().toCharArray();
		int total = 0;
		for (int i = 0; i < num.length; i++) {
			total = total + Character.getNumericValue(num[i]);
//		System.out.println(((Object)total).getClass().getSimpleName());;
		}
		System.out.println(total);
		sc.close();

	}
}
