public class jf17 {
	public static void main(String[] args) {
		if (args.length != 0) {

			byte num = (byte) Integer.parseInt(args[0]);
			int c = 1;
			if (num > 1) {
				for (int i = 2; i < num; i++) {
					if (num % i == 0) {
						System.out.printf("%d is not a Prime", num);
						break;
					}
					c = i;
				}
				if (c == num - 1) {
					System.out.printf("%d is a Prime number", num);
				}
			} else {
				System.out.printf("%s is neither prime nor composite", args[0]);
			}
		} else {
			System.out.println("Enter an Integer number");
		}
	}
}
