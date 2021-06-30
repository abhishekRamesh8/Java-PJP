import java.util.*;

public class jf8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char var = sc.next().charAt(0);
		if (Character.isAlphabetic(var)) {
			System.out.println("Alphabet");
		} else if (Character.isDigit(var)) {
			System.out.println("Digit");
		} else {
			System.out.println("Special");
		}
		sc.close();
	}

}
