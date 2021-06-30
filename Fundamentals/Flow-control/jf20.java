import java.util.Scanner;

public class jf20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] rev = sc.next().toCharArray();
		int i = rev.length - 1;
		while (i >= 0) {
			System.out.print(rev[i]);
			i--;
		}
		sc.close();
	}
}
