public class jf9 {
	public static void main(String[] args) {
		String gender = args[0];
		short age = Short.parseShort(args[1]);
		System.out.println(gender);
		System.out.println(age);
		if (gender.equals("male")) {
			if (age >= 1 && age <= 58) {
				System.out.println("Interest:8.4%");
			} else {
				System.out.println("Interest:10.5%");
			}
		} else {
			if (age >= 1 && age <= 58) {
				System.out.println("Interest:8.2%");
			} else {
				System.out.println("Interest:9.2%");
			}
		}
	}
}
