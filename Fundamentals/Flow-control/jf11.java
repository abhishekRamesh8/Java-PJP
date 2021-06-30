import java.util.*;

public class jf11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char colour = sc.next().charAt(0);
		switch (colour) {
		case 'R':
			System.out.println("Red");
			break;
		case 'B':
			System.out.println("Blue");
			break;
		case 'G':
			System.out.println("Geen");
			break;
		case 'O':
			System.out.println("Orange");
			break;
		case 'Y':
			System.out.println("Yellow");
			break;
		case 'W':
			System.out.println("White");
			break;
		default:
			System.out.println("Invalid Code");
		}
		sc.close();
	}
}
