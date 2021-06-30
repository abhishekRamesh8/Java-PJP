import java.util.Scanner;

public class jf10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char var = sc.next().charAt(0);
		if (Character.isLowerCase(var)) {
			System.out.println(Character.toUpperCase(var));
		} else {
			System.out.println(Character.toLowerCase(var));
		}
		sc.close();
	}
}
