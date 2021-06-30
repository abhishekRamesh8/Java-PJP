
public class jf6 {
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("No values");
		} else {
			System.out.printf(String.join(",", args));
		}
	}
}
